package mandatoryHomeWork.week4.day4;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList_LC206 {
	@Test
    public void example() {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = reverseList(head);
        printLinkedList(reversedHead);
    }
/*
 * Pseudo code
 * 1. Implementing the ListNode class representing a node in a linked list. Each node contains a value (val) and a reference to the next node (next).
 * 2. The reverseList method takes the head of the linked list as input and returns the new head of the reversed list.
 * 3. Initialize two pointers, prev and current, to keep track of the previous and current nodes, respectively. We start with prev as null and current as the head of the list.
 * 4. Traverse the loop-> while loop, we iterate through the list until the current node becomes null.
 * 5. Store the next node in the nextNode variable to keep track of the remaining part of the list.
 * 6. Update the next pointer of the current node to point to the previous node (prev). This effectively reverses the connection.
 * 7. Then,move both prev and current pointers one step forward. prev becomes the current node, and current becomes the next node we previously stored.
 * 8. After the loop, prev will be pointing to the last node of the original list, which is now the new head of the reversed list. We return prev.
 * 9. The printLinkedList method is used to print the values of the linked list for verification purposes.
 * ------------------------------------------------------------------
 * Time complexity: O(n)
 * Space Complexity: O(1)
 * -----------------------------------------------------------------
 * 
 */
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

