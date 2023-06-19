package mandatoryHomeWorks.Week4.Day3;

import org.junit.Test;

public class LC203_RemoveDuplicateLL {
	/*
	 * Pseudo code:
	 * 1. Implement the LinkedList using Node class, add() and PrintAll().
	 * 2. Create a temp variable to store the new node value
	 * 3. Say current node equal to head node
	 * 4. Traverse a loop until the current.next not equal to null
	 * 5. Then check if the current.next.val equal to val
	 * 6. if true, then curent.next as creent.next.next  
	 * 7. else current node as current.next 
	 * 8. finally return the temp.next
	 */
	class Node {
		int val;
		Node next;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
	public Node addValue(int data) {
		Node node = new Node(data);
		return node;
	}
	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	@Test
	public void example1() {
		int val = 2;
		Node head = new Node(1);//1,2,3,4
		head.next = addValue(1);
		head.next.next = addValue(2);
		head.next.next.next = addValue(3);
		head.next.next.next.next = addValue(4);
		head.next.next.next.next.next = addValue(4);
		removeElement(head, val);
		printAllNodes(removeElement(head, val));

	}
	
	@Test
	public void example2() {
		int val = 7;//7
		Node head = new Node(7);
		head.next = addValue(7);
		head.next.next = addValue(7);
		head.next.next.next = addValue(7);
		printAllNodes(removeElement(head, val));
	}
	
	private Node removeElement(Node head, int val) {
		Node temp = new Node(-1);
		Node current = head;
		while(current.next != null)
		{
			if(current.next.val == val)
			{
				current.next = current.next.next;
			}else
			{
				current = current.next;
			}
		}
		return temp.next;		
	}

}
