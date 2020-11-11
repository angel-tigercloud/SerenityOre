package in.tigercloud.serenity_ore.common;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Objects;

/**
 * Model Register Handler
 */
@Mod.EventBusSubscriber(value = Side.CLIENT)
public class RegistryHandlerModels {
	/**
	 * Registers all Models for Items and Blocks
	 *
	 * @param event Registry Event
	 */
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		for (Block block: ModBlocks.BLOCKS) {
			setBlockRender(block);
		}

		for (Item item: ModItems.ITEMS) {
			setItemRender(item);
		}
	}

	/**
	 * Sets the Model for a Block
	 *
	 * @param block Block
	 */
	protected static void setBlockRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(
				Item.getItemFromBlock(block),
				0,
				new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()), "inventory")
		);
	}

	/**
	 * Sets the Model for a Block
	 *
	 * @param item Item
	 */
	protected static void setItemRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(
				item,
				0,
				new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory")
		);
	}
}
