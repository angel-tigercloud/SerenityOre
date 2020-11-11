package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.lib.BlockHardness;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Sugar Block
 */
public class SugarBlock extends AbstractBlockFalling {
	/**
	 * AbstractBlock constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 */
	public SugarBlock(String name, Material material) {
		super(name, material);

		setHardness(BlockHardness.SAND);
		setSoundType(SoundType.SAND);
	}
}
