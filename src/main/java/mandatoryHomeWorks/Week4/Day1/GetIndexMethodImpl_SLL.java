package mandatoryHomeWorks.week4.day1;

import org.junit.Test;

public class GetIndexMethodImpl_SLL {
	@Test
	public void example() {
		Node node=addNode(10);
		node.next=addNode(20);
		node.next.next= addNode(30);
		int index=2;
		System.out.println(getIndex(index, node));
		
	}

	public class Node {
		int data;
		public Node next;
		

		public Node(int key) {
			this.data = key;
			next = null;
		}
	}

		public Node addNode(int data) {
			Node node = new Node(data);
			return node;
		}
		/*
		 * Pseudo code
		 * 1. Declare counter variable as 0
		 * 2. indexVal is equal to 0
		 * 3. Traverse a loop until node not equal to 0
		 * 4. check if the counter equals to index
		 * 5. Then save node.data into indexVal
		 * 6. Then break
		 * 7. Do the counter increment and to go next node. i.e. nod=node.next
		 * 8. Return indexVal
		 */

		// getIndex method implementation
		public int getIndex(int index, Node node) {
			int counter = 0;
			int indexVal = 0;

			while (node != null) {
				if (counter == index) {
					indexVal = node.data;
					break;
				}
				counter++;
				node=node.next;
			}
			return indexVal;
		}
		
		
	}


