package mandatoryHomeWorks.Week1.Day2;

import org.junit.Test;

public class LeetCode_258_AddDigit {

	@Test // +ve case
	public void example() {
		int num = 1;
		findAddedSingleDigitNumber(num);
		formulaForAddDigit(num);
	}

	@Test // +ve case
	public void example1() {
		int num = 0;
		findAddedSingleDigitNumber(num);
		formulaForAddDigit(num);
	}

	@Test // +ve case
	public void example2() {
		int num = -6;
		findAddedSingleDigitNumber(num);
		formulaForAddDigit(num);
	}

	/*
	 * Program: Add digit and found the single digit of the number. Example: 38->
	 * 3+8=11 1+1=2 the output of the 38 num is 2.
	 * 
	 * Step 1: num>=0 then throw runtime exception, Because the input should not be
	 * negative. Step 2: num==0 then return 0. Step 3: If n is the valid and
	 * couldn't be 2^31-1 then add digits using the below mathematical formula
	 * 1+(num-1)%9
	 * 
	 * 
	 */
	private int findAddedSingleDigitNumber(int num) {
		if (num < 0)
			throw new RuntimeException("The input should not contain the negative value");
		if (num == 0) {
			System.out.print("The input num is 0");
		}
		return 0;
	} 
	
private int formulaForAddDigit(int num) {
	int digitalRoot=1+(num-1)%9;
	int digitalResult=digitalRoot;{
		System.out.println(digitalResult);
	}
	return digitalResult;
	
}
}
