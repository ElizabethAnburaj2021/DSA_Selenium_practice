package mandatoryHomeWorks.Week3.Day3;

import org.junit.Test;

public class Leetcode_35_SearchInserPosition {
	@Test
	public void example() {
		int arr[]= {1,3,5,6};
		int target=5;
		foundTarget(arr,target);
	}
	/*
	 * program:
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
-----------------------------------------------------------------------------
Algorithm: Divide and conquer
Time complexity: O( log n)
space complexity: O(1)
----------------------------------------------------------------------------
Pseudo code:
1.Declare a left and right. Left should be 0 and right is arr.length-1.
2. while left is less than right,
then divide the left+right/2 to find the mid value. // here we are using divide
3. check if arr of mid is equal to target?
If yes, then return the mid.
4. Else if check the arr of mid< target
if yes, then say left=mid+1;
5. else right=mid-1;
6. Return arr[left]>= target then do return left else left+1.

	 */

	private int foundTarget(int[] arr, int target) {
		int left=0, right=arr.length-1;
		while(left<right) {
			int mid=left+right/2;//3
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {//3<5 so target big
				left=mid+1; 
			}else right=mid-1;
		}
		return arr[left]>=target? left:left+1; // arr[left] greater than or equal to target then return left else return left+1.
	}

}
