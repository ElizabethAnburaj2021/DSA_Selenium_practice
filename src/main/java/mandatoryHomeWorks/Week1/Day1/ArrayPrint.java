package mandatoryHomeWorks.Week1.Day1;

import java.util.Arrays;

import org.junit.Test;

public class ArrayPrint {
	@Test
	public void example() {
	int arr[]= {1,2,3,4,5};
	printArray(arr);
	}
	
	@Test
	public void example1() {
		int arr[]= {};
		printArray(arr);
	}
	@Test
	public void example2() {
		int arr[]= {0};
		printArray(arr);
	}

	private void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}

