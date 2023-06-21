package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class LeetCode268_MissingNumber {
	@Test
	public void example() {
		int arr[] = { 0, 1, 3 };
		missingNumber(arr);
		System.out.println(missingNumber(arr));
		
	}
	@Test
	public void example1() {
		int arr[] = {0,1};
		missingNumber(arr);
		System.out.println(missingNumber(arr));
	}
	@Test
	public void example2() {
		int arr[] = {9,6,4,2,3,5,7,0,1};
		missingNumber(arr);
		System.out.println(missingNumber(arr));
	}
	/* 
	 * pseudo code
	 * 1. Declare n value
	 * [n should be arr.length]
	 * 2. Find sum of expected sum range between [0-n]
	 * i.e n*(n+1)/2
	 * 3. Declare the sum of without missing number as 0
	 * 4. create for loop to get the sum of all values in an array
	 * 5. i.e Addition of assignment operator arr[i]
	 * 6. Missing No equal to subtraction of sum_0ToN_Range and sum_withoutMissingNum
	 * 7. Return missing number
	 * 8. print the values.
	 */

	private int missingNumber(int arr[]) {
		int n = arr.length;
	    int sum_0ToN_Range = n * (n + 1) / 2;
	    
	    int sum_withoutMissingNum = 0;
	    for (int i = 0; i < n; i++) {
	    	sum_withoutMissingNum += arr[i];
	    }
	    
	    int missingNumber = sum_0ToN_Range - sum_withoutMissingNum;
	    return missingNumber;
	    
	}

}
