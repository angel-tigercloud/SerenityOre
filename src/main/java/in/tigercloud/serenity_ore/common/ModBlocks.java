package in.tigercloud.serenity_ore.common;

import in.tigercloud.serenity_ore.block.*;
import in.tigercloud.serenity_ore.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains all Mod-Blocks as Reference
 */
public class ModBlocks {
	// New Blocks should be added via the Constructor of the Block
	public static final List<Block> BLOCKS = new ArrayList<>();

	// Block Members
	public static final Block SERENITY_ORE = new SerenityOre(Names.BLOCK_SERENITY_ORE, Material.ROCK);
	public static final Block SERENITY_ORE_NETHER = new SerenityOreNether(Names.BLOCK_SERENITY_ORE_NETHER, Material.ROCK);
	public static final Block SERENITY_ORE_END = new SerenityOreEnd(Names.BLOCK_SERENITY_ORE_END, Material.ROCK);
	public static final Block SUGAR_BLOCK = new SugarBlock(Names.BLOCK_SUGAR, Material.SAND);
	public static final Block RAINBOW_GLASS = new RainbowGlass(Names.BLOCK_GLASS_RAINBOW, Material.GLASS, false);
	public static final Block MOLTEN_PEARLS = new MoltenPearls(Names.BLOCK_MOLTEN_PEARLS, Material.GLASS, false);
	public static final Block PEARL_BLOCK = new PearlBlock(Names.BLOCK_PEARL, Material.IRON);
}
