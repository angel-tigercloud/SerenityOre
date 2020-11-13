package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.common.ModBlocks;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

/**
 * FallingBlock Base Class for easier creation
 */
public abstract class AbstractBlockFalling extends BlockFalling implements BlockInterface {
	public String oreDictName = null;

	/**
	 * AbstractBlockFalling constructor
	 *
	 * @param name Name of the Block
	 * @param material Material of the Block
	 */
	public AbstractBlockFalling(String name, Material material) {
		super(material);

		this.setRegistryName(Reference.MOD_ID, name);
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());

		// Default Creative Tab
		setCreativeTab(Reference.defaultCreativeTab);

		ModBlocks.BLOCKS.add(this);
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
