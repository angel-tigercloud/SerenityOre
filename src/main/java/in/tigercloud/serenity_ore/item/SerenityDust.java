package in.tigercloud.serenity_ore.item;

import in.tigercloud.serenity_ore.lib.OreDict;

/**
 * Serenity Dust
 */
public class SerenityDust extends AbstractItem {
	/**
	 * AbstractItem constructor
	 *
	 * @param name Name of the Item
	 */
	public SerenityDust(String name) {
		super(name);
		setOreDictName(OreDict.SERENITY_DUST);
	}
}
