package mandatoryHomeWork.week3.day5;

import java.util.HashMap;

import org.junit.Test;

public class Leetcode219_ContainsDuplicateII {
	@Test
	public void example() {
		int nums[]= {1,2,3,1};
		int k = 3;//TRUE
		System.out.println(containsNearbyDuplicates(nums,k));
	}
	
	@Test
	public void example1() {
		int nums[]= {1,0,1,1};
		int k = 1;//TRUE
		System.out.println(containsNearbyDuplicates(nums,k));
	}
	@Test
	public void example2() {
		int nums[]= {1,2,3,1,2,3};
		int k = 2;//FALSE
		System.out.println(containsNearbyDuplicates(nums,k));
	}
	/*
	 * Pseudo code
	1. Create the Hashmap to store the Key and values. Key as arr value and value as index position
	2. Traverse a loop tom find the occurences and duplicated from an array from 0 to array.length
	3. If map contains the num[i] and the difference between the i and j is lesser than or equal to target
	4. Then retuen true else return false
	 */
	private boolean containsNearbyDuplicates(int[] nums, int k) {
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i]) && i - numMap.get(nums[i]) <= k) {
                return true;
            }
            numMap.put(nums[i], i);
        }
        return false;
		
	}
	
	
	
	
}


