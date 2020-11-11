package in.tigercloud.serenity_ore.common;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.item.SerenityDust;
import in.tigercloud.serenity_ore.item.SerenityPearl;
import in.tigercloud.serenity_ore.lib.Names;
import net.minecraft.item.Item;

/**
 * Contains all Mod-the Items as Reference
 */
public class ModItems {
	public static final Item[] ITEMS = {
			// Add Items here
			new SerenityDust(Names.itemSerenityDust).setCreativeTab(Reference.creativeTab),
			new SerenityPearl(Names.itemSerenityPearl).setCreativeTab(Reference.creativeTab)
	};
}
