package in.tigercloud.serenity_ore.item.tools;

import in.tigercloud.serenity_ore.lib.vanilla.*;
import in.tigercloud.serenity_ore.lib.Names;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Contains all Tool Material Types
 */
public class ToolMaterial {
	public static final Item.ToolMaterial RAINBOW_METAL = EnumHelper.addToolMaterial(
			Names.MATERIAL_RAINBOW_METAL,
			HarvestLevel.DIAMOND,
			ToolDurability.DIAMOND,
			Efficiency.GOLD,
			Damage.WOOD,
			Enchantability.NONE
	);
}
