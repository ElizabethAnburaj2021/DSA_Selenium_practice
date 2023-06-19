package mandatoryHomeWorks.Week4.Day2;

import java.util.Stack;

import org.junit.Test;

public class BackspaceStringCompare_Leetcode844 {
	/*
	 * program: Given two strings s and t, return true if they are equal when both
	 * are typed into empty text editors. '#' means a backspace character. Note that
	 * after backspacing an empty text, the text will continue empty. Example 1:
	 * Input: s = "ab#c", t = "ad#c" Output: true Explanation: Both s and t become
	 * "ac".
	 * -----------------------------------------------------------------------------
	 * -------------------- pseudo code: 1. Declare a 2 stack for string 1 and
	 * string 2 2. Return type is boolean we can return true or false 3. Traverse a
	 * loop from 0 to string1 length() 4. Check if the string1 character not equal
	 * to # and do add the values in to stack using push() 5. else if the stack is
	 * not empty then do remove using stack pop() 6. Traverse a loop from 0 to
	 * string2 length() 7. Check if the string2 character not equal to # and do add
	 * the values in to stack using push() 8. else if the stack is not empty then do
	 * remove using stack pop() 9. compare the string 1 = string 2 then return true
	 * else false
	 * -----------------------------------------------------------------------------
	 * ------------------------- time complexity: space complexity:
	 */
	@Test
	public void example() {
		String s1 = "ab#c";
		String s2 = "ad#c";
		System.out.println(backSpaceComparisionString(s1, s2));
	}

	@Test
	public void example1() {
		String s1 = "ab##";
		String s2 = "c#d#";
		System.out.println(backSpaceComparisionString(s1, s2));
	}

	@Test
	public void example2() {
		String s1 = "a#c";
		String s2 = "b";
		System.out.println(backSpaceComparisionString(s1, s2));
	}
	@Test
	public void example3() {
		String s1 = "isfcow#";
		String s2 = "isfco#w#";
		System.out.println(backSpaceComparisionString(s1, s2));
	}

	private boolean backSpaceComparisionString(String s1, String s2) {
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != '#') {
				stack1.push(s1.charAt(i));
			} else if (!stack1.isEmpty()) {
				stack1.pop();
			}
		}
		for (int j = 0; j < s2.length(); j++) {
			if (s2.charAt(j) != '#') {
				stack2.push(s2.charAt(j));
			} else if (!stack2.isEmpty()) {
				stack2.pop();
			}
		}
		if (stack1.equals(stack2)) {
			return true;
		}
		return false;
	}
}
