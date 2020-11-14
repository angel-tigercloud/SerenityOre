package in.tigercloud.serenity_ore.lib;

import in.tigercloud.serenity_ore.Reference;

/**
 * Contains all Names of Items/Blocks/Tool etc
 *
 * Also helpers for unlocalized Strings
 */
public class Names {
	// Materials
	public static final String MATERIAL_RAINBOW_METAL = "rainbow_metal";

	// Items
	public static final String ITEM_SERENITY_DUST = "serenity_dust";
	public static final String ITEM_SERENITY_PEARL = "serenity_pearl";
	public static final String ITEM_RAINBOW_INGOT = "rainbow_ingot";

	// Weapons
	public static final String WEAPON_TIGERCLOUDS_SWORD = "tigerclouds_sword";

	// Tools
	public static final String TOOL_TIGERCLOUDS_PICKAXE = "tigerclouds_pickaxe";

	// Blocks
	public static final String BLOCK_SERENITY_ORE = "serenity_ore";
	public static final String BLOCK_SERENITY_ORE_NETHER = "serenity_ore_nether";
	public static final String BLOCK_SERENITY_ORE_END = "serenity_ore_end";
	public static final String BLOCK_SUGAR = "sugar_block";
	public static final String BLOCK_GLASS_RAINBOW = "rainbow_glass";
	public static final String BLOCK_MOLTEN_PEARLS = "molten_pearls";
	public static final String BLOCK_PEARL = "pearl_block";
	public static final String BLOCK_DUST_MIXTURE = "dust_mixture_block";

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
		return "item." + Reference.RESOURCE_PREFIX + itemName;
	}

	/**
	 * Get the unlocalized name of a Block
	 *
	 * @param blockName Normal Name of the Block
	 * @return Unlocalized Item-Name-String
	 */
	public static String getBlockNameUnlocalized(String blockName) {
		return "tile." + Reference.RESOURCE_PREFIX + blockName;
	}
}
