package NamanClassRoomPrograms;

import java.util.Arrays;

import org.junit.Test;

public class SlidingWindow_DynamicType {
	@Test
	public void example() {
	int arr[]= {1,2,3,2,1};
	int k=7;
	findDesiredSum1Occurance(arr,k);
	System.out.println(findDesiredSum1Occurance(arr,k));
	}

	private int[] findDesiredSum1Occurance(int[] arr, int k) {
		    int sum = 0, start = 0; int i=0;
		    for (;i<arr.length;i++) {
		    	sum += arr[i];
		    }
		    if(sum>k && start<=i){
		    	sum-=arr[start];
		    	start++;
	    }
		    if(sum==k) {
		    	System.out.println(Arrays.toString(arr));
		    	//return arr;
		    }
			return arr;
		   
	}
}
