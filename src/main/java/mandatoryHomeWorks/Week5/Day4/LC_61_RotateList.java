package mandatoryHomeWorks.Week5.Day4;

import org.junit.Test;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class LC_61_RotateList {
	/*
	 * pseudo code 1. Implement the Linked List class 2. Find the length of the
	 * linked list to determine the effective rotation count. 3. Adjust the rotation
	 * count to ensure it is within the length of the linked list. 4. Move the
	 * pointer to the (length - rotation count)th node. 5. Adjust the pointers to
	 * rotate the list. 6. Return the new head of the rotated list.
	 */

	@Test
	public void example() {
		// Create a sample linked list
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int k = 2; // Number of rotations

		System.out.println("Original Linked List:");
		printLinkedList(head);

		// Rotate the list
		ListNode rotatedHead = rotateRight(head, k);

		System.out.println("Rotated Linked List:");
		printLinkedList(rotatedHead);
	}

	private static ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k == 0) {
			return head;
		}

		// Calculate the length of the linked list
		int length = 1;
		ListNode tail = head;
		while (tail.next != null) {
			tail = tail.next;
			length++;
		}

		// Adjust the rotation count
		k = k % length;
		if (k == 0) {
			return head; // No rotation needed
		}

		// Find the (length - k)th node
		ListNode curr = head;
		for (int i = 0; i < length - k - 1; i++) {
			curr = curr.next;
		}

		// Adjust pointers to rotate the list
		ListNode newHead = curr.next;
		curr.next = null;
		tail.next = head;

		return newHead;
	}

	private static void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
}
