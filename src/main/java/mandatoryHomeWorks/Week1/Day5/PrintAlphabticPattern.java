package mandatoryHomeWorks.Week1.Day5;

import org.junit.Test;

public class PrintAlphabticPattern {
	@Test
	public void example() {
		int n=10;
		findDiamondAlphabets(n);
	}

	@Test
	public void example1() {
		int n=0;
		findDiamondAlphabets(n);
	}
	
	@Test
	public void example2() {
	int n=-5;
	findDiamondAlphabets(n);
	}
/*
 * pseudo code
 *1. Input as n, no of rows to print
 *2. We need to traverse nested loop to print pattern, 1 for alphabet prints and another one for space 
 *3. Outer loop for no of rows. It will start 0 to n
 *4. Print space
 *5. Nested loop1-> from 0 to n-i-1 times the no of spaces are defined by n-i-1.To print 1st character.
 *6. Print char A+i
 *7. If i is greater than 0
 *8. Then another loop to traverse from 0 to 2*i-1 and print the space. Print for 2nd character so 2*i-1
 *9. Print next line in the out side of the loop to move the next line.	
  */
	private void findDiamondAlphabets(int n) {
		if(n<=0){
			throw new RuntimeException("Input should be greter than Zero");
			//System.out.println("Input should be greter than 0");
		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + i));
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + i));
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
	}

}
