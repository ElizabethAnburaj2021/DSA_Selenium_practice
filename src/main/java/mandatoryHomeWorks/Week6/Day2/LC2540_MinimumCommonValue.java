package mandatoryHomeWorks.Week6.Day2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LC2540_MinimumCommonValue {
	/*
	 * program: Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.

pseudo code:
1. Declare set-> set will not allow duplicates. So we store the num1 values into set.
2. Declare result variable.
3. Traverse a loop -> to store the num1 values using for each
4. add values into set
5. Traverse a loop-> to check the num2 values contains num1 then say result=num
6. then break
7. Finally return the result.
	 */
	
@Test
public void example() {
	int num1[]= {1,2,3,4};
	int num2[]= {2,3,4};
}
@Test
public void example1() {
	int num1[]= {};
	int num2[]= {1,2,3,4};
	findMinimumCommonValue(num1,num2);
}
@Test
public void example2() {
	int num1[]= {8,9,99,100,-99};
	int num2[]= {9,-99,-100};
	findMinimumCommonValue(num1,num2);
}
@Test
public void example3() {
	int num1[]= {0,12};
	int num2[]= {0};
	findMinimumCommonValue(num1,num2);
}

private int findMinimumCommonValue(int[] num1, int[] num2) {
	Set<Integer> s=new HashSet<Integer>();
	int result=-1;
	for(int num:num1) {
		s.add(num);
	}
	for(int num:num2) {
		if(s.contains(num)) {
			result=num;
			break;
		}
	}
	return result;
}
}
