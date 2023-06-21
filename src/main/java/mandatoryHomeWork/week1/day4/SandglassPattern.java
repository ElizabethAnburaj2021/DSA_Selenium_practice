package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class SandglassPattern {
	@Test
	public void example() {
		int n=7;
		sandGlass(n);
	}
	@Test
	public void example1() {
		int n=0;
		sandGlass(n);
	}
	public void example2() {
		int n=-3;
		sandGlass(n);
	}
public static void sandGlass(int n) {
	if(n<=0) {
		throw new RuntimeException("Number n should be greater than 0");
	}
	
	for(int i=0;i<n-1;i++) {
		
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		for (int j=0;j<n-i-1;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	if(n<=0) {
		throw new RuntimeException("Number n should be greater than 0");
	}
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
