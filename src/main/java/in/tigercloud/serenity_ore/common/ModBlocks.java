package in.tigercloud.serenity_ore.common;

import in.tigercloud.serenity_ore.block.SerenityOre;
import in.tigercloud.serenity_ore.block.SerenityOreEnd;
import in.tigercloud.serenity_ore.block.SerenityOreNether;
import in.tigercloud.serenity_ore.block.SugarBlock;
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
}
