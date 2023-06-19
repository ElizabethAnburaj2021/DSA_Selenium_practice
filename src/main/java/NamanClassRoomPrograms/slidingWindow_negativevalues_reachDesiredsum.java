package NamanClassRoomPrograms;

import java.util.HashMap;

import org.junit.Test;

public class slidingWindow_negativevalues_reachDesiredsum {
	@Test
	public void example() {
		int arr []= {10,15,-5,15,-10,0};
		int k=15;
		findDesiredSum(arr,k);
	}

	private void findDesiredSum(int[] arr, int k) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++){
	        sum+=arr[i];
	        if(hm.containsKey(sum-k)){
	            System.out.println(hm.get(sum-k) + "  " + i);
	            break;
	        }
	        hm.put(sum, i);
	    }

}

}
