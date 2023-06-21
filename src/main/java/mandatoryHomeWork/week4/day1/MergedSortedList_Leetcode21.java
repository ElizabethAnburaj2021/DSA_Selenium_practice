package mandatoryHomeWork.week4.day1;

import org.junit.Test;

public class MergedSortedList_Leetcode21 {
	public class Node{// Class is used to Create a new node 
		int data;// node contains data 
		Node next;// and reference
		
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
		Node node1 = add(1);
		node1.next = add(2);
		node1.next.next = add(4);//1,2,4- list 1
		
		//LinkedList 2
		Node node2 = add(1);
		node2.next = add(3);
		node2.next.next = add(4);// 1,3,4-> list2
		
		mergeSortedList(node1,node2);
//		op: 1,1,2,3,4,4
	}
	
	@Test
	public void example2()
	{
		//LinkedList 1,
		Node node1 = add(1);
		
		//LinkedList 2
		Node node2 = add(1);
		node2.next = add(3);
		node2.next.next = add(4);// 1,3,4-> list2
		
		mergeSortedList(node1,node2);
//		op: 1,1,3,4
	}
	
	@Test
	public void example3()
	{
		//LinkedList 1,
		Node node1 = add(1);
		node1.next = add(2);
		node1.next.next = add(4);//1,2,4- list 1
		
		//LinkedList 2
		Node node2 = add(1);
		
		mergeSortedList(node1,node2);
//		op: 1,1,2,4
	}
	
	@Test
	public void example4()
	{
		//LinkedList 1,
		Node node1 = null;
		
		//LinkedList 2
		Node node2 = add(1);
		node2.next = add(3);
		node2.next.next = add(4);// 1,3,4-> list2
		
		mergeSortedList(node1,node2);
//		op: 1,3,4
	}
	
	@Test
	public void example6()
	{
		//LinkedList 1,
		Node node1 = add(1);
		node1.next = add(2);
		node1.next.next = add(4);//1,2,4- list 1
		
		//LinkedList 2
		Node node2 = null;
		
		
		mergeSortedList(node1,node2);
//		op: 1,2,4
	}
	
	@Test
	public void example8()
	{
		//LinkedList 1,
		Node node1 = add(0);
		
		
		//LinkedList 2
		Node node2 = add(1);
		node2.next = add(3);
		node2.next.next = add(4);// 1,3,4-> list2
		
		mergeSortedList(node1,node2);
//		op: 0,1,3,4
	}
	/*
	 * Pseudo code
	 * 1. Create a new node for merged LinkedList (List1 and List 2)
	 * 2. Temp node for traverse and save values into merged linked list so we create a node as curr and save it in the MergedLinkedList
	 * 3. Traverse a loop when the node1< node2 until both nodes reached the null
	 * 4. If the node1< node 2 then save node1 data into curr node and increment the left list to next node
	 * 5. else save node2 values into curr node and increment the list 2 to next node
	 * 6. Iterate the next node of merged linked list using the curr.next after save the values of a node into merged linked list
	 * 7. If node1 equals to null, then copy the node2 values into merged linkedlist
	 * 8. If node 2 equals to null, then copy the node1 values into merged linkedlist
	 * 9. print all node values using mergenode.next
	 */

	private void mergeSortedList(Node node1, Node node2) {
		Node mergeNode =  new Node();// pseudo point 1
		Node curr = mergeNode;// current node used to store the values at temp so we declare as the merge node
		
		while(node1 != null && node2 != null)
		{
			if(node1.data < node2.data)
			{
				curr.next = node1;// if node1 < node 2 then store the node1 data into curr node
				node1=node1.next;// pointer moves the next node
			}else
			{
				curr.next = node2;
				node2=node2.next;
			}
			curr = curr.next;// Merged Linked list get iterate every time merged list saved the data for a node. it will go to next node using this step.
		}
		if(node1 == null)
		{
			curr.next = node2;
		}
		else
		{
			curr.next = node1;
		}
		printAllNodes(mergeNode.next);
	}

}
