package in.tigercloud.serenity_ore;

import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;

/**
 * Reference Class
 */
public class Reference {
	public static final String MOD_ID = "serenity_ore";
	public static final String MOD_NAME = "Serenity Ore";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2854,)";
	public static final String RESOURCE_PREFIX = MOD_ID + ":";
	public static final String FULL_MAIN_NAMESPACE = "in.tigercloud.serenity_ore";
	public static Logger logger;
	public static CreativeTabs defaultCreativeTab;
}
