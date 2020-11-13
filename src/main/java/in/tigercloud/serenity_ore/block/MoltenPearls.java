package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.common.ModItems;
import in.tigercloud.serenity_ore.lib.RngHelper;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

/**
 * Molten Pearls
 */
public class MoltenPearls extends RainbowGlass {
	public static int DROPS_MAX_NORMAL = 6;
	public static int DROPS_MIN_NORMAL = 2;

	/**
	 * AbstractBlockGlass constructor
	 *
	 * @param name             Name of the Block
	 * @param material         Material of the Block
	 * @param ignoreSimilarity Ignore similarity and render each block
	 */
	public MoltenPearls(String name, Material material, boolean ignoreSimilarity) {
		super(name, material, ignoreSimilarity);
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		int drops = RngHelper.blockQuantityDroppedWithBonus(fortune, random, 1, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);

		return Math.min(drops, DROPS_MAX_NORMAL);
	}

	@Override
	public int quantityDropped(Random random) {
		return RngHelper.blockQuantityDropped(random, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.SERENITY_PEARL;
	}

	@Override
	public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
			return 1 + RANDOM.nextInt(5);
		}

		return 0;
	}
}
