package mandatoryHomeWorks.Week2.Day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement_LeetCode27 {
	@Test
	public void example() {
		int arr[]= {3,2,2,3};
		int val=3;
		System.out.println(removeelement(arr,val));
	}
	@Test
	public void example1() {
		int[] arr= {1,2,3,4,5,5,4,6};
		int val=4;
		System.out.println(removeelement(arr,val));
	}
	/*
	 * Pseudo code
	 * 1. Initialize the count variable to save values of an array in the same array.
	 * 2. Iterate the loop to traverse the arr.length of an array
	 * 3. If, array of i not equal to val 
	 * --> then save the values in the same array using the arr[count]=arr[i]
	 * 4. Then increase the counter value
	 * 5. finally return the count
	 * 
	 */

	private int removeelement(int[] arr, int val) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[count]=arr[i];
				count++;
			}
			
		}
		return count;
		
		
	}

}
