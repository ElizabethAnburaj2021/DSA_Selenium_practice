package mandatoryHomeWorks.week1.day5;

import org.junit.Test;

public class Leetcode1323_Maximum69Number {
@Test
public void example() {
	int num = 9669;
	maximum69Number(num);
	System.out.println(maximum69Number(num));
}
@Test
public void example1() {
	int num = 9996;
	maximum69Number(num);
	System.out.println(maximum69Number(num));
}
@Test
public void example2() {
	int num = 9999;
	System.out.println(maximum69Number(num));
}
/*
 * pseudo code
 * 1. Convert a num as char array and stored in a variable
 * 2. Traverse a loop from 0 to char array.length and increament the value of i
 * 3. Check if the 6 equals to array of i and 9 equals to array of i
 * 4. then break
 * 5. Convert the  the array as int as return the same.
 */
private int maximum69Number(int num) {
	 char[] digits = String.valueOf(num).toCharArray();
     for (int i = 0; i < digits.length; i++) {
         if (digits[i] == '6') {
             digits[i] = '9';
             break;
         }
     }

     return Integer.parseInt(String.valueOf(digits));
 }	
}

