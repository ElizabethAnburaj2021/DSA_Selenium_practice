package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class PascalTriangle_Print {
	@Test
	public void example1() {
		int n = 5;
		printDiamond(n);
	}

	@Test
	public void example2() {
		int n = 0;
		printDiamond(n);
	}

	@Test
	public void example3() {
		int n = -5;
		printDiamond(n);
	}

	/*
	 * Pseudo code for 1st half a diamond
	 * If input is <=0 then throw runtime exception.
	 * If input >0 then
	 * -> Outer loop-> create for loop to handle the no of rows of nth time
	 * -> Inner Loop -> create for loop to handle the star print. k should be <=i.
	 * -> Print *
	 * -> print next line for each and every values.
	 * 
	 * pseudo code for 2nd diamond
	 * If input is <=0 then throw runtime exception.
	 * If input >0 then
	 * -> OuterLoop -> To handle the no of rows for the reverse pyramid with n-1
	 * --> Inner loop-> To handle the star, for this time based on the n-i-1 times print the star.
	 * -> Print next line for each and every time values.
	 */
	private void printDiamond(int n) {
		//diamond first half
		if(n<=0){
			throw new RuntimeException("Input should be greter than Zero");
			//System.out.println("Input should be greter than 0");
		}
		//handle rows
		for(int i=0;i<n;i++) {
			//handle the stars
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// second half diamond print
		if(n<=0){
			throw new RuntimeException("Input should be greter than Zero");
			//System.out.println("Input should be greter than 0");
		}
		// handle the rows
		for(int i=0;i<n-1;i++) {
			//handle the star
			for (int j=0;j<n-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	} 

}
