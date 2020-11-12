package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.common.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

/**
 * Block Base Class for easier creation
 */
public abstract class AbstractBlock extends Block implements BlockInterface {
	public String oreDictName = null;

	/**
	 * AbstractBlock constructor
	 *
	 * @param name Name of the Block
	 * @param material Material of the Block
	 */
	public AbstractBlock(String name, Material material) {
		super(material);

		this.setRegistryName(Reference.MOD_ID, name);
		this.setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());

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
