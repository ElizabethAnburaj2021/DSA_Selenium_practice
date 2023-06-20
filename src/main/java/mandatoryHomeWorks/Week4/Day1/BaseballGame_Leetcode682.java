package mandatoryHomeWorks.week4.day1;

import java.util.Stack;

import org.junit.Test;

public class BaseballGame_Leetcode682 {
	@Test
	public void example() {
		String[] ops = { "5", "2", "C", "D", "+" };
		System.out.println(stackImpLearnings(ops));
	}

	@Test

	public void example1() {
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(stackImpLearnings(ops));

	}

	@Test
	public void example2() {
		String[] ops = { "1", "C" };
		System.out.println(stackImpLearnings(ops));
	}

	/*
	 * Pseudo code 1. Declare a Stack with integer data type. 
	 * 2. If the input is
	 * integer then push elements in to the stack 
	 * 3. If D then multiply the last 2
	 * integer using peek 4. If the value is + then add the previous two values in
	 * the stack using the top value remove and store it in the variable as current
	 * with previous value and add (pop , add and push) 5. Finally add the all
	 * elements through iteration with pop until stack is empty
	 */
	private int stackImpLearnings(String[] ops) {
// Declare a stack
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("C") && !stack.isEmpty()) {
				stack.pop();
			} else if (ops[i].equals("D") && !stack.isEmpty()) {
				stack.push(2 * stack.peek());
			} else if (ops[i].equals("+") && stack.size() >= 2) {
				int currentTopVal = stack.pop();
				int currrentTopPrev = stack.peek();
				stack.push(currentTopVal);
				stack.push(currentTopVal + currrentTopPrev);
			} else {
				try {
					stack.push(Integer.parseInt(ops[i]));
				} catch (NumberFormatException e) {
				}
			}
		}

		for (int score : stack) {
			sum += score;
		}
		return sum;
	}
}
