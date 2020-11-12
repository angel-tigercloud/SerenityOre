package in.tigercloud.serenity_ore.item;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.common.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

/**
 * Item Base Class for easier creation
 */
public abstract class AbstractItem extends Item implements ItemInterface {
	public String oreDictName = null;

	/**
	 * AbstractItem constructor
	 *
	 * @param name Name of the Item
	 */
	public AbstractItem(String name) {
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());

		// Default Creative Tab
		setCreativeTab(Reference.defaultCreativeTab);

		ModItems.ITEMS.add(this);
	}

	/**
	 * Sets the OreDictionary Name
	 *
	 * @param oreDictName Name
	 */
	@Override
	public void setOreDictName(String oreDictName) {
		this.oreDictName = oreDictName;
	}

	/**
	 * Registers the Item/Block to the Ore-Dict if their Name is Set
	 */
	@Override
	public void registerOreDict() {
		if(oreDictName != null)
			OreDictionary.registerOre(oreDictName, new ItemStack(this));
	}
}
