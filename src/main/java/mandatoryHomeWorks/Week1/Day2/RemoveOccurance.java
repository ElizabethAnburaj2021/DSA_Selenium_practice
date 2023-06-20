package mandatoryHomeWorks.week1.day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveOccurance {
	@Test
	public void example() {
		int[] arr = { 1, 2, 3, 4, 2, 1 };
		int num = 2;
		int[] result = removeOccurrence(arr, num);
		System.out.println(Arrays.toString(result));

	}

	@Test
	public void example1() {
		int[] arr = { 3, 2, 9, 3 };
		int num = 3;
		int[] result = removeOccurrence(arr, num);
		System.out.println(Arrays.toString(result));
	}

	@Test
	public void example2() {
		int[] arr = { 1, 2, 1, 4, 5, 1 };
		int num = 1;
		int[] result = removeOccurrence(arr, num);
		System.out.println(Arrays.toString(result));
	}
	/*
	 * Pseudo code:
	 * 
	 * --> Declare the variable for firstIndex and lastIndex as 0 --> Create the
	 * loop to traverse an array[0 to arr.length] to find the firstIndex equal to
	 * the given number 1. [i.e i=0; i<arr.length) --> Find if the given number
	 * present in the firstIndex of an array -> Then we can say arr[i]=num; -> store
	 * the value in the variable firstIndex=i -> Then break the loop --> Create the
	 * for loop and iterate the loop based on the 0 to arr.length-1 --> Find the
	 * number which is present in the last index , -->if yes arr[j]==num and store
	 * it in the variable called lastIndex -> Then break the loop --> Create the new
	 * array which is length of arr-2 [i.e arr.length-2=arr1] --> Declare the
	 * variable m as 0 --> Create the loop to find the first and last index !=num
	 * with k from 0 to arr.length-1 --> arr1[m]==a[i] --> do the post increment of
	 * m --> print the values of arr1 and convert array toString --> return the arr1
	 */

	private int[] removeOccurrence(int[] arr, int num) {
		int firstIndex = 0, lastIndex = 0;

		// To find the first index 
		for (int j = 0; j < arr.length; j++) { // O(n)
			if (arr[j] == num) { //O(1)
				firstIndex = j;
				break;
			}
		}

		// To find the last first index
		for (int k = arr.length - 1; k >= 0; k--) {
			if (arr[k] == num) {
				lastIndex = k;
				break;
			}
		}

		// create new array with required length which is arr1.Length - 2
		int[] arr1 = new int[arr.length - 2];

		int m = 0;
		// Create the loop to find the first and last index !=num with k from 0 to
		// arr.length-1

		for (int i = 0; i <= arr.length - 1; i++) // 0 1<6
		{
			if (i != firstIndex && i != lastIndex) // 1!=0
			{
				arr1[m] = arr[i];
				m++;
			}
		}
		//System.out.println(Arrays.toString(arr1));
		return arr1;
	}

}
