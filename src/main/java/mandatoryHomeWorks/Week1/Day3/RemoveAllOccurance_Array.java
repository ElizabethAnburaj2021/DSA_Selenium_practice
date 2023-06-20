package mandatoryHomeWorks.week1.day3;

import java.util.Arrays;

import org.junit.Test;

public class RemoveAllOccurance_Array {
	@Test
	public void example() {
		int[] arr = { 1, 2, 1, 4, 1, 1 };
		int removeIndex = 5;
		removeOccurrence(arr, removeIndex);
	}
	
	@Test
	public void example1() {
		int[] arr = { 2,3,4, 2, 1, 4,2};
		int removeIndex = 2;//{3,4,1,4}
		removeOccurrence(arr, removeIndex);
	}
	@Test
	public void example2() {
		int[] arr = { 4,3,4,2,1,4,2};
		int removeIndex = 0;//op: {3,2,1,2}
		removeOccurrence(arr, removeIndex);
	}
	
/*Pseudocode
1) Create an the input array called arr
2) Declare the integer variable removeIndex =5
3) Loop the Array and find the number of occurence of index 5
4) Create a new array with arr.length-n
5) Create int m=0 to index the new array
6) create for loop and traverse left to right
7) if condition - if reverse index not matching with removeIndex value then push the index value from arr[i] to arr1[m]
8) return the arr1.
*/

	private void removeOccurrence(int[] arr, int removeIndex) {
		int n=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] == arr[removeIndex])
			{
				n=n+1;
			}
		}
		
		//Create a new array length-n
		int[] arr1 = new int[arr.length-n];
		
		int m=0;
		
		for(int j=0;j<=arr.length-1;j++)
		{
			if(arr[j] != arr[removeIndex])
			{
				arr1[m] = arr[j];
				m++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
