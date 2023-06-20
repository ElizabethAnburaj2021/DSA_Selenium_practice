package mandatoryHomeWorks.week3.day3;

import org.junit.Test;

public class LeetCode1984_HighestLowestKScore {
	@Test
	public void example() {
		int arr[] = { 90 };
		int k = 1;
		findMinKScore(arr,k);
	}

	private void findMinKScore(int[] arr, int k) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void example2() {
		int arr[] = { 9, 4, 1, 7 };
		int k = 2;
		findMinKScore(arr, k);
	}
	/*
	 * Program:
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
Return the minimum possible difference.

Example:
Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
--------------------------------------------------------------------------------
Pseudo code:
1. Declare a variable called minVal to store the min difference value. Initially it should be 0.
2. Outer loop: Traverse a loop--> 


	 */
}
