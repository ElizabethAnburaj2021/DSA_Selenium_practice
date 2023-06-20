package mandatoryHomeWorks.week5.day5;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListII_LC92 {
	/*
	 * pseudo code:
	 * 1. Implementing the LL class and the ListNode class representing a node in a linked list. 
	 * Each node contains a value (val) and a reference to the next node (next).
	 * 2. The reverseBetween method takes the head of the linked list, the starting position (m), and the ending position (n) of the sublist to be reversed. 
	 * It reverses the sublist from position m to n and returns the head of the modified list. 
	 * 3. If the list is empty, contains only one node, or m is equal to n, we return the head as it is.
	 * 4. Create a dummy node (dummy) and set it as the next node of the head. This allows us to handle the case where m is 1.
	 * 5. Then traverse the list until we reach the (m-1)th node, keeping track of the (m-1)th node as prev and the mth node as start.
	 * 6. Reverse the sublist from position m to n by adjusting the next references of the nodes accordingly.
	 * 7. printLinkedList used to print the values in console.
	 */
	@Test
    public void example() {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int m = 2; // Starting position of the sublist
        int n = 4; // Ending position of the sublist

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the sublist from position m to n
        ListNode reversedHead = reverseBetween(head, m, n);

        System.out.println("Reversed Linked List from position " + m + " to " + n + ":");
        printLinkedList(reversedHead);
    }

    private static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Traverse to the (m-1)th node
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }

        ListNode start = prev.next; // mth node
        ListNode current = start.next;

        // Reverse the sublist from position m to n
        for (int i = m; i < n; i++) {
            ListNode next = current.next;
            current.next = prev.next;
            prev.next = current;
            start.next = next;
            current = next;
        }

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

