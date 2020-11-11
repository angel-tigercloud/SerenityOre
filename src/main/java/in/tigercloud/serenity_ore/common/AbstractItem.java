package in.tigercloud.serenity_ore.common;

import in.tigercloud.serenity_ore.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import java.util.Objects;

/**
 * Item Base Class for easier creation
 */
public abstract class AbstractItem extends Item {
	/**
	 * AbstractItem constructor
	 *
	 * @param name Name of the Item
	 */
	AbstractItem(String name) {
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());
	}
}
