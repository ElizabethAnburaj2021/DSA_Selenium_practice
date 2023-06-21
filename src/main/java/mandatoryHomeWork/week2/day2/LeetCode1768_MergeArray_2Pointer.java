package mandatoryHomeWork.week2.day2;

import org.junit.Test;

public class LeetCode1768_MergeArray_2Pointer {
	@Test
	public void example() {
		String word1="abc";
		String word2="pqr";
		//output as apbqcr
		mergeString(word1,word2);
		System.out.println(mergeString(word1,word2));
	}
	@Test
	public void example1() {
		String word1="ab";
		String word2="pqrs";
		//output as apbqrs
		mergeString(word1,word2);
		System.out.println(mergeString(word1,word2));
	}
	@Test
	public void example2() {
		String word1="mama";
		String word2="papa";
		//output as mpaampaa
		mergeString(word1,word2);
		System.out.println(mergeString(word1,word2));
	}
	/*
	 * pseudo code
	 * 2 pointer approch:
	 * 1. Declare the firstPointer and SecondPointer variables as 0
	 * 2. Initialize the String Builder to store the values.
	 * 3. While firstPointer is less than the word1.length and secondPointer is less than the word2
	 * 4. then, if the firstPointer is less than the word1 append the values in the stringbuilder
	 * charAt of the firstPOinter. Then increase the firstPointer.
	 * 5. if the secondPointer is less than the word2 append the values in the stringbuilder
	 * charAt of the secondPOinter.Then increase the secondPointer.
	 * 6. Return the stringbuilder with string character
	 */
	private String mergeString(String word1, String word2) {
		int firstPointer=0; int secondPointer=0;
		StringBuilder sb=new StringBuilder();
		
		while(firstPointer< word1.length()||secondPointer< word2.length()) {
			if (firstPointer< word1.length()) {
				sb.append(word1.charAt(firstPointer++));
			}
			
			if(secondPointer<word2.length()) {
				sb.append(word2.charAt(secondPointer++));
			}
		}
		return sb.toString();
		
	}
}
