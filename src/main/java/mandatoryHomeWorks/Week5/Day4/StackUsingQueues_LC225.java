package mandatoryHomeWorks.week5.day4;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues_LC225 {
	/*
	 * pseudo code:
	 * 1. Implement the two queues (queue1 and queue2) to simulate the stack operations.
	 * 2. The push operation adds a new element to an empty queue (queue2). 
	 * Then, it moves all the elements from the main queue (queue1) to the empty queue (queue2) by alternating the references of the queues. 
	 * This ensures that the new element is always at the front of the main queue, simulating the behavior of a stack.
	 * 3. The pop operation simply removes and returns the top element from the main queue (queue1).
	 * 4. The top operation returns the top element from the main queue (queue1) without removing it.
	 * 5. The isEmpty operation checks if the main queue (queue1) is empty.
	 * 6. We push elements onto the stack, perform pop and top operations, and check if the stack is empty.
	 */
	@Test
    public void example() {
		StackUsingQueues_LC225 stack = new StackUsingQueues_LC225();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3

        stack.pop();

        System.out.println("Top element: " + stack.top()); // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues_LC225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        // Add the new element to an empty queue (queue2)
        queue2.offer(value);

        // Move all elements from the main queue (queue1) to the empty queue (queue2)
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // Swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Remove and return the top element from the main queue (queue1)
        return queue1.poll();
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Return the top element from the main queue (queue1) without removing it
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    

}


