package in.tigercloud.serenity_ore.common;

import in.tigercloud.serenity_ore.item.SerenityDust;
import in.tigercloud.serenity_ore.item.SerenityPearl;
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
}
