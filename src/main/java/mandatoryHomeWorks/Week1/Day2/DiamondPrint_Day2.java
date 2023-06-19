package mandatoryHomeWorks.Week1.Day2;

import org.junit.Test;

public class DiamondPrint_Day2 {
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
		int n = -1;
		printDiamond(n);
	}

	/*
	 * Pseudo code for 1st half a diamond
	 * If input is <=0 then throw runtime exception.
	 * If input >0 then
	 * -> Outer loop-> create for loop to handle the no of rows of nth time
	 * -> Inner Loop-> create for loop to handle the space(Value changed the based on the input so n-i times. post decrement the j)
	 * -> If the condition is true then print space else come out of the loop
	 * -> Inner Loop -> create for loop to handle the star print. k should be <=i.
	 * -> Print *
	 * -> print next line for each and every values.
	 * 
	 * pseudo code for 2nd diamond
	 * If input is <=0 then throw runtime exception.
	 * If input >0 then
	 * -> OuterLoop -> To handle the no of rows for the reverse pyramid with n-1
	 * --> Inner Loop-> To handle the space , the space increases every time so post increment. 
	 * this time we want only one time for this loop so 0 to <=i times.
	 * Print the space
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
			//handle the space
			for(int j=0;j<n-1-i;j++) {
				System.out.print(" ");
			}
			//handle the stars
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
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
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<n-i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	} 

}
