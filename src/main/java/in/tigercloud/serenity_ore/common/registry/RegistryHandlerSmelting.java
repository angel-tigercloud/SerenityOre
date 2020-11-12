package in.tigercloud.serenity_ore.common.registry;

import net.minecraft.init.Blocks;
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
	public static void register() {
		System.out.println(1);
		GameRegistry.addSmelting(Blocks.BED, new ItemStack(Blocks.PUMPKIN), 1f);
	}
}
