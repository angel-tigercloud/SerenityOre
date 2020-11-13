package in.tigercloud.serenity_ore.block;

import in.tigercloud.serenity_ore.Reference;
import in.tigercloud.serenity_ore.common.ModBlocks;
import in.tigercloud.serenity_ore.lib.BlockHardness;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

/**
 * Glass Block Base Class for easier creation
 */
public abstract class AbstractBlockGlass extends BlockGlass implements BlockInterface {
	public String oreDictName = null;

	/**
	 * AbstractBlock constructor
	 *
	 * @param name Name of the Block
	 * @param material Material of the Block
	 * @param ignoreSimilarity Ignore similarity and render each block
	 */
	public AbstractBlockGlass(String name, Material material, boolean ignoreSimilarity) {
		super(material, ignoreSimilarity);

		setRegistryName(Reference.MOD_ID, name);
		setUnlocalizedName(Objects.requireNonNull(this.getRegistryName()).toString());

		// Default Creative Tab
		setCreativeTab(Reference.defaultCreativeTab);
		setHardness(BlockHardness.GLASS);
		setSoundType(SoundType.GLASS);

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

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
}
