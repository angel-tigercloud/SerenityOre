package in.tigercloud.serenity_ore.lib;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Interface to build a FML-Proxy
 */
public interface ProxyInterface {
	/**
	 * Method called in the Forge Pre-Initialization
	 *
	 * @param event FML-Event
	 */
	void preInit(FMLPreInitializationEvent event);

	/**
	 * Method called in the Forge Initialization
	 *
	 * @param event FML-Event
	 */
	void init(FMLInitializationEvent event);

	/**
	 * Method called in the Forge Post-Initialization
	 *
	 * @param event FML-Event
	 */
	void postInit(FMLPostInitializationEvent event);
}
