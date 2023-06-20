package mandatoryHomeWorks.week2.day5;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode88_MergeArray {

	@Test
	public void example() {
		int arr[]= {1,2,3,0,0,0};
		int arr1[]= {2,5,6};
		int m=3;
		int n=3;
		mergeArray(arr,arr1,m,n);
	}
	@Test
	public void example1() {
		int arr[]= {1,2,3,0,0,0};
		int arr1[]= {4,5,6};
		int m=3;
		int n=3;
		mergeArray(arr,arr1,m,n);
	}
	/*
	 * Pseudo code 
	 * 1. Declare a 3 integer variables i,j,k. i should be m-1, j should be n-1 and k is m+n-1
	 * i.e 3-2=1,3-1=2,(3+3)-1=5=> i=2,j=2,k=5
	 * 2. Outer loop-> Traverse the array when i and j >=0, then check
	 * 3. Inner loop- >If arr[i--]<arr[j--];//i-- means the length-1
	 * 4. True, then arr[k--]=arr1[j--]
	 * 5. else arr[k--]>arr1[j--]
	 * 6. Print the array
	 * Time complexity:0(n)
	 * Space complexity: O(m+n)-1
	 */

	private void mergeArray(int[] arr, int[] arr1, int m, int n) {
		int i=m-1; int j=n-1;int k=m+n-1;
		while(i>=0 && j>=0) {
			if(arr[i]<arr1[j]) {
				arr[k--]=arr1[j--];
			}else {
				arr[k--]=arr[i--];
			}
		}System.out.println(Arrays.toString(arr));
	}
}
