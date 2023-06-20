package mandatoryHomeWorks.week1.day1;

import org.junit.Test;

public class Pyramid_Print {
	
	@Test
	public void example1() {
		int n=10;
		findPyramid(n);
	}

	@Test
	public void example2() {
		int n=0;
		findPyramid(n);
	}
	
	@Test
	public void example3() {
	int n=-5;
		findPyramid(n);
	}
	
	/*
	 * Pseudo code
	 * If input is <=0 then throw runtime exception.
	 * If input >0 then
	 * -> Outer loop-> create for loop to handle the no of rows of nth time
	 * -> Inner Loop-> create for loop to handle the space(Value changed the based on the input so n-i times. post decrement the j)
	 * -> If the condition is true then print space else come out of the loop
	 * -> Inner Loop -> create for loop to handle the star print. k should be <=i.
	 * -> Print *
	 * -> print next line for each and every values.
	 * 
	 */
	public static void findPyramid(int n)
    {
		if(n<=0){
			throw new RuntimeException("Input should be greter than Zero");
			//System.out.println("Input should be greter than 0");
		}
        // outer loop to handle number of rows
        for (int i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop to handle number of columns
            
            for (int k=0; k<=i; k++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            // ending line after each row
            System.out.println();
        }
    }
}
