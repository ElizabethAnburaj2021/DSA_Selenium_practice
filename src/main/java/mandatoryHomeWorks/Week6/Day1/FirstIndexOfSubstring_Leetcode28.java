package mandatoryHomeWorks.Week6.Day1;

import org.junit.Test;

public class FirstIndexOfSubstring_Leetcode28 {
	/*
	 * program: Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
--------------------------------------------------------------------------------------
pseudo code:
Solution 1 pesudo code:
1. Traverse a loop from 0 to needle length+1
2. check the str 1 character equal to str 2 first character
3. str 1 substring of i and str2 of length+i equal to str2 i.e. haystack.substring(i,needle.length()+i).equals(needle)
4. Then retun i
5. else return -1.
----------------------------------------------------------------------------------------
solution 2 pseudo code:
1. Declare a variable to store the value -> str1 indexof value of str 2 using indexOf() in string
2. Check if the variable is not equal to -1 
3. If the variable as not equal to -1 then print the index value
4. else return -1
---------------------------------------------------------------------
	 */
	@Test
	public void example() {
		String haystack = "Hitachi" ;
		String	needle = "chi";
		System.out.println(foundFirstOccuranceOfNeedle(haystack,needle));
	}
	@Test
	public void example1() {
		String haystack = "sadbutsad" ;
		String	needle = "sad";
		System.out.println(foundFirstOccuranceOfNeedle(haystack,needle));
	}
	@Test
	public void example2() {
		String haystack = "leetcode" ;
		String	needle = "leeto";
		System.out.println(foundFirstOccuranceOfNeedle(haystack,needle));
	}
	private int foundFirstOccuranceOfNeedle(String haystack, String needle) {
		//solution 1
		for(int i=0;i<haystack.length()-needle.length()+1;i++) {
			//check the str 1 character equal to str 2 first character
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.substring(i,needle.length()+i).equals(needle))
				{
					return i;
				} 
			}
		}
		//solution 2
		/*int index=haystack.indexOf(needle);
		if (index!=-1) {
			System.out.println("Substring '" + needle + "' found at index: " + index);
		}else
		{
		System.out.println("Substring '" + haystack + "' not found in the string."+" "+-1);
		}
		
	}
*/
		return -1;
}
}
