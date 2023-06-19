package mandatoryHomeWorks.Week2.Day3;

import org.junit.Test;

public class Week2_Day3_LeetCode_1464 {
	@Test
	public void example() {
		int arr[] = { 3, 4, 5, 2 };
		System.out.println(find2Max(arr));
	}

	/*
	 * pseudo code: 1. Declare the variables for firstMaxvalue and secondMaxValue
	 * and set as 0 2. Traverse a loop from 0 to arr.length-1 3. Inner loop: If
	 * arr[i]>firstMaxvalue , If yes save the arr i value to firstMaxvalue. (i.e.
	 * firstMaxvalue=arr[i]; 4. end the loop, when condition gets fail. 5. Outer
	 * loop: Traverse a loop to find the secondMaxValue. From 0 to j<= arr.length-1
	 * 6. If arr[j]<firstMaxvalue && arr[j]>secondMaxValue 7. If yes then save arr j
	 * value to secondMaxValue. i.e secondMaxValue=arr[j]; 8. return with
	 * firstMaxvalue * secondMaxValue;
	 * 
	 */

	private int find2Max(int[] arr) {
		int firstMaxVal = 0, secondMaxVal = 0, result;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > firstMaxVal) {
				firstMaxVal = arr[i];
			}

			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[j] < firstMaxVal && arr[j] > secondMaxVal) {
					secondMaxVal = arr[j];
				}
			}
		}
		return result = (firstMaxVal - 1) * (secondMaxVal - 1);
	}

}
