package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.lib.*;
import in.tigercloud.serenity_ore.lib.vanilla.BlockHardness;
import in.tigercloud.serenity_ore.lib.vanilla.HarvestLevel;
import in.tigercloud.serenity_ore.lib.vanilla.ToolStrings;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

/**
 * Sugar Block
 */
public class SugarBlock extends AbstractBlockFalling {
	/**
	 * AbstractBlockFalling constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 */
	public SugarBlock(String name, Material material) {
		super(name, material);

		setHardness(BlockHardness.SAND);
		setSoundType(SoundType.SAND);
		setHarvestLevel(ToolStrings.SHOVEL, HarvestLevel.WOOD);
		setOreDictName(OreDict.SUGAR_BLOCK);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.SUGAR;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return 9;
	}

	@Override
	public int quantityDropped(Random random) {
		return 9;
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(this);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ChatFormat.GRAY + "Sweet >w<" + ChatFormat.RESET);

		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
