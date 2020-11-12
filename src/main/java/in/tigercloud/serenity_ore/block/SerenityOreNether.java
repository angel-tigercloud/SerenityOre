package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.lib.RngHelper;
import net.minecraft.block.material.Material;

import java.util.Random;

public class SerenityOreNether extends SerenityOre {
	public static final int DROPS_MAX_NORMAL = 7;
	public static final int DROPS_MIN_NORMAL = 4;

	/**
	 * AbstractBlock constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 */
	public SerenityOreNether(String name, Material material) {
		super(name, material);
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return RngHelper.blockQuantityDroppedWithBonus(fortune, random, FORTUNE_MULTIPLIER, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}

	@Override
	public int quantityDropped(Random random) {
		return RngHelper.blockQuantityDropped(random, DROPS_MIN_NORMAL, DROPS_MAX_NORMAL);
	}
}
