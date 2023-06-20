package mandatoryHomeWorks.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class PluseOneWithLastIndex {

	@Test // +ve case
	public void example() {
		int[] arr1 = { 1, 2, 3 };
		System.out.println(Arrays.toString(printPlusOneLeeC66(arr1)));
	}

	@Test // Edge case
	public void example1() {
		int[] arr1 = { 9 };
		System.out.println(Arrays.toString(printPlusOneLeeC66(arr1)));
	}

	@Test // Negative case
	public void example2() {
		int[] arr1 = { -7 };
		System.out.println(Arrays.toString(printPlusOneLeeC66(arr1)));
	}

	@Test // edge case 2
	public void example3() {
		int[] arr1 = { 9, 9 };
		System.out.println(Arrays.toString(printPlusOneLeeC66(arr1)));
	}

	@Test // edge case 3
	public void example4() {
		int[] arr1 = { 9, 9, 9 };
		System.out.println(Arrays.toString(printPlusOneLeeC66(arr1)));
	}

	/*
	 * 1. Iterate the for loop from 0 to arr.length-1 (i=arr1.length-1;i>=0;i--) for
	 * this problem we are traverse from last index Inner loop --> Check if last
	 * index value is arr1[i]<9 if yes, arr1[i]=add+1 Out side the loop-> If No, set
	 * arr1[i]==0; end the for loop
	 * 
	 * 2. Check if arr1[i]==9; a. create a new array with length of previous array+1
	 * set new array's first index value as 1 [ ex: i/p:{9} 9+1=10 we require 1
	 * array length extra so we created the new array done by a. based on the
	 * arr1[i]==0; where ever 9 present it copies 0 inside the index of an array.now
	 * array be like [0,0]. now do it the b point to set the 1st index of a new
	 * array as 1] c. return new array
	 * 
	 */
	private int[] printPlusOneLeeC66(int[] arr1) {
		for (int i = arr1.length - 1; i >= 0; i--) {
			// System.out.println(arr1[i]);
			if (arr1[i] < 9) {
				arr1[i]++;
				return arr1;
			}
			arr1[i] = 0;
		}

		//it should comes once all the values set to 0 only.
		  int [] arr2=new int[arr1.length+1]; arr2[0]=1;
		  
			/*
			 * int[] arr2 = new int[arr1.length + 1]; for (int i = arr2[arr1.length-1];
			 * i==9;) { arr2[0] = 1; return arr2; } arr2[0] = 1;
			 */
		 
		return arr2;
	}
}
