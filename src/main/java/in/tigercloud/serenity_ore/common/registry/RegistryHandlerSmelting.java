package in.tigercloud.serenity_ore.common.registry;

import in.tigercloud.serenity_ore.common.ModBlocks;
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
		// Ore Smelting
		GameRegistry.addSmelting(ModBlocks.SERENITY_ORE, new ItemStack(ModBlocks.MOLTEN_PEARLS), 0.7f);
		GameRegistry.addSmelting(ModBlocks.SERENITY_ORE_NETHER, new ItemStack(ModBlocks.MOLTEN_PEARLS), 0.9f);
		GameRegistry.addSmelting(ModBlocks.SERENITY_ORE_END, new ItemStack(ModBlocks.MOLTEN_PEARLS), 1.1f);

		// Other Smelting
		GameRegistry.addSmelting(ModItems.SERENITY_DUST, new ItemStack(ModItems.SERENITY_PEARL), 0.2f);
		GameRegistry.addSmelting(ModBlocks.DUST_BLOCK, new ItemStack(ModBlocks.RAINBOW_GLASS), 0.1f);
		GameRegistry.addSmelting(ModBlocks.PEARL_BLOCK, new ItemStack(ModItems.RAINBOW_INGOT), 0.2f);
	}
}
