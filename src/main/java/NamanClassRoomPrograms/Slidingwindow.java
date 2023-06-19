package NamanClassRoomPrograms;

import java.util.Arrays;

import org.junit.Test;

public class Slidingwindow {
	@Test
	public void example() {
	int [] arr= {1,5,2,3,7,1};
	int k=3;
	foundSumOfMax(arr,k);
	}

	private int foundSumOfMax(int[] arr, int k) {
		int sum = 0;
	    int maxSumOfK = 0;
	    for (int i = 0; i < k; i++) {
	        sum += arr[i];
	    }
	    maxSumOfK = sum;
	 // Slide the window and update the maximum sum seen so far
	    for (int i = k; i < arr.length; i++) {
	        sum += arr[i] - arr[i-k];
	        maxSumOfK = Math.max(maxSumOfK, sum);
	    }System.out.println(maxSumOfK);
		return maxSumOfK;
	}	

}
