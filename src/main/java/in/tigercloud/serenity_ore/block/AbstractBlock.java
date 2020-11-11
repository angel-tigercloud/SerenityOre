package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.Objects;

/**
 * Block Base Class for easier creation
 */
public abstract class AbstractBlock extends Block {
	/**
	 * AbstractBlock constructor
	 *
	 * @param name Name of the Block
	 * @param material Material of the Block
	 */
	public AbstractBlock(String name, Material material) {
		super(material);

		this.setRegistryName(Reference.MOD_ID, name);
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());
	}
}
