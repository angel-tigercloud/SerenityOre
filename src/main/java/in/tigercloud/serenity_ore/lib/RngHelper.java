package in.tigercloud.serenity_ore.lib;

import java.util.Random;

/**
 * Helper class for RNG-Methods
 */
public class RngHelper {
	/**
	 * Returns how many Items a Block drops (with enchantment)
	 *
	 * @param fortune Fortune Param passed by overwrite method (Fortune Level)
	 * @param random Random Number Generator passed by overwrite method
	 * @param fortuneMultiplier Fortune Multiplier
	 * @param minDrops Min Drops (No enchantment)
	 * @param maxDrops Max Drops (No enchantment)
	 * @return Drop Item count
	 */
	public static int blockQuantityDroppedWithBonus(int fortune, Random random, int fortuneMultiplier, int minDrops, int maxDrops) {
		return blockQuantityDropped(random, minDrops, maxDrops) + random.nextInt(fortune + fortuneMultiplier);
	}

	/**
	 * Returns how many Items a Block drops (No enchantment)
	 *
	 * @param random Random Number Generator passed by overwrite method
	 * @param minDrops Min Drops (No enchantment)
	 * @param maxDrops Max Drops (No enchantment)
	 * @return Drop Item count
	 */
	public static int blockQuantityDropped(Random random, int minDrops, int maxDrops) {
		return minDrops + random.nextInt(maxDrops - minDrops + 1);
	}
}
