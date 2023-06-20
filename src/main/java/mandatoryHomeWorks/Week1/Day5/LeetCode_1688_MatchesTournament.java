package mandatoryHomeWorks.week1.day5;

import org.junit.Test;

public class LeetCode_1688_MatchesTournament {
	@Test
	public void example() {
		int num=7;
		foundMatches(num);		
	}
	
	@Test
	public void example1() {
		int num=8;
		foundMatches(num);
	}
	@Test
	public void example2() {
		int num=0;
		foundMatches(num);
	}
	/* pseudo code
	 * --> Pass the input n value
	 * --> Number is should be greater than and equal to 0. i.e n<=0 then throw exception.
	 * --> Declare sum value to store the sum of the matches with default value.
	 * --> At last the only one winner or team so traverse until reach 1. i.e n>1
	 * --> if n is even, then do should divide n by 2 (i.e n/2)
	 * --> if n is odd, then should be divide n-1 by 2 and store the value in variable n for matches played and again divide (n-1)/2 +1 for teams advance store it in sum variable
	 * --> return sum 
	 * Time complexity is O(n)
	 */
	private int foundMatches(int n) {
		if (n<=0) throw new RuntimeException("Number should be greater than or equal to 1");
		
		int sum=0;
		while(n>1) {
			sum=sum+n/2;
			n=(n/2)+(n%2);
		}System.out.println("The no of matches is:="+sum);
		return sum;
	}
	}
