package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.common.ModItems;
import in.tigercloud.serenity_ore.lib.LightLevel;
import in.tigercloud.serenity_ore.lib.RngHelper;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Rainbow Glass Block
 */
public class RainbowGlass extends AbstractBlockGlass {
	public static int DROPS_MAX_NORMAL = 1;
	public static int DROPS_MIN_NORMAL = 0;

	/**
	 * AbstractBlockGlass constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 * @param ignoreSimilarity Ignore similarity and render each block
	 */
	public RainbowGlass(String name, Material material, boolean ignoreSimilarity) {
		super(name, material, ignoreSimilarity);

		setLightLevel(LightLevel.FURNACE);
		setLightOpacity(0);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.SERENITY_DUST;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return RngHelper.blockQuantityDroppedWithBonus(fortune, random, 0, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}

	@Override
	public int quantityDropped(Random random) {
		return RngHelper.blockQuantityDropped(random, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(this);
	}
}
