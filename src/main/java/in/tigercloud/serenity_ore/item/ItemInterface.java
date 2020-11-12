package in.tigercloud.serenity_ore.item;

/**
 * Contains base methods for all Items
 */
public interface ItemInterface {
	/**
	 * Registers the Item/Block to the Ore-Dict if their Name is Set
	 */
	void registerOreDict();

	/**
	 * Sets the OreDictionary Name
	 *
	 * @param oreDictName Name
	 */
	void setOreDictName(String oreDictName);
}
