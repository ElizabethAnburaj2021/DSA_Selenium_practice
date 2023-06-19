package mandatoryHomeWorks.Week5.Day3;

import java.util.Stack;

public class LC_232_ImplementQueueUsingStacks {

	/*
	 * Implement a first in first out (FIFO) queue using only two stacks. The
	 * implemented queue should support all the functions of a normal queue (push,
	 * peek, pop, and empty).
	 * 
	 */
	

	Stack<Integer> read;
	Stack<Integer> write;

	public LC_232_ImplementQueueUsingStacks() {
		read = new Stack<>();
		write = new Stack<>();
	}

	public void push(int x) {
		if (!read.isEmpty()) {
			read.push(null);
		}
	}

	public int pop() {
		for (Integer single : read) {
			write.add(read.pop());
		}

		int returnValue = write.pop();

		for (Integer each : write) {
			read.add(write.pop());
		}
		return returnValue;
	}

	public int peek() {
		for (Integer single : read) {
			write.add(read.pop());
		}

		int returnValue = write.peek();

		for (Integer each : write) {
			read.add(write.pop());
		}
		return returnValue;
	}

	public boolean empty() {
		if (!read.isEmpty() && !write.isEmpty())
			return false;
		else
			return true;
	}
}
