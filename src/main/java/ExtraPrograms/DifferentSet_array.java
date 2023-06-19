package ExtraPrograms;

import org.junit.Test;

public class DifferentSet_array {
	/*
	 * This problem to analysis about the O[n*m]
	 * Problem: find the intersection of the given 2 arrays
	 */
	@Test
	public void example2() {
		int[] arr1= {1,2,3,4,5,6,7,8,9,10};
		int[] arr2= {5};
		findArrayIntersection(arr1, arr2);
		//5
	}

	private void findArrayIntersection(int[] arr1, int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
