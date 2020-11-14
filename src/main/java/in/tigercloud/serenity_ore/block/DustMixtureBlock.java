package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.lib.*;
import in.tigercloud.serenity_ore.lib.vanilla.BlockHardness;
import in.tigercloud.serenity_ore.lib.vanilla.HarvestLevel;
import in.tigercloud.serenity_ore.lib.vanilla.LightLevel;
import in.tigercloud.serenity_ore.lib.vanilla.ToolStrings;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Dust Mixture Block
 */
public class DustMixtureBlock extends AbstractBlockFalling {
	/**
	 * AbstractBlockFalling constructor
	 *
	 * @param name     Name of the Block
	 * @param material Material of the Block
	 */
	public DustMixtureBlock(String name, Material material) {
		super(name, material);

		setHardness(BlockHardness.SAND);
		setSoundType(SoundType.SAND);
		setHarvestLevel(ToolStrings.SHOVEL, HarvestLevel.WOOD);
		setOreDictName(OreDict.DUST_MIXTURE_BLOCK);
		setLightLevel(LightLevel.REDSTONE_TORCH);
	}
}
