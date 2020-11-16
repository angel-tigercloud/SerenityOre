package in.tigercloud.serenity_ore.item.tools;

import in.tigercloud.serenity_ore.lib.ChatFormat;
import in.tigercloud.serenity_ore.lib.Helpers;
import in.tigercloud.serenity_ore.lib.OreDict;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Tigerclouds Pickaxe
 */
public class TigercloudsPickaxe extends AbstractPickaxe {
	/**
	 * AbstractPickaxe constructor
	 *
	 * @param name     Name of the Item
	 * @param material Material of the Tool
	 */
	public TigercloudsPickaxe(String name, ToolMaterial material) {
		super(name, material);

		setNoRepair();
		setOreDictName(OreDict.PICKAXE_TIGERCLOUD);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ChatFormat.AQUA + I18n.format(getUnlocalizedName() + ".lore1") + ChatFormat.RESET);
		tooltip.add(ChatFormat.LIGHT_PURPLE + I18n.format(getUnlocalizedName() + ".lore2") + ChatFormat.RESET);

		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		FoodStats foodStats = playerIn.getFoodStats();

		// Heals the Player and restores all food, but destroys the item
		if(playerIn.getMaxHealth() != playerIn.getHealth() || foodStats.needFood()) {
			// Heal the Player & adds protective effects
			playerIn.heal(playerIn.getMaxHealth() - playerIn.getHealth());
			playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, Helpers.secToTicks(20), 1));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, Helpers.secToTicks(20), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, Helpers.secToTicks(20), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.SATURATION, Helpers.secToTicks(60), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.GLOWING, Helpers.secToTicks(60), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE, Helpers.secToTicks(20), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, Helpers.secToTicks(20), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, Helpers.secToTicks(20), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, Helpers.secToTicks(60), 0));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, Helpers.secToTicks(120), 0));
			playerIn.setFire(5);

			// Set Food Level full
			foodStats.setFoodLevel(new FoodStats().getFoodLevel());
			if(worldIn.isRemote)
				foodStats.setFoodSaturationLevel(new FoodStats().getSaturationLevel());

			// Inform the Player
			if(playerIn.world.isRemote) {
				playerIn.sendMessage(new TextComponentTranslation(
						getUnlocalizedName() + ".heal_action.message"
				).setStyle(
						new Style().setColor(TextFormatting.GREEN).setItalic(true)
				));
			}

			// Destroys the Item
			playerIn.getHeldItem(handIn).damageItem(getMaxDamage(playerIn.getHeldItem(handIn)) + 1, playerIn);
		} else if(playerIn.world.isRemote) {
			playerIn.sendMessage(new TextComponentTranslation(
					getUnlocalizedName() + ".heal_action_fail.message"
			).setStyle(
					new Style().setColor(TextFormatting.RED).setItalic(true)
			));
		}

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if(target.attackable() && !(target instanceof EntityPlayer)) {
			target.setFire(10);
			stack.damageItem(100, target);
		} else if(target instanceof EntityPlayer && target.getHealth() < target.getMaxHealth()) {
			if(target.world.isRemote) {
				target.sendMessage(new TextComponentTranslation(
						getUnlocalizedName() + ".heal_other_target_action.message"
				).setStyle(
						new Style().setColor(TextFormatting.RED).setItalic(true)
				));
			}

			if(attacker.world.isRemote) {
				attacker.sendMessage(new TextComponentTranslation(
						getUnlocalizedName() + ".heal_other_attacker_action.message", target.getName()
				).setStyle(
						new Style().setColor(TextFormatting.RED).setItalic(true)
				));
			}

			target.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, Helpers.secToTicks(10), 1));
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, Helpers.secToTicks(10), 1));
			stack.damageItem(stack.getMaxDamage() / 4 + 1, target);

			return true;
		}

		return super.hitEntity(stack, target, attacker);
	}

	@Override
	public int getItemEnchantability() {
		return 0;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return false;
	}
}
