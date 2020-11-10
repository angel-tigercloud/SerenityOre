package in.tigercloud.serenity_ore.lib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Interface with most functions for the Main-Mod File
 */
public interface MainModInterface {
	/**
	 * Method called in the Forge Pre-Initialization
	 *
	 * @param event FML-Event
	 */
	@Mod.EventHandler
	void preInit(FMLPreInitializationEvent event);

	/**
	 * Method called in the Forge Initialization
	 *
	 * @param event FML-Event
	 */
	@Mod.EventHandler
	void init(FMLInitializationEvent event);

	/**
	 * Method called in the Forge Post-Initialization
	 *
	 * @param event FML-Event
	 */
	@Mod.EventHandler
	void postInit(FMLPostInitializationEvent event);
}
