package mandatoryHomeWork.week4.day5;

import org.junit.Test;

public class Classroom_BiggestANCICodeOFGivenString {
	/*
	 * Program:
Given a string S with both lowercase and uppercase letters, return the biggest ASCII letter that appears both in lowercase and uppercase. 
The returned letter must be in uppercase. 
If there is no such letter, return 'NO'. 
Examples: 
1. 'aaabcAbCdD', return 'D' 
2. 'aA', return 'A' 
3. 'abcdE', return 'NO' 
4. 'a', return 'NO'

Pseudo code:
1. Declare an array1 and array2 size with 26. 
2. Traverse a loop from 0 to string length
3. If the arr1 of i is equal to lower case then Convert the string into char array and do arr1 of i-'a'
4. else do call isUppercase and arr2 char of i-'A'
5. Traverse a loop from 0 to arr1 length-1 and j should be greater than and equal to 0
6. If arr1 of i and arr2 of j is should be greater than to 0
7. then do char(i+'A') and save it in the char variable
8. Return into String so do the conversion char to toString and save it in a variable
9. Finally return the string
	 */
	
	@Test // +ve
	public void example1() {
		String s = "aaabcAbCdD";
		System.out.println(findBiggestANCI(s));
	}

	@Test // edge
	public void example2() {
		String s = "aA";
		System.out.println(findBiggestANCI(s));
	}

	@Test // negative
	public void example3() {
		String s = "abcdE";
		System.out.println(findBiggestANCI(s));
	}

	@Test // negative
	public void example4() {
		String s = "a";
		System.out.println(findBiggestANCI(s));
	}
	
	private String findBiggestANCI(String s) {
		int[] arr1=new int[26];
		int[] arr2=new int[26];
	
		for(int i=0; i<s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))){
				arr1[s.charAt(i)-'a']++;
			}else if(Character.isUpperCase(s.charAt(i))){
				arr2[s.charAt(i)-'A']++;
			}
		}
		
		for(int i=arr1.length-1; i>=0; i--) {
			if(arr1[i]>0 && arr2[i]>0){
				//char ch=(char)(i+'A');
		        String str = Character.toString( (char) (i+'A'));

				return str;
						}
		}

		
		return "NO";
	}


}
