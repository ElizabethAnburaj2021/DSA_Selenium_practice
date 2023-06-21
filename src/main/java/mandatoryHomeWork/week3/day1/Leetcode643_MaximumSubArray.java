package mandatoryHomeWork.week3.day1;

import org.junit.Test;

public class Leetcode643_MaximumSubArray {
	@Test
	public void example() {
		int nums[] = {1,12,-5,-6,50,3}; 
		int k = 4;
		System.out.println(findMaxAverage(nums,k));
	}
	@Test
	public void example1() {
		int nums[] = {5}; 
		int k = 1;
		System.out.println(findMaxAverage(nums,k));
	}
	/*
	 * Pseudo code
	 * 1. Declare a sum variable and store the array's sum value in to it.
	 * 2. To store the values, we need to traverse an array 0 to k and do increment
	 * 3. Add sum with num[i] and store into sum
	 * 4. Declare a variable as maxSum and that is equal to sum
	 * 5. Traverse an array from 0 to nums.length
	 * 6. num[i] subtract the nums[i-k] and add with sum and store the result into the sum
	 * 7. To find the max sum we have to call math.max function with maxSum, sum. store into maxSum variable.
	 * 8. Finally return the (double) maxSum/k;
	 */
	private double findMaxAverage(int[] nums, int k) {
		 int sum = 0;
	        for (int i = 0; i < k; i++) {
	            sum += nums[i];
	        }
	        
	        int maxSum = sum;
	        for (int i = k; i < nums.length; i++) {
	            sum += nums[i] - nums[i - k];
	            maxSum = Math.max(maxSum, sum);
	        }
	        
	        return (double) maxSum / k;
	    }
	}
