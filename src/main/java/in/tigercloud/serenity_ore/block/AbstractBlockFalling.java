package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.Reference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

import java.util.Objects;

/**
 * FallingBlock Base Class for easier creation
 */
public abstract class AbstractBlockFalling extends BlockFalling {
	/**
	 * AbstractBlock constructor
	 *
	 * @param name Name of the Block
	 * @param material Material of the Block
	 */
	public AbstractBlockFalling(String name, Material material) {
		super(material);

		this.setRegistryName(Reference.MOD_ID, name);
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());
	}
}
