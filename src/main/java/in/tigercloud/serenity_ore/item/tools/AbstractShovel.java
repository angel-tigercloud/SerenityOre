package in.tigercloud.serenity_ore.item.tools;

/**
 * Spade-Item Base Class for easier creation (Mostly just an alias)
 *
 * @deprecated Code should go into AbstractSpade - This is just an fallback alias
 */
@Deprecated
public abstract class AbstractShovel extends AbstractSpade {
	/**
	 * AbstractSpade constructor
	 *
	 * @param name     Name of the Item
	 * @param material Material of the Tool
	 */
	public AbstractShovel(String name, ToolMaterial material) {
		super(name, material);
	}
}
