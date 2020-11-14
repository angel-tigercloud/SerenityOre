package in.tigercloud.serenity_ore.item;

import in.tigercloud.serenity_ore.lib.OreDict;

/**
 * Rainbow Ingot
 */
public class RainbowIngot extends AbstractItem {
	/**
	 * AbstractItem constructor
	 *
	 * @param name Name of the Item
	 */
	public RainbowIngot(String name) {
		super(name);
		setOreDictName(OreDict.RAINBOW_INGOT);
	}
}
