package in.tigercloud.serenity_ore.lib;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Interface with most functions for the Main-Mod File
 */
public interface MainModInterface {
	/**
	 * Inits all Creative Tabs
	 */
	@SideOnly(Side.CLIENT)
	void initCreativeTabs();

	/**
	 * Method called in the Forge Pre-Initialization
	 *
	 * @param event FML-Event
	 */
	@EventHandler
	void preInit(FMLPreInitializationEvent event);

	/**
	 * Method called in the Forge Initialization
	 *
	 * @param event FML-Event
	 */
	@EventHandler
	void init(FMLInitializationEvent event);

	/**
	 * Method called in the Forge Post-Initialization
	 *
	 * @param event FML-Event
	 */
	@EventHandler
	void postInit(FMLPostInitializationEvent event);
}
