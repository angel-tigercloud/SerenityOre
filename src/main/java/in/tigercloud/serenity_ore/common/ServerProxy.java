package in.tigercloud.serenity_ore.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Server Proxy
 */
public class ServerProxy extends CommonProxy {
	/**
	 * Method called in the Forge Pre-Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	/**
	 * Method called in the Forge Initialization
	 *
	 * @param event FML-Event
	 */
	@Override @Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	/**
	 * Method called in the Forge Post-Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
