package in.tigercloud.serenity_ore;

import in.tigercloud.serenity_ore.lib.MainModInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Serenity-Ore Main Class
 *
 * @author Tigercloud
 */
@Mod(modid = SerenityOre.MOD_ID, name = SerenityOre.MOD_NAME, version = SerenityOre.VERSION, dependencies = SerenityOre.DEPENDENCIES)
public class SerenityOre implements MainModInterface {
	// Constants
	public static final String MOD_ID = "serenity_ore";
	public static final String MOD_NAME = "Serenity Ore";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2854,)";
	public static final String RESOURCE_PREFIX = MOD_ID + ":";
	public static final String FULL_MAIN_NAMESPACE = "in.tigercloud.serenity_ore";

	@Mod.Instance(MOD_ID)
	public static SerenityOre instance;

	@SidedProxy(clientSide = FULL_MAIN_NAMESPACE + ".ClientProxy", serverSide = FULL_MAIN_NAMESPACE + ".CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs creativeTab = new CreativeTabs(SerenityOre.RESOURCE_PREFIX) {
		/**
		 * Get the Tab-Icon
		 *
		 * @return Item-Icon
		 */
		@Override
		public ItemStack getTabIconItem() {
			return null;
		}
	};

	/**
	 * SerenityOre Constructor
	 */
	public SerenityOre() {
		instance = this;
	}

	/**
	 * Method called in the Forge Pre-Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	/**
	 * Method called in the Forge Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	/**
	 * Method called in the Forge Post-Initialization
	 *
	 * @param event FML-Event
	 */
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
