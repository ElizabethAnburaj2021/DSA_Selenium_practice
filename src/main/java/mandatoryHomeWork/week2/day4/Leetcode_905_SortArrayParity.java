package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;

public class Leetcode_905_SortArrayParity {
	@Test
	public void example() {
		int arr[]= {3,1,2,4};
		sortEvenOdd(arr);
	}

	private void sortEvenOdd(int[] arr) {
		int left=0; int right=arr.length-1;
		while(left<right) {
			while(left<right &&arr[left]%2==0)left++;
			while(left<right && arr[right]%2==1)right--;
			//swap
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}System.out.println(Arrays.toString(arr));				
		}
	}
