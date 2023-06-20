package mandatoryHomeWorks.week3.day5;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstring_Leetcode3 {
	@Test
	public void example() {
		String s = "abcabcbb";
		System.out.println(foundLogestSubstring(s));
	}

	@Test
	public void example1() {
		String s = "bbbbb";
		System.out.println(foundLogestSubstring(s));
	}
	@Test
	public void example2() {
		String s = "pwwkew";
		System.out.println(foundLogestSubstring(s));
	}
	@Test
	public void example3() {
		String s = "abcddabcdef";
		System.out.println(foundLogestSubstring(s));
	}
	/*
	 * Program: Given a string s, find the length of the longest substring without repeating characters.
	 * ----------------------------------------------------------------------------------------------------
	 * pesudo code:
	 * 1. Declare varibale i,j,maxSubStringCount as 0.
	 * 2. Create a Hashset to store the distinct characters.
	 * 3. Traverse a loop until i and j should be reach until string length
	 * 4. Check if the set contain the string of j character
	 * 5. Add values into set
	 * 6. Find the maxSubStringCount ->Math.max returns the max val and substring index starts as i and end index as j-i
	 * 7. remove method used to remove the left when it found the repeating character.
	 * 8. Return the counter
	 * ------------------------------------------
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */

	private int foundLogestSubstring(String s) {
		int i = 0, j = 0, maxSubStringCount = 0; //counter 
		Set<Character> set = new HashSet<Character>();
		while (i < s.length() && j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));// add values in to set
				maxSubStringCount = Math.max(maxSubStringCount, j - i);//Math.max to give you the max val and substring starts from i and end as j-i.
			} 
				  else { set.remove(s.charAt(i++)); }
				 
		}
		return maxSubStringCount;
	}
}
