package mandatoryHomeWork.week2.day5;

import org.junit.Test;

public class Leetcode557_ReverseWordOfSentence {
	@Test
	public void example() {
		String s = "God Ding";
		reverseWord(s);
		System.out.println(reverseWord(s));

	}

	@Test
	public void example1() {
		String s = "Let's take leet code constent";
		reverseWord(s);
		System.out.println(reverseWord(s));
	}
	/*
	 * Pseudo code:
	 * 
	 * 1. Write a method to resverEachWord
	 * A) Traverse a loop from 0 to arr.length-1 and i should be >=1 and do i-- (for the reverse)
	 * B) Initialize the variable to store the result
	 * C) result variable should be equals to the char of i
	 * D) Then return result.
	 * 
	 * 2. Create a main function to do reverse a word
	 * A) s="God Ding";
	 * B) arr[]={"god","Ding"};
	 * C) Create a StringBuilder and obj called as sb
	 * D) Traverse a loop from 0 to arr of length-2 and do post increment of i
	 * E) call the method - resverEachWord (arr[i]) and stored it in a variable called reversedWord
	 * F) do sb.append(reversedWord+ " ")
	 * G) End the loop
	 * H) Call reverseEachWord method of (arr [arr.length-1]) and store it in a variable called lastWord
	 * I) Do append. i.e. sb.append(lastWord)
	 * J) Then return sb.toString()
	 */

	private String reverseWord(String s) {
		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= arr.length - 2; i++) {
			String reversedWord = reverseEachWord(arr[i]);
			sb.append(reversedWord + " ");
		}
		// Reverse of last word
		String lastWord = reverseEachWord(arr[arr.length - 1]);
		sb.append(lastWord);
		return sb.toString();
	}

	private String reverseEachWord(String word) {
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		return result;
	}
}
