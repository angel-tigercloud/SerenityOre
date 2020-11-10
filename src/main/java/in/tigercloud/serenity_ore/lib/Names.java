package in.tigercloud.serenity_ore.lib;

import in.tigercloud.serenity_ore.SerenityOre;

/**
 * Contains all Names of Items/Blocks/Tool etc
 *
 * Also helpers for unlocalized Strings
 */
public class Names {
	// Items

	// Blocks

	// ----------------------------------------------------------
	// Helper methods below
	// ----------------------------------------------------------

	/**
	 * Get the unlocalized name of an Item
	 *
	 * @param itemName Normal Name of the Item
	 * @return Unlocalized Item-Name-String
	 */
	public static String getItemNameUnlocalized(String itemName) {
		return "item." + SerenityOre.RESOURCE_PREFIX + itemName;
	}

	/**
	 * Get the unlocalized name of a Block
	 *
	 * @param blockName Normal Name of the Block
	 * @return Unlocalized Item-Name-String
	 */
	public static String getBlockNameUnlocalized(String blockName) {
		return "tile." + SerenityOre.RESOURCE_PREFIX + blockName;
	}
}
