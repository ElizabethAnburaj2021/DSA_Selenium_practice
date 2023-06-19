package ExtraPrograms;

import org.junit.Test;

public class NotationType2 {
	/*
	 * Program: Return Min value from the given array to analysis the O[N]
	 */
	@Test
	public void example1() {
		int min = findMin(new int[] { 8, 2, 6, 5, 2, 1 });
		System.out.println(min);
	}

	private int findMin(int[] arr) {
		// Taking the maxmimum value to find the min value from the given array

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
	// Instead of this if condition can we use like this min=Math.min(min, arr[i]); because the complexity is 0[1] can optimize efficiently
			}
		}
		return min;
	}
}
