package mandatoryHomeWorks.Week3.Day4;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class Leetcode1859_SortSentence {
@Test
public void example() {
	String sentence = "is2 sentence4 This1 a3";
	sortSentence(sentence);
	// Print the sorted sentence
    System.out.println(sortSentence(sentence));
}
@Test
public void example1() {
	String sentence = "Myself2 Me1 I4 and3";
	sortSentence(sentence);
	System.out.println(sortSentence(sentence));
}
/*
 * Pseudo code:
 * 1. Create a string array and store a split sentence into it. using string.split method
 * 2. Create another string array with above variable as word.length in size
 * 3. Traverse a loop to find the sorted sentence from 0 to length so use here for each
 * 4. Do charAt of word.length()-1 with minus 1 to get the index value and stored it in integer variable
 * 5. Do the subString from 0 to word.length()-1
 * 6. Now we can save sortedWords[index] with the variable where we stored the substring values
 * 7. Return the and join sentences using join method
 */
private String sortSentence(String sentence) {
	 String[] words = sentence.split(" ");
     String[] sortedWords = new String[words.length];
     
     for (String word : words) {
         int index = word.charAt(word.length() - 1) - '1';
         String content = word.substring(0, word.length() - 1);
         sortedWords[index] = content;
     }
     
     return String.join(" ", sortedWords); 	
}

}
