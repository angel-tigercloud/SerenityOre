package in.tigercloud.serenity_ore.lib;

import java.util.Random;

/**
 * Helper class for RNG-Methods
 */
public class RngHelper {
	private static final Random RANDOM = new Random();

	/**
	 * Returns if the chance succeed
	 *
	 * @param chance Percentage of the Chance (0-100)
	 * @return Succeed
	 */
	public static boolean chance(int chance) {
		if(chance > 100)
			chance = 100;
		if(chance < 0)
			chance = 0;

		return chance >= (RANDOM.nextInt(100) + 1);
	}

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
		if(fortuneMultiplier == 0)
			return blockQuantityDropped(random, minDrops, maxDrops);

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
