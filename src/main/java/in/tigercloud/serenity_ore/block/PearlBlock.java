package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.lib.BlockHardness;
import in.tigercloud.serenity_ore.lib.HarvestLevel;
import in.tigercloud.serenity_ore.lib.LightLevel;
import in.tigercloud.serenity_ore.lib.ToolStrings;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Pearl Block
 */
public class PearlBlock extends AbstractBlock {
	/**
	 * AbstractBlock constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 */
	public PearlBlock(String name, Material material) {
		super(name, material);
		setHardness(BlockHardness.IRON_BLOCK * 2);
		setHarvestLevel(ToolStrings.PICKAXE, HarvestLevel.DIAMOND);
		setSoundType(SoundType.METAL);
		setLightLevel(LightLevel.REDSTONE_ORE);
	}
}
