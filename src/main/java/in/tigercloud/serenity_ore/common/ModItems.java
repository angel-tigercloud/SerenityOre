package in.tigercloud.serenity_ore.common;

import in.tigercloud.serenity_ore.item.RainbowIngot;
import in.tigercloud.serenity_ore.item.SerenityDust;
import in.tigercloud.serenity_ore.item.SerenityPearl;
import in.tigercloud.serenity_ore.item.tools.TigercloudsSword;
import in.tigercloud.serenity_ore.item.tools.ToolMaterial;
import in.tigercloud.serenity_ore.item.tools.TigercloudsPickaxe;
import in.tigercloud.serenity_ore.lib.Names;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains all Mod-the Items as Reference
 */
public class ModItems {
	// New Blocks should be added via the Constructor of the Block
	public static final List<Item> ITEMS = new ArrayList<>();

	public static final Item SERENITY_DUST = new SerenityDust(Names.ITEM_SERENITY_DUST);
	public static final Item SERENITY_PEARL = new SerenityPearl(Names.ITEM_SERENITY_PEARL);
	public static final Item RAINBOW_INGOT = new RainbowIngot(Names.ITEM_RAINBOW_INGOT);
	public static final Item TIGERCLOUDS_PICKAXE = new TigercloudsPickaxe(Names.TOOL_TIGERCLOUDS_PICKAXE, ToolMaterial.RAINBOW_METAL);
	public static final Item TIGERCLOUDS_SWORD = new TigercloudsSword(Names.WEAPON_TIGERCLOUDS_SWORD, ToolMaterial.RAINBOW_METAL);
}
