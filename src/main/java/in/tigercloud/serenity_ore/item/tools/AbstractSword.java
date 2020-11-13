package in.tigercloud.serenity_ore.item.tools;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.common.ModItems;
import in.tigercloud.serenity_ore.item.ItemInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

/**
 * Sword-Item Base Class for easier creation
 */
public abstract class AbstractSword extends ItemSword implements ItemInterface {
	public String oreDictName = null;

	/**
	 * AbstractSword constructor
	 *
	 * @param name Name of the Item
	 * @param material Material of the Tool
	 */
	public AbstractSword(String name, ToolMaterial material) {
		super(material);

		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());

		// Default Creative Tab
		if(Reference.DEFAULT_CREATIVE_TAB_FOR_TOOLS_ARMOR)
			setCreativeTab(Reference.defaultCreativeTab);
		else
			setCreativeTab(CreativeTabs.COMBAT);

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
