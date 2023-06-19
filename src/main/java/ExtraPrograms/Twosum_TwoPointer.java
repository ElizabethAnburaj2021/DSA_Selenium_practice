package ExtraPrograms;

import org.junit.Test;

public class Twosum_TwoPointer {
/*
 * Problem: Sum of two indices is equal to K, If yes, then print. if k value is not there in the array then throw exception
 * Using tow pointer approach
 */
	
	@Test
	public void TestData1() { // +ve data
		int num[]= {1,2,2,3,4,5,9};
		int k=4;	
		twosum_twopinter(num, k);
	}
	
	@Test
	public void TesData2(){//edge
		int num[]= {1,2,2,3,4,6,7};
		int k=5;
		twosum_twopinter(num, k);
	}
	
	@Test
	public void TestData3() { // -ve
		int num[]= {1,2,3,4,5};
		int k=40;
		twosum_twopinter(num, k);
	}
	/*
	 * pseudo code for this problem
	 *1) Declare left and right, left index starts as 0, right as last index
	 *2) Loop through until left is smaller than the right
	 *   a) sum of left index with right index
	 *   b) sum==k, then we got it. print value
	 *   c) sum > k , then Decrement the right
	 *   d) sum < k, then Increment the left
	 * 
	 */
	
	public void twosum_twopinter(int num[], int k) {
		
		int left=0; int right=num.length-1;
		boolean bFound=false;
		
		while(left< right) {
			int sum= num[left] + num[right];
			if(sum==k) {
				System.out.println(left+","+right);
			bFound= true;
			break;
		} 
		else if(sum < k)left++;
			else right--;
		}
		if(!bFound) 
			throw new RuntimeException("No match Found");
	}
}
