package mandatoryHomeWorks.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class MovesZerosAtLast_Leet283 {
	@Test
	public void example() {
		int[] arr1 = { 0, 1, 0, 3, 12 };
		moveZerosToEnd(arr1);
	}

	@Test
	public void example1() {
		int[] arr1 = { 0, 0, 0, 1 };
		moveZerosToEnd(arr1);
	}

	@Test
	public void example2() {
		int[] arr1 = { 0 };
		moveZerosToEnd(arr1);
	}

	@Test
	public void example3() {
		int[] arr1 = { 1, 3, 2, 5, 6 };
		moveZerosToEnd(arr1);
	}
	
	/*
	 * PesudoCode
	 * 1. declare a variable as counter pointer. To traverse an array if we get 0 then do nothing,
	 * we get non-zero's then increase the counter, It will helps us to save the non-zero elements in
	 * the left side without changing their position.
	 * i.e int counterNewPosition=0;
	 * 
	 * 2. If non-zero values are comes, we save the elements in the same array without
	 * change their position. If the condition should be array of i is not equal to 0
	 * i.e arr[i]!=0
	 * arr1[counterNewPosition]=arr1[i]; 
	 * 
	 * 3. Increase the counter value. i.e. counterNewPosition++;
	 * 4. Now we have the no of counter values and array length. So we can subtract these 2 and get the
	 * no of remaining array's. i.e. int remainingIndices=arr1.length-counterNewPosition;
	 * 5. Store it in the variable for no of remaining array's.
	 * 6. Create a loop to traverse and set the remaining array indices value set as 0.
	 * loop traverse from arr1.length-remainingIndices To arr1.length.
	 * 7. set as 0 as arr1[i]=0
	 * 8. print arr1
	 */

	private void moveZerosToEnd(int[] arr1) {

		int counterNewPosition=0;
		
// traverse an array and save values in to the same array without changing the position
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]!=0) {
				arr1[counterNewPosition]=arr1[i];
				counterNewPosition++;
			}
		}
		int remainingIndices=arr1.length-counterNewPosition;
		for(int i=arr1.length-remainingIndices;i<arr1.length;i++) {
			arr1[i]=0;
		}System.out.println(Arrays.toString(arr1));
	}

}
