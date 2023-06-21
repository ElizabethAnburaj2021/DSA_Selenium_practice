package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTrim {
	@Test
	public void example() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int givenLength = 5;
		trimLength(arr1, givenLength);
	}
	@Test
	public void example1() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int givenLength = 0;
		trimLength(arr1, givenLength);
	}
	@Test
	public void example2() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int givenLength = -1;
		trimLength(arr1, givenLength);
	}
	private void trimLength(int[] arr1, int givenLength) {
		int[] arr2=new int[givenLength];
		int m=0;
		for(int i=0;i<arr2.length;i++) {
			arr2[m]=arr1[i];
			m++;
		}
		System.out.println(Arrays.toString(arr2));
	}
	

}
