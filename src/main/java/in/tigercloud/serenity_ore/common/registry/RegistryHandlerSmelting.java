package in.tigercloud.serenity_ore.common.registry;

import in.tigercloud.serenity_ore.block.SerenityOre;
import in.tigercloud.serenity_ore.block.SerenityOreEnd;
import in.tigercloud.serenity_ore.block.SerenityOreNether;
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
		GameRegistry.addSmelting(ModBlocks.SERENITY_ORE, new ItemStack(ModItems.SERENITY_PEARL, SerenityOre.DROPS_MAX_NORMAL), 0.7f);
		GameRegistry.addSmelting(ModBlocks.SERENITY_ORE_NETHER, new ItemStack(ModItems.SERENITY_PEARL, SerenityOreNether.DROPS_MAX_NORMAL), 0.9f);
		GameRegistry.addSmelting(ModBlocks.SERENITY_ORE_END, new ItemStack(ModItems.SERENITY_PEARL, SerenityOreEnd.DROPS_MAX_NORMAL), 1.1f);
		GameRegistry.addSmelting(ModItems.SERENITY_DUST, new ItemStack(ModItems.SERENITY_PEARL), 0.2f);
	}
}
