package mandatoryHomeWorks.Week5.Day1;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MiddleOfLinkedList_876LC {
	@Test
    public void example() {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode middleNode = findMiddle(head);
        System.out.println("Middle node value: " + middleNode.val);
    }
/*
 * Pseudo code:
 * 1. Implement the ListNode class representing a node in a linked list. 
 * Each node contains a value (val) and a reference to the next node (next).
 * 2. The findMiddle method takes the head of the linked list as input and returns the middle node of the list.
 * 3. When the list is empty or contains only one node by returning the head as it is.
   4. Initialize two pointers, slow and fast, both starting at the head of the list.
   5. Move the slow pointer by one step and the fast pointer by two steps in each iteration of the while loop. 
   6. When the fast pointer reaches the end of the list, the slow pointer will be at the middle node.
   7. Finally, we return the node referenced by the slow pointer, which represents the middle node of the list.
 * 
 */
    private static ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move slow pointer by one step and fast pointer by two steps until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
