package in.tigercloud.serenity_ore;

import in.tigercloud.serenity_ore.init.ModBlocks;
import in.tigercloud.serenity_ore.init.RegisterBlocks;
import in.tigercloud.serenity_ore.init.RegisterItems;
import in.tigercloud.serenity_ore.lib.ProxyInterface;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Common Proxy
 */
public class CommonProxy implements ProxyInterface {
	/**
	 * Method called in the Forge Pre-Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// Register all items and Blocks
		RegisterBlocks.init();
		RegisterItems.init();
	}

	/**
	 * Method called in the Forge Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void init(FMLInitializationEvent event) {
		// Register all recipes
		RegisterBlocks.initRecipes();
		RegisterItems.initRecipes();
	}

	/**
	 * Method called in the Forge Post-Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// Void
	}
}
