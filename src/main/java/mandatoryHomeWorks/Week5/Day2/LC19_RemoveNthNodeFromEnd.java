package mandatoryHomeWorks.Week5.Day2;

import org.junit.Test;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

/*
 * pseudo code: 1. Implement the linked list class-> ListNode class representing
 * a node in a linked list. Each node contains a value (val) and a reference to
 * the next node (next). 2. The removeNthFromEnd method takes the head of the
 * linked list and the value of N as input. It uses two pointers (slow and fast)
 * to find the Nth node from the end. 3. create a dummy node (dummy) and set it
 * as the next node of the head. Then, we move the fast pointer N nodes ahead.
 * 4. After that, we move both pointers until the fast pointer reaches the end
 * of the linked list. 5. Once we reach this point, the slow pointer will be
 * pointing to the Nth node from the end. We can remove this node by updating
 * the next reference of the slow pointer.
 * --------------------------------------------------------- Time
 * complexity:O(n) Space complexity:O(1)
 * 
 */
public class LC19_RemoveNthNodeFromEnd {
	@Test
	public void example() {
		// Create a sample linked list
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int n = 2; // The value of N

		System.out.println("Original Linked List:");
		printLinkedList(head);

		// Remove the Nth node from the end
		ListNode newHead = removeNthFromEnd(head, n);

		System.out.println("Linked List after removing " + n + "th node from the end:");
		printLinkedList(newHead);
	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode slow = dummy;
		ListNode fast = dummy;

		// Move the fast pointer n nodes ahead
		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		// Move both pointers until the fast pointer reaches the end
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		// Remove the Nth node from the end
		slow.next = slow.next.next;

		return dummy.next;
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
