package in.tigercloud.serenity_ore.common;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Item Register Handler
 */
@Mod.EventBusSubscriber
public class RegistryHandlerItems {
	/**
	 * Registers all Items
	 *
	 * @param event Registry Event
	 */
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS);
	}
}
