package mandatoryHomeWorks.week2.day1;

import org.junit.Test;

public class Leet168_ExcelSheetColumnTitle {
	@Test
	public void example() {
		int CoulmnNo=1;
		//output="A";
		String result = findCoulumName(CoulmnNo);
		System.out.println(result);
	}
	@Test
	public void example1() {
		int CoulmnNo=28;
		//output="AB";
		String result = findCoulumName(CoulmnNo);
		System.out.println(result);	}
	/*
	 * Pseudo code:
--> A columnNo is input.
---> Excel contains columns and column names like A , B.... So we need to Declare a String varibale to store the "A to Z" 26 Alphabets.
i.e String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

--> Create a String builder. To invoke the String builder methods for manipulations.

--> columnNumber should be greater than 1. i.e. columnNumber>1 

then we need to find the index val of the columnNumber. to find the columnName. so do (columnNumber-1)%26 and store it a variable.

-->Using the String builder obj and append method add an another index value as a char. Used the charAt().

---> Now we do 27/26=1, so n-1/26 as 1-1/26=> 0/26=0

--> Store value of an index in sb and do reverse. because after saving the 0th index value as A, sb contains BA. So do the reverse of sb. 
---> Return the value as String.
	 */

	private String findCoulumName(int coulmnNo) {
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb=new StringBuilder();
		while(coulmnNo>0) {
			int remVal=(coulmnNo-1)%26;//1
			sb.append(alpha.charAt(remVal));//B
			coulmnNo=(coulmnNo-1)/26;//1-1/26=0
		
		}
		return sb.reverse().toString();//AB
		
	}

}
