package mandatoryHomeWorks.week5.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AnagramFinder_LC438 {
	@Test
    public void example() {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> anagramIndices = findAnagrams(s, p);
        System.out.println("Anagram indices: " + anagramIndices);
    }
/*
 * Pseudo code
 * 1. The findAnagrams method takes the input string s and the target string p and returns a list of indices where anagrams of p start in s.
 * 2. check if the length of s is smaller than p. If it is, we return an empty list since anagrams are not possible.
 * 3. Create two frequency maps: targetFreqMap to store the frequency of characters in p and currentFreqMap to store the frequency of characters in the current sliding window.
 * 4. The targetFreqMap by iterating through each character in p and updating its frequency in the map.
 * 5. Initialize two pointers, left and right, to denote the start and end of the sliding window, and a count variable to keep track of the number of matching characters in the current window.
 * 6. For each character at right, we update its frequency in the currentFreqMap.
   7. If the character is present in targetFreqMap and its frequency in targetFreqMap is greater than or equal to its frequency in currentFreqMap, we increment the count.
   8. If the window size (right - left + 1) becomes equal to the length of p, we check if the count is equal to the length of p.
   -----------------------------------------------------------------------------------
   Time complexity:O(n)
   Space complexity:O(1)
   -----------------------------------------------------------------------------------
 */
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramIndices = new ArrayList<>();
        if (s.length() < p.length()) {
            return anagramIndices;
        }

        Map<Character, Integer> targetFreqMap = new HashMap<>();
        Map<Character, Integer> currentFreqMap = new HashMap<>();

        for (char ch : p.toCharArray()) {
            targetFreqMap.put(ch, targetFreqMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            currentFreqMap.put(currentChar, currentFreqMap.getOrDefault(currentChar, 0) + 1);

            if (targetFreqMap.containsKey(currentChar) && targetFreqMap.get(currentChar) >= currentFreqMap.get(currentChar)) {
                count++;
            }

            if (right - left + 1 == p.length()) {
                if (count == p.length()) {
                    anagramIndices.add(left);
                }

                char leftChar = s.charAt(left);
                if (targetFreqMap.containsKey(leftChar) && targetFreqMap.get(leftChar) >= currentFreqMap.get(leftChar)) {
                    count--;
                }
                currentFreqMap.put(leftChar, currentFreqMap.get(leftChar) - 1);

                left++;
            }

            right++;
        }

        return anagramIndices;
    }
}

