package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.lib.BlockHardness;
import in.tigercloud.serenity_ore.lib.HarvestLevel;
import in.tigercloud.serenity_ore.lib.OreDict;
import in.tigercloud.serenity_ore.lib.ToolStrings;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Serenity Ore
 */
public class SerenityOre extends AbstractBlock {
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
	}
}
