package mandatoryHomeWork.week4.day2;

import org.junit.Test;

public class RemoveDuplicate_Leetcode32 {
	public class Node{// Class is used to Create a new node 
		int data;// node contains data 
		Node next;// and reference
		Node prev;
		
		Node(){// Constructor for default one
			next=null;
		}
		
		Node(int key){// parameter constructors for the node suppose to contain values
			this.data = key;
			next=null;
		}
	}
	public Node add(int data) // add method is used to add a value in to node
	{
		Node node = new Node(data);//add a value for newly created a node and save it in the same node
		return node;
	}
	public void printAllNodes(Node node)// Print method used to print all the data in the nodes
	{
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;// create a relationship to traverse a nodes using next
		}
	}
	@Test
	public void example1()
	{
		//LinkedList 1,
		Node node = add(1);
		node.next = add(1);
		node.next.next = add(2);
		node.next.next.next= add(2);
		Node result = removeDuplicate(node);
		printAllNodes(result);
		//op: 1,2
	}
	
	@Test
	public void example2()
	{
		//LinkedList 1,
		Node node = add(1);
		node.next = null;
		Node result = removeDuplicate(node);
		printAllNodes(result);
		//op: 1,2
	}
	/*
	 * Pseudo code
	 * 1. Decalre a variable called prev and curr 
	 * 2. Set value for prev is equal to Headnode and curr equal to headnode.next
	 * 3. Traverse a nodes until the curr is not equal to 0
	 * 4. Check if the curr node data equals to prev node data
	 * 5. Then save prev.next=curr.next
	 * 6. else prev=curr
	 * 8. Increment the next node using the curr.next
	 * 9. Finally return the node.
	 */
	private Node removeDuplicate(Node node) {
		Node prev=node, curr=node.next;
		if(prev==null|| curr==null)return node;
		while(curr!=null) {
			if(prev.data==curr.data) {
				prev.next=curr.next;
			}
			else
				prev=curr;
			curr=curr.next;
			}return node;
		}
}
