package in.tigercloud.serenity_ore.lib;

import net.minecraft.creativetab.CreativeTabs;

import javax.annotation.Nullable;

/**
 * Interface to build Items
 */
public interface ItemInterface {
	/**
	 * Adds the Basic Data to an item
	 *
	 * @param itemName Itemname
	 * @param creativeTab Creative tab or null for none
	 */
	void init(String itemName, @Nullable CreativeTabs creativeTab);

	/**
	 * Returns the unlocalized Name of the Item
	 *
	 * @return Unlocalized Name
	 */
	String getUnlocalizedName();
}
