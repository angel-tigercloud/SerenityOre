package in.tigercloud.serenity_ore.block;

import net.minecraft.block.material.Material;

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
}
