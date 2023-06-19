package ExtraPrograms;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class FindSqaures {
	/*
	 *  Given sorted array in non-decreasing order return the array of the squares 
	 *  of each number sorted in non-decreasing order
	 */
	@Test //+ve data
	public void TestData1() {
		int [] num= {2,4,5,6};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(num), 
				new int[] {4,16,25,36}));
		//output-> 4,16,25,36
		
	}
	@Test // Edge data
	public void TestData2() {
		int[] num= {-1,-7,2,6,3};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(num), 
				new int[] {1,4,9,36,49}));
		//output-> 1, 4,9,36,49
	}
	@Test
	public void TestData3() {
		int [] num= {};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(num), 
				new int[] {}));
		//output-> {}
	}
	private int[] squareAndSort(int[] num) {
		for(int i=0;i<num.length;i++) {
			num[i]=num[i]*num[i];		
		}
		Arrays.sort(num);
		return num;
		
	}

}
