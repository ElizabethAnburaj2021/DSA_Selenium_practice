package mandatoryHomeWorks.week6.day1;

import org.junit.Test;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Swappairs_LC24 {
	@Test
	public void example() {
		 Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);

	        System.out.println("Original Linked List:");
	        printLinkedList(head);

	        // Swap nodes in pairs
	        Node swappedHead = swapNodesInPairs(head);

	        System.out.println("Linked List after swapping nodes:");
	        printLinkedList(swappedHead);
	}
	/*
	 * pseudo code:
	 * Declare a method called swapNodesInPairs and for print create the printAll()
	 * check if the head equals null and head.next equal to null then return the head
	 * It uses a dummy node (dummy) to simplify the swapping process.
	 * We traverse the linked list, swapping adjacent pairs of nodes using three pointers: prev, firstNode, and secondNode.
	 * Do Swap nodes
	 * Move to the next pair
	 */
	private static Node swapNodesInPairs(Node head) {
		if (head == null || head.next == null) {
            return head; // Return if the list is empty or has only one node
		}
            Node dummy = new Node(0);
            dummy.next = head;
            Node prev = dummy;

            while (head != null && head.next != null) {
                Node firstNode = head;
                Node secondNode = head.next;

                // Swap nodes
                prev.next = secondNode;
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;

                // Move to the next pair
                prev = firstNode;
                head = firstNode.next;
            }return dummy.next;    
	}


	private void printLinkedList(Node head) {
		 Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();		
	}
}
