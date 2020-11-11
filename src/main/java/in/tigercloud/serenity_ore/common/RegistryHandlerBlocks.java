package in.tigercloud.serenity_ore.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

/**
 * Block Registry Handler
 */
@Mod.EventBusSubscriber
public class RegistryHandlerBlocks {
	/**
	 * Registers all Blocks from the ModBlocks class
	 *
	 * @param event Registry Event
	 */
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS);
	}

	/**
	 * Registers all Items
	 *
	 * @param event Registry Event
	 */
	@SubscribeEvent
	public static void registerItemBlocks(Register<Item> event) {
		for (Block block : ModBlocks.BLOCKS) {
			event.getRegistry().register(
					getItemBlock(block)
			);
		}
	}

	/**
	 * Creates an ItemBlock from a Block
	 *
	 * @param block Block
	 * @return Item created from the current Block
	 */
	protected static Item getItemBlock(Block block) {
		return new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName()));
	}
}
