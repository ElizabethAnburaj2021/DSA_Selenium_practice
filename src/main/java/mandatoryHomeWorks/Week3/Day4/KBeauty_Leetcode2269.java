package mandatoryHomeWorks.Week3.Day4;

import org.junit.Test;

public class KBeauty_Leetcode2269 {
	@Test
	public void example() {
		int num=240;
		int k=2;
		System.out.println(findKBeauty(num,k)) ;
	}
	@Test
	public void example1() {
		int num = 430043;
		int k = 2;
		System.out.println(findKBeauty(num, k));
	}
/*
 * Program:
The k-beauty of an integer num is defined as the number of substrings of num 
when it is read as a string that meet the following conditions:
It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.
Note:
Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string.
--------------------------------------------------------------------------------
Pseudo code:
1. Declare a variable to store the K beauty number.
2. Convert a integer in to String using the wrapper class Integer
3. Traverse a loop to find the divisor from 0 to length-1
4. Find the substring using the string method subString and started index as i and end index as i+k
5. Convert the founded sub String value in to integer using the ParseInt and stored in to variable
6. Check if the varibale from above step is not equal to 0 and num module as equal to 0
7. Increase the count
8. Return count
------------------------------------------------------------------------------------------------
Time complexity: O(n^2)
Space complexity: O(1)
-------------------------------------------------------------------------------------------------
 */
	private int findKBeauty(int num, int k) {
		int sum=0;
		String str=Integer.toString(num);// Convert the String to Integer
		//Find the divisor
		for(int i=0;i<=str.length()-k;i++) {
			String substr=str.substring(i,i+k);// find the substring using the string method of substring.
			int integerVal=Integer.parseInt(substr);// convert the string to integer
			if(integerVal!=0 && num % integerVal==0) {
				sum++;
			}
		}return sum;
		/*while(num!=0) {
			int digit=num%k;
			sum+=digit;
			num=num/k;*/		
		}
	}
