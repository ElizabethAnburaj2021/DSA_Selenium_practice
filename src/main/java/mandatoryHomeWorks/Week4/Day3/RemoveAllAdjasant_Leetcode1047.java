package mandatoryHomeWorks.week4.day3;

import java.util.Stack;

import org.junit.Test;

public class RemoveAllAdjasant_Leetcode1047 {
/*
 * program:
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
------------------------------------------------------------------------------------------------
Pseudo code:
1. Declare a stack
2. Declare a String builder -> To Convert stack into string in the return time so we used the string builder.
3. Traverse a loop from 0 to string length 
4. Check if the stack is not empty and the input string character equals to top value of stack then remove using the peep() and pop().
5. else store the character into stack using push()
6. Traverse the loop for each times of stack to convert the string
7. Do store all the values into String builder using append()
8. Finally return the values in to string
----------------------------------------------------------------
Clue: Use only string builder for another approach to reduce the time complexity.
Time Complexity: 
 */
	@Test
	public void example() {
		String s="abbaca";
		System.out.println(removeAllDuplicates(s));
	}
	@Test
	public void example1() {
		String s="azxxzy";
		System.out.println(removeAllDuplicates(s));
	}
	@Test
	public void example2() {
		String s="bbeerra";
		System.out.println(removeAllDuplicates(s));
	}
	private String removeAllDuplicates(String s) {
		Stack<Character> stack=new Stack<Character>();
		//Convert stack into string in the return time so we used the string builder here.
		StringBuilder sb=new StringBuilder();
		//traverse the string from 0 to string length
		for(int i=0;i<s.length();i++) {
			//Compare the stack contains the duplicate value using the peek()
			if(!stack.isEmpty()&&stack.peek()==s.charAt(i)) {
				stack.pop();
			}else {// stack doesn't contain the duplicate push value into stack
				stack.push(s.charAt(i));
			}
		}//using for each we can get the values from stack and store it in string using append()
		for(Character ch:stack) {
			sb.append(ch);
		}
		return sb.toString();
	}
	/*
	 * public String removeDuplicates(String S) { StringBuilder sb = new
	 * StringBuilder(); char[] chars = S.toCharArray();
	 * 
	 * for (char c : chars) { if (sb.length() > 0 && sb.charAt(sb.length() - 1) ==
	 * c) { sb.deleteCharAt(sb.length() - 1); } else { sb.append(c); } }
	 * 
	 * return sb.toString(); }
	 */
}
