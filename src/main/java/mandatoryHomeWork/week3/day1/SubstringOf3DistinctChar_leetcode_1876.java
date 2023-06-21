package mandatoryHomeWork.week3.day1;

import org.junit.Test;

public class SubstringOf3DistinctChar_leetcode_1876 {
	@Test
	public void example() {
		String s="xyzzaz";
		findDistinctCharSubstring(s);
	}
	
	@Test
	public void example1() {
		String s="aababcabc";
		findDistinctCharSubstring(s);
	}
	/* Algorithm: Sliding window
	 * ------------------------------------------------------------------
	 * Problem: A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
-------------------------------------------------------------------------
	 * pesudo code
1. Convert a String into SubString --> Using sliding window (s = "xyzzaz")
i.e: "xyz", "yzz","zza","zaz"
Initialize a integer variable as n and store the length of a string. 
2. Check if n less than 3 then return 0.
3. Declare a count variable and increase every time when the substrings are not equal of each character. 
Declare the a b c to store the char index of a substring.
4. Traverse a loop from 3 to s.length
5. check if a!=b && b!=c && sc!=a;
6. Increase the count.
7. To switch the another set of substring do this.
a=b; b=c;c=s.charAt(i);
8. End loop
9. return count
	 */

	private int findDistinctCharSubstring(String s) {
		int n=s.length();
		
		if(n<3) {
			return 0;
		}
		char a=s.charAt(0), b=s.charAt(1),c=s.charAt(2);
		
		int count=0;
		for(int i=3;i<n;i++) {
			if(a!=b && b!=c && c!=a) count++;
				a=b;
				b=c;
				c=s.charAt(i);
			
		}if(a!=b && b!=c && c!=a) count++;
		System.out.println(count);
		return count;
	}
	

}
