package mandatoryHomeWorks.week2.day3;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode_942_DI_String_Match {
	@Test
	public void example() {
		String s = "IDID";// [0,4,1,3,2]
		stringDIMatch(s);
	}

	@Test
	public void example1() {
		String s = "IDI";// [0,1,2,3]
		stringDIMatch(s);
	}

	@Test
	public void example2() {
		String s = "DDI";// [3,2,0,1]
		stringDIMatch(s);
	}
	/*
	 * 1. Declare n variable with the length of an input string
	 * 2. Declare an Integer array as n+1 length, Because as input and returns an array of integers representing 
	 a valid permutation of [0, 1, ..., n] based on the string.
	 * 3. Declare the 2 pointers as low and high. Low as 0, and high as n.
	 * 4. Traverse a loop from 0 to n and check if the char of the string matches I
	 * 5. Then save low++ to result[i]
	 * 6. else high-- to result[i]
	 * 7. Result of n is equal to either low or high. Becuase both are equal at this point
	 * 8. return result array.
	 */

	private int[] stringDIMatch(String s) {
		int n = s.length();
		int[] result = new int[n + 1];
		int low = 0;
		int high = n;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I') {
				result[i] = low++;
			} else {
				result[i] = high--;
			}
		}

		result[n] = low; // or high, since low == high at this point
		System.out.println(Arrays.toString(result));

		return result;
	}
}
