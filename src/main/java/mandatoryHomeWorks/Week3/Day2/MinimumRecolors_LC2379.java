package mandatoryHomeWorks.week3.day2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MinimumRecolors_LC2379 {
	@Test
	public void example() {
		String blocks = "WBBWWBBWBW";// 3
		int k = 7;

		int minRecolors = getMinimumRecolors(blocks, k);
		System.out.println("Minimum recolors: " + minRecolors);
	}

	@Test
	public void example1() {
		String blocks = "WBWBBBW";// 0
		int k = 2;
		int minRecolors = getMinimumRecolors(blocks, k);
		System.out.println("Minimum recolors: " + minRecolors);
	}

	/*
	 * Declare a variable and store the max value using Integer class
	 * 
	 */
	private static int getMinimumRecolors(String blocks, int k) {
		int count = Integer.MAX_VALUE;
		for (int i = -1, j = 0, white = 0; j < blocks.length(); j++) {
			white += (blocks.charAt(j) == 'W') ? 1 : 0;
			if (j - i >= k) {
				// update count
				// move 1 ptr, if the index is W, minus
				count = Math.min(count, white);
				white -= (blocks.charAt(++i) == 'W') ? 1 : 0;
			}
		}

		return count;

	}
}