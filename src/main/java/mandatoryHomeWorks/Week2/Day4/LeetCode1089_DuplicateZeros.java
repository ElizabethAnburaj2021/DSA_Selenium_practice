package mandatoryHomeWorks.Week2.Day4;

import org.junit.Test;

public class LeetCode1089_DuplicateZeros {
	@Test
	public void example() {
		int arr[] = { 1, 0, 2, 3, 4, 0, 3, 3 };
		duplicateZeros(arr);
	}
	/* 1. Create a new array with length of an previous array 
	 * 2. Declare a variable as 0
	 * 3. Traverse a loop from 0 To arr length
	 * 4. If variable (step 2) >= arr length
	 * 5. Then break
	 * 6. If arr[i]!=0 then new arr[var1++]=arr[i] // save values in a new array
	 * 7. else arr[var1++]=0
	 * 8. If var1 greater than or equal to arr.length then break
	 * 9. arr[var1++]=0
	 * 10. Save new array values in old array
	 *  
	 */

	private void duplicateZeros(int[] arr) {
		int[] output = new int[arr.length];
		int prev = 0;
		for (int i = 0; i < arr.length; i++) {
			if (prev >= arr.length)
				break;
			if (arr[i] != 0) {
				output[prev++] = arr[i];
			} else {
				output[prev++] = 0;
				if (prev >= arr.length)
					break;
				output[prev++] = 0;
			}

		}

		int i = 0;
		while (i < output.length) {
			arr[i] = output[i];
			i++;
		}

	}
}
