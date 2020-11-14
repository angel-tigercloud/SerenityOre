package in.tigercloud.serenity_ore.lib;

/**
 * Misc Helper methods
 */
public class Helpers {
	/**
	 * Converts ticks to secs
	 *
	 * @param ticks Ticks
	 * @return Secs
	 */
	public static int tickToSec(int ticks) {
		return ticks / 20;
	}

	/**
	 * Converts secs to ticks
	 *
	 * @param secs Secs
	 * @return Ticks
	 */
	public static int secToTicks(int secs) {
		return secs * 20;
	}
}
