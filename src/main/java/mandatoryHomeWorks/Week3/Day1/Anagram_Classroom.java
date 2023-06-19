package mandatoryHomeWorks.Week3.Day1;

import java.util.Arrays;

import org.junit.Test;

public class Anagram_Classroom {
	@Test
	public void example() {
		String s1 = "abb";
		String s2 = "eidbdooobab";
		System.out.println(findAnagram(s1, s2));

	}

	/*
	 * Program: Classroom-HW:- Given two strings s1 & s2, return true if s1 is an
	 * anagram of s2 example: String s1="abb"; String s2="eidbdooobab"; Output =>
	 * true since s2 contains s1 (bab is => abb)
	 * ----------------------------------------------------------------------------
	 * pseudo code:
	 * 
	 */
	private boolean findAnagram(String s1, String s2) {

		int[] f1 = new int[26];
		int k = s1.length();
		int[] f2 = new int[26];
		int l = 0;

		for (int i = 0; i < s1.length(); i++) {
			int alpa = (s1.charAt(i) - 'a');
			f1[alpa]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			f2[(s2.charAt(i) - 'a')]++;
			if ((i - l + 1) == k) {
				if (Arrays.equals(f2, f1))
					return true;
				f2[(s2.charAt(l++) - 'a')]--;
			}
		}
		return false;
	}
}
