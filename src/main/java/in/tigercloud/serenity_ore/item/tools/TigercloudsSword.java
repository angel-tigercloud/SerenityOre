package in.tigercloud.serenity_ore.item.tools;

import in.tigercloud.serenity_ore.lib.ChatFormat;
import in.tigercloud.serenity_ore.lib.Helpers;
import in.tigercloud.serenity_ore.lib.OreDict;
import in.tigercloud.serenity_ore.lib.RngHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Tigercloud's Sword
 */
public class TigercloudsSword extends AbstractSword {
	/**
	 * AbstractSword constructor
	 *
	 * @param name     Name of the Item
	 * @param material Material of the Tool
	 */
	public TigercloudsSword(String name, ToolMaterial material) {
		super(name, material);

		setNoRepair();
		setOreDictName(OreDict.SWORD_TIGERCLOUD);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ChatFormat.AQUA + I18n.format(getUnlocalizedName() + ".lore1") + ChatFormat.RESET);

		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if(target.attackable() && target instanceof EntityPlayer) {
			attacker.setFire(10);
			attacker.addPotionEffect(new PotionEffect(MobEffects.GLOWING, Helpers.secToTicks(10), 0));

			if(attacker.world.isRemote) {
				attacker.sendMessage(new TextComponentTranslation(
						getUnlocalizedName() + ".player_attack.message"
				).setStyle(
						new Style().setColor(TextFormatting.RED).setItalic(true)
				));
			}

			stack.damageItem(stack.getMaxDamage() / 10, attacker);
		} else if(target.attackable() && target.isCreatureType(EnumCreatureType.MONSTER, false)) {
			if(RngHelper.chance(25))
				target.setFire(10);
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
