package in.tigercloud.serenity_ore.item.armor;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.common.ModItems;
import in.tigercloud.serenity_ore.item.ItemInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

/**
 * Armor-Item Base Class for easier creation
 */
public abstract class AbstractArmor extends ItemArmor implements ItemInterface {
	public String oreDictName = null;

	/**
	 * AbstractArmor constructor
	 *
	 * @param name Name of the Item
	 * @param material Material of the Tool
	 * @param renderIndexIn Render Index (Vanilla Armor has 1 on Head, Chest, Boots | 2 on Pants)
	 * @param equipmentSlot Equipment Slot of the Armor
	 */
	public AbstractArmor(String name, ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndexIn, equipmentSlot);

		setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());

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
