package mandatoryHomeWork.week5.day5;

import org.junit.Test;

public class AnagramSteps_LC1347 {
	@Test
	public void example() {
		String s = "leetcode";
		String t = "codeleet";

		int steps = minStepsToAnagram(s, t);
		System.out.println("Minimum steps to make two strings anagrams: " + steps);
	}
	/*
	 * pesudo code 1. Initialize an integer array freq of size 26 to represent the
	 * frequency of lowercase letters. 2. Iterate through each character in string s
	 * and increment the corresponding frequency in the freq array. 3. Then, iterate
	 * through each character in string t and decrement the corresponding frequency
	 * in the freq array. 4. The freq array contains positive values for characters
	 * that are extra in s and negative values for characters that are extra in t.
	 * 5. The minimum steps by iterating through the freq array and adding the
	 * absolute values of negative frequencies to the steps variable. 6. Finally, we
	 * return the steps value, which represents the minimum number of steps required
	 * to make s and t anagrams.
	 * ----------------------------------------------------------------------- Time
	 * complexity:O(n) Space complexity:O(1)
	 * ---------------------------------------------------------------------------
	 */

	private static int minStepsToAnagram(String s, String t) {
		int[] freq = new int[26]; // Frequency array for lowercase letters

		// Count the frequency of characters in string s
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		// Decrement the frequency of characters in string t
		// If a character is not present in string s, it will become negative in freq
		// array
		for (char c : t.toCharArray()) {
			freq[c - 'a']--;
		}

		int steps = 0;

		// Calculate the absolute sum of all negative values in freq array
		// These negative values represent the characters that are extra in string t
		for (int f : freq) {
			if (f < 0) {
				steps += Math.abs(f);
			}
		}

		return steps;
	}
}
