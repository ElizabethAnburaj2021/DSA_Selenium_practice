package mandatoryHomeWorks.week2.day2;

import org.junit.Test;

public class Single_Num_leetcode136 {
	@Test
	public void example() {
		int arr[] = { 2, 2, 3, 3, 4 };
		singleNo(arr);
	}

	@Test
	public void example1() {
		int arr[] = { 6, 6, 3, 3, 5 };
		singleNo(arr);
	}

	@Test
	public void example2() {
		int arr[] = { -1, -1, -2, -2, 8 };
		singleNo(arr);

	}

	private static int singleNo(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = count ^ arr[i];

		}
		return count;
	}

}
