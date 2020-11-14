package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.common.ModItems;
import in.tigercloud.serenity_ore.lib.*;
import in.tigercloud.serenity_ore.lib.vanilla.BlockHardness;
import in.tigercloud.serenity_ore.lib.vanilla.HarvestLevel;
import in.tigercloud.serenity_ore.lib.vanilla.LightLevel;
import in.tigercloud.serenity_ore.lib.vanilla.ToolStrings;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

/**
 * Serenity Ore
 */
public class SerenityOre extends AbstractBlock {
	public static int FORTUNE_MULTIPLIER = 1;
	public static int DROPS_MAX_NORMAL = 2;
	public static int DROPS_MIN_NORMAL = 1;

	/**
	 * AbstractBlock constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 */
	public SerenityOre(String name, Material material) {
		super(name, material);

		setHardness(BlockHardness.ORE);
		setHarvestLevel(ToolStrings.PICKAXE, HarvestLevel.DIAMOND);
		setSoundType(SoundType.GLASS);
		setOreDictName(OreDict.SERENITY_ORE);
		setLightLevel(LightLevel.REDSTONE_TORCH);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.SERENITY_DUST;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return RngHelper.blockQuantityDroppedWithBonus(fortune, random, FORTUNE_MULTIPLIER, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}

	@Override
	public int quantityDropped(Random random) {
		return RngHelper.blockQuantityDropped(random, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}

	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
			return 1 + RANDOM.nextInt(5);
		}

		return 0;
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(this);
	}
}
