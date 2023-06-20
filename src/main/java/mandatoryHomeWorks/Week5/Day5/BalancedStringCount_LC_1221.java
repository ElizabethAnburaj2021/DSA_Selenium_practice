package mandatoryHomeWorks.week5.day5;

import java.util.Stack;

import org.junit.Test;

public class BalancedStringCount_LC_1221 {
	/*
	 * program: Balanced strings are those that have an equal quantity of 'L' and
	 * 'R' characters. Given a balanced string s, split it into some number of
	 * substrings such that: Each substring is balanced. Return the maximum number
	 * of balanced strings you can obtain.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "RLRRLLRLRL" Output: 4 Explanation: s can be split into "RL",
	 * "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
	 * 
	 * Pseudo code:
	 * 1. Declare a integer variable for count the substring
	 * 2. Declare a stack 
	 * 3. Traverse a string each character, so convert string as char array and compare each char in the string using for each
	 * 4. If the stack is empty or top value as char then push the value into stack
	 * 5. else pop the value from the stack
	 * 6. if the stack is empty then increment the count value.
	 * 7. Finally return the count
	 */
	@Test
	public void example() {
		String s = "RLRLRRLLRLRL";
		System.out.println(balancedStringCount(s));//5
	}
	@Test
	public void example1() {
		String s = "RRRRL";
		System.out.println(balancedStringCount(s));//0
	}
	@Test
	public void exapmle2() {
		String s = "LLLL";
		System.out.println(balancedStringCount(s));//0
	}
	@Test
	public void example3() {
		String s="RLRRRLLRLL";
		System.out.println(balancedStringCount(s));//2
	}
	@Test
	public void example4() {
		String s="LLLLRRRR";
		System.out.println(balancedStringCount(s));//1
	}

	private int balancedStringCount(String s) {
		int count=0;
		Stack<Character> st= new Stack<Character>();
		for(char c:s.toCharArray()) {
			if(st.isEmpty()||st.peek()==c) {
				st.push(c);
			}else {
				st.pop();
				if(st.isEmpty()) {
					count++;
				}
			}
		}		//System.out.println(count);
		return count;
	}
}
