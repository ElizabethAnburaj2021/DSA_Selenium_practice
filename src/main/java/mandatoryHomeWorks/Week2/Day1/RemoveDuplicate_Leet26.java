package mandatoryHomeWorks.week2.day1;

import java.util.Arrays;

import org.junit.Test;
/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */

public class RemoveDuplicate_Leet26 {
	@Test
	public void example() {
		int arr[] = { 1, 1, 2, 3, 4, 4, 5 };
		// expected output as {1,2,3,4,5}
		removeDuplicatesToNonsortedArray(arr);
		
	}

	@Test
	public void example1() {
		int arr[] = { 1, 1, 2 };
		// expected output as {1,2}
		removeDuplicatesToNonsortedArray(arr);
	}

	@Test
	public void example2() {
		int arr[] = { 1, 2, 3, 4 };
		// expected output as {1,2,3,4}
		removeDuplicatesToNonsortedArray(arr);
	}

	@Test
	public void example3() {
		int arr[] = { 0, 0, 0, 0, 1 };
		// expected output as {0,1}
		removeDuplicatesToNonsortedArray(arr);
	}
	/*
	 * PesudoCode
	 * 1. Declare the counter variable to get the unique elements comes first in the array without changing the position.
	 * 2. Iterate the for loop from 1 to length of an array
	 * --> i.e i=1, i<=arr.length-1
	 * 3. Inner loop the condition arr[i]!=arr[i-1]; Condition pass, then save the counter's new index position.
	 * i.e. arr[counterVal]=arr[i];
	 *  then do counter increment. i.e. counterVal++;
	 * 4. return the counterVal+1. i.e.return counterval+1; 
	 * 5. Now we get it the no of time counter runs. called total count of an counter.
	 * 6. Store it in the variable called k.
	 * 7. Now, we need to print the unique elements of an array. So, iterate the for loop from 0 to counterVal 
	 *  
	 *
	 */

	private int removeDuplicatesToNonsortedArray(int[] arr) {
		int counterval=1;
		// traverse the loop from 0 to array length
		for(int i=1;i<=arr.length-1;i++) {
			if (arr[i]!=arr[i-1]) {
				arr[counterval++]=arr[i];
			}
		}System.out.println(Arrays.toString(arr));
		return counterval;
		
	}
}
