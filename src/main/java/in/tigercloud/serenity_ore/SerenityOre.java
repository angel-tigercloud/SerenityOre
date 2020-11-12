package in.tigercloud.serenity_ore;

import in.tigercloud.serenity_ore.common.ModBlocks;
import in.tigercloud.serenity_ore.common.ServerProxy;
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
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES)
public class SerenityOre implements MainModInterface {
	@Mod.Instance(Reference.MOD_ID)
	public static SerenityOre instance;

	@SidedProxy(clientSide = Reference.FULL_MAIN_NAMESPACE + ".common.ClientProxy", serverSide = Reference.FULL_MAIN_NAMESPACE + ".common.ServerProxy")
	public static ServerProxy proxy;

	/**
	 * SerenityOre Constructor
	 */
	public SerenityOre() {
		instance = this;
		initCreativeTabs();
	}

	/**
	 * Inits all Creative Tabs
	 */
	@Override
	public void initCreativeTabs() {
		Reference.creativeTab = new CreativeTabs(Reference.RESOURCE_PREFIX + "creative_tab") {
			/**
			 * Get the Tab-Icon
			 *
			 * @return Item-Icon
			 */
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ModBlocks.SERENITY_ORE);
			}
		};
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
