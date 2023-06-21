package mandatoryHomeWork.week3.day5;

import org.junit.Test;

public class MajorityElement_Leetcode169 {
@Test
public void example() {
	int nums[] = {3,2,3,2,2,2};
	System.out.println(findMajority(nums));
}
@Test
public void example1() {
	int nums[] = {3,2,3};
	System.out.println(findMajority(nums));
}
/*
 * Program:
 * Given an array nums of size n, return the majority element.
The majority element is the element that appears more than [n/2] times. 
You may assume that the majority element always exists in the array.
---------------------------------------------------------------------
Pseudo code:
1. Traverse a outer loop:-> 0 to length. 
2. Declare a counter variable and store majority count every time loops runs time. Set as 0 initially. 
Counter should be inside the outer loop then only it stores majority counts of an array.
3. Traverse a Inner loop:-> 0 to length and the condition should be i < length.
4. nums[i] should be equal to num, then only it store suppose the initial value as majority value.
5. Increment the counter
6. Check if the count is greater than the majority count
7. return the num
8. Finally return the majority count
-----------------------------------------------------------------
Time complexity: O(n^2)
Space complexity: O(1)
 */

private int findMajority(int[] nums) {
	int majorityCount=nums.length/2;
	
	for(int num:nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num) {
				count++;
			}
		}if(count > majorityCount) {
			return num;
		}
		
	}
	return majorityCount;
}
}
