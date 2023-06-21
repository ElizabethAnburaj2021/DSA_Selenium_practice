package mandatoryHomeWork.week6.day4;

import org.junit.Test;

public class FindMinSortedRotatedMatrix_LC153 {
	/*
	 * program: 
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.
Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
-------------------------------------------------------------------
Pseudo code:
1. start as o, end as length-1
2. Find the mid value-> while start is lesser than or equal to end (start+end)/2
3. Check if the arr[mid]>arr[end] the we need to traverse on the right, so we can say start=mid+1
4. Else check if the arr[mid]<arr[end] then mid can be the min val or end can be the min val so we can say end=mid
5. Essentially the end can be the min, when above 2conditions are meet false-> return num[end]
6. return -1
	 */
	
	@Test
	public void example() {
		int nums[]= {3,4,5,1,2};
		System.out.println(findMin(nums));
	}
	@Test
	public void example1() {
		int nums[]= {4,5,6,7,0,1,2};
		System.out.println(findMin(nums));
	}
	@Test
	public void example2() {
		int nums[]= {11,13,15,17};
		System.out.println(findMin(nums));
	}
	private int findMin(int[] nums) {
		  int start=0,end=nums.length-1;

	        while (start<=end){
	        int mid=(start+end)/2;
	    if (nums[mid]>nums[end]){
	        start=mid+1;
	    }
	    else if(nums[mid]<nums[end]){
	        end=mid;
	    } else{
	        return nums[end];
	    }
	        }return -1;
	        
	    
	}

}
