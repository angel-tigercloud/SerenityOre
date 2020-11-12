package in.tigercloud.serenity_ore.common.registry;

import in.tigercloud.serenity_ore.common.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Smelting Registry Handler
 */
public class RegistryHandlerSmelting {
	/**
	 * Shall contain all Smelting Recipes-Register calls and
	 * may call other functions registering smelting related recipes
	 */
	public static void init() {
		GameRegistry.addSmelting(ModItems.SERENITY_DUST, new ItemStack(ModItems.SERENITY_PEARL), 1f);
	}
}
