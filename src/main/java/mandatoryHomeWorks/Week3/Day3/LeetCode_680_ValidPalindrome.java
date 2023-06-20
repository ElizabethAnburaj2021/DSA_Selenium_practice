package mandatoryHomeWorks.week3.day3;

import org.junit.Test;

public class LeetCode_680_ValidPalindrome {
	@Test
	public void example() {
		String s = "aba";
		System.out.println(validPalindrome(s));
	}

	@Test
	public void example1() {
		String s = "abca";
		System.out.println(validPalindrome(s));
	}

	@Test
	public void example2() {
		String s = "abc";
		System.out.println(validPalindrome(s));
	}

	/*
	 * Program: Given a string s, return true if the s can be palindrome after
	 * deleting at most one character from it.
	 */
	private boolean validPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
			}
			i++;
			j--;
		}
		return true;

	}

	private boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
