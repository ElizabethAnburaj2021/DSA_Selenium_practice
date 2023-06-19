package ExtraPrograms;

import org.junit.Test;

public class NotationType1 {
	// Type 1 O[1] Example

	/*
	 * problem add 2 numbers and check the time Complexity
	 * 
	 */

	@Test
	public void Add2Num() {
		System.out.println(num(100, 500));

	}

	private int num(int a, int b) {
		return a + b;
	}

}
