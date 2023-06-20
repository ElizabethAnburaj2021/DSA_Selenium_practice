package mandatoryHomeWorks.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class AddSpecific_index {

	@Test
	public void example() {
		int arr[] = { 1, 2, 4, 5 };
		int noToInsert = 2;
		int indextoInsertNo = 3;
		int[] storeVal = addNoToInsert(arr, noToInsert, indextoInsertNo);
		System.out.println(Arrays.toString(storeVal));
	}

	@Test
	public void example1() {
		int arr[] = { 2, 3, 4 };
		int noToInsert = 5;
		int indextoInsertNo = -1;
		int[] storeVal = addNoToInsert(arr, noToInsert, indextoInsertNo);
		System.out.println(Arrays.toString(storeVal));
	}

	@Test
	public void example2() {
		int arr[] = {};
		int noToInsert = 0;
		int indextoInsertNo = 2;
		int[] storeVal = addNoToInsert(arr, noToInsert, indextoInsertNo);
		System.out.println(Arrays.toString(storeVal));
	}

	// add to the specific index
	private static int[] addNoToInsert(int arr[], int noToInsert, int indextoInsertNo) {

		// create new array with a.length+1
		int i = 0;
		int arr1[] = new int[arr.length + 1];
		for (; i < indextoInsertNo; i++) {
			arr1[i] = arr[i];
		}

		// add the valueToInsert in the specified index
		for (int j = 0; j < arr.length; j++) {
			if (j == indextoInsertNo)
				arr1[indextoInsertNo] = noToInsert;
		}
		// print the remaining values in array 2
		for (int k = indextoInsertNo; k < arr.length; k++) {
			arr1[k + 1] = arr[k];
		}
		return arr1;
	}
}
