package mandatoryHomeWork.week4.day5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

class ListNode {
    public ListNode next;
    public Integer val;

    ListNode(int val) {
        this.val = val;
    }
}
/*
 * pseudo code
 * 1. Traverse the linked list and store the values of each node in a list or array.
 * 2. Use two pointers, a slow pointer and a fast pointer, to find the middle of the linked list.
 * 3. Reverse the second half of the linked list starting from the middle node.
 * 4. Compare the values of the first half (from the start to the middle) with the reversed second half (from the middle to the end).
 * 5. If all the values match, the linked list is a Palindrome. Otherwise, it is not.
 */
public class Leetcode234_PalindromeLinkedList {
	@Test
	public void example() {//1,2,2,1
		ListNode node=addNode(1);
		node.next=addNode(2);
		node.next.next= addNode(2);
		node.next.next.next= addNode(1);
		System.out.println(isPalindrome(node));
		
	}
	@Test
	public void example1() {//1,2,2
		ListNode node=addNode(1);
		node.next=addNode(2);
		node.next.next= addNode(2);
		System.out.println(isPalindrome(node));
		
	}
	
	public ListNode addNode(int data) {
		ListNode node = new ListNode(data);
		return node;
	}
		public boolean isPalindrome(ListNode head) {
	        if (head == null || head.next == null) {
	            return true;
	        }
	        
	        // Step 1: Store node values in a list
	        List<Integer> values = new ArrayList<Integer>();
	        ListNode current = head;
	        while (current != null) {
	            values.add(current.val);
	            current = current.next;
	        }
	        
	        // Step 2: Find the middle of the linked list
	        int mid = values.size() / 2;
	        
	        // Step 3: Reverse the second half of the linked list
	        ListNode prev = null;
	        current = head;
	        for (int i = 0; i < mid; i++) {
	            current = current.next;
	        }
	        while (current != null) {
	            ListNode next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        
	        // Step 4: Compare values of first half with reversed second half
	        current = head;
	        for (int i = 0; i < mid; i++) {
	            if (current.val != prev.val) {
	                return false;
	            }
	            current = current.next;
	            prev = prev.next;
	        }System.out.println(head);
	        
	        return true;
	} 
}