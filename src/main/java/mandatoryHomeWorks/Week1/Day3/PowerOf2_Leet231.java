package mandatoryHomeWorks.Week1.Day3;

import org.junit.Test;

public class PowerOf2_Leet231 {
	@Test
	public void example() {
		int n=38;
	}
	@Test
	public void example1() {
		int n=0;
	}
	@Test
	public void example2() {
		int n=1;
	}
	
	/*
	 * -> create a boolean method and pass input as n
	 * -> if n equal to 0, then return false
	 * -> if n equal to 1, then return false
	 * -> if nis odd, then return false (i.e) n%2!=0
	 * -> return the method (n/2)
	 */

	public boolean nisPowerOfTwo(int n) {
		if(n==0) {
			return false;
		}
		if(n==1) {
			return false;
		}
		if(n%2!=0) {
			return false;
		}
		return nisPowerOfTwo(n/2);
	}
}
