package ExtraPrograms;

import org.junit.Test;

public class Distinct_number {
	@Test
	public void example1() {
		int [] arr= {1,2,2,3,4};
		findDistinctNum(arr);
		
	}
 private void findDistinctNum(int [] arr) {
	 for(int i=0;i<=arr.length-2;i++) {
		 if(arr[i]!=arr[i+1]) {
			 System.out.println(arr[i]);
		 }	 
	 }
	 System.out.println(arr.length-1);
 }
}
