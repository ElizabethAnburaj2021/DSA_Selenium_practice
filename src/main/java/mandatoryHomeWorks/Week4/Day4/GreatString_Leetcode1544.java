package mandatoryHomeWorks.week4.day4;

import java.util.Stack;

import org.junit.Test;

public class GreatString_Leetcode1544 {
	/*
	 * program:
	 * Given a string s of lower and upper case English letters.
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
Notice that an empty string is also good.
Example 1:
Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
----------------------------------------------------------------------------------------------------------------------------
pseudo code:
1. Declare a stack 
2. Declare a string builder to convert the stack into string while return time
3. traverse a loop-> From 0 to String length
4. Check if the stack contains value and math of absolute difference between stack's top value and string character are equals to 32 then do remove the value from  stack using peek() and pop()
5. else store the values into stack using push() 
6. Traverse a loop for each time to convert the stack values in to string using string builder method append
7. return the string using toString() 
--------------------------------------------------------------
Time complexity:
space complexity:
	 */
	@Test
	public void example() {
		String str="abBAcC";
		System.out.println(findGreatString(str));
	}
	@Test
	public void example1() {
		String str="s";
		System.out.println(findGreatString(str));
	}
	@Test
	public void example2() {
		String str="leEeetcode";
		System.out.println(findGreatString(str));
	}
	@Test
	public void example3() {
		String str="loveEuUyou";
		System.out.println(findGreatString(str));
	}
	private String findGreatString(String str) {
		Stack<Character> stack= new Stack<Character>();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(!stack.isEmpty()&&Math.abs((stack.peek()-str.charAt(i)))==32) {
				stack.pop();
			}else {
				stack.push(str.charAt(i));
			}
		}for(Character ch:stack) {
			sb.append(ch);
		}
		return sb.toString();
	}

}
