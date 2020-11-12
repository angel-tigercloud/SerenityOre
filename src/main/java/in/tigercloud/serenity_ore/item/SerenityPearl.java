package in.tigercloud.serenity_ore.item;

import in.tigercloud.serenity_ore.lib.OreDict;

/**
 * Serenity Pearl
 */
public class SerenityPearl extends AbstractItem {
	/**
	 * AbstractItem constructor
	 *
	 * @param name Name of the Item
	 */
	public SerenityPearl(String name) {
		super(name);
		setOreDictName(OreDict.SERENITY_PEARL);
	}
}
