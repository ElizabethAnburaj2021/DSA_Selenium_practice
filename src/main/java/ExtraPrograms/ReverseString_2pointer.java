package ExtraPrograms;

import org.junit.Test;

public class ReverseString_2pointer {
	/*
	 * Reverse the String using two pointer approach
	 */

	@Test
	public void reverseString() {
		String s="HELLO";
		
		//reverseStringWithout2Pointer(s);
		reverseStringWith2Pointer(s);
	}

	private void reverseStringWithout2Pointer(String s) {
		char[] ch=s.toCharArray();// O[n] 
		for(int i=ch.length-1;i>=0;i--) {//O[n]
			System.out.print(ch[i]);//o[1]
			
			//o[n]
		}
	}
	public void reverseStringWith2Pointer(String s) {
		char[] ch=s.toCharArray();
		//swap o[n/2] this is the best solution
		int left=0; int right=ch.length-1;
		while(left<right) {
			char temp=ch[right];
			ch[right--]=ch[left];
			ch[left++]=temp;
		}
		System.out.println(new String(ch));
		
	}
}
