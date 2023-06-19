package ClassroomPrograms_FromJune16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ValidAnagaram_LC242 {
	@Test
	public void example() {
		String s="anagram";
		String t="nagaram";
		System.out.println(isBoolean(s,t));
	}
	@Test
	public void example1() {
		String s="cat";
		String t="rat";
		System.out.println(isBoolean(s,t));
	}/*
	Pseudo code 1:
	1. Convert the string in to to char array
	2. sort the str 1 array and str 2 array using Arrays.sort()
	3. return the value when both str array are equals. using Arrays.equals()
	-----------------------------------------------------------------------
	Time complexity:O(nlogn)
	Space complexity:O(n)
	---------------------------------------------------------------------
	Pseudo code 2:
	1. Check if the str1 length and str 2 
	*/
	private boolean isBoolean(String s, String t) {
		//Convert the string in to to char array
		char[] sChar=s.toCharArray();
		char[] tChar=t.toCharArray();
		
		//sort the str 1 array and str 2 array using Arrays.sort()
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		return Arrays.equals(sChar, tChar);
	}
	private boolean isBooleanMap(String s, String t) {
		
		 if (s.length() != t.length()) {
	            return false;
	        }

	        Map<Character, Integer> m = new HashMap<>();

	        // Increment frequency of characters in string s
	        for (char ch : s.toCharArray()) {
	            m.put(ch, m.getOrDefault(ch, 0) + 1);
	        }

	        // Decrement frequency of characters in string t
	        for (char ch : t.toCharArray()) {
	            if (!m.containsKey(ch) || m.get(ch) == 0) {
	                return false;
	            }
	            m.put(ch, m.get(ch) - 1);
	        }

	        return true;
		
	}
}
