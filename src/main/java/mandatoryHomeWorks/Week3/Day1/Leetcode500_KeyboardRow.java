package mandatoryHomeWorks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Leetcode500_KeyboardRow {
	@Test
	public void example() {
		String []words = {"Hello","Alaska","Dad","Peace"};
		findWords(words);
		System.out.println(Arrays.toString(words));
		
	}
	@Test
	public void example1() {
		String []words = {"omk"};
		findWords(words);
		System.out.println(Arrays.toString(words));
	}
	@Test
	public void example2(){
		String []words = {"adsdf","sfd"};
		findWords(words);
		System.out.println(Arrays.toString(words));
	}
	/*pseudo code:
	 * 1. Declare a keyboard rows as a string array
	 * 2. Create a array list
	 * 3. Create an another method return type as boolean 
	 * 4. Traverse a loop and for row using the for each
	 * 5. Create a char array and store the keyboard row as char array as traverse until the last value of the char array.
	 * 6. Declare a boolean variable and set as false when the above condition is true
	 */
	  public String[] findWords(String[] words) {
	        String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
	        List<String> result = new ArrayList<String>();

	        for (String word : words) {
	            if (isInSameRow(word.toUpperCase(), rows)) {
	                result.add(word);
	            }
	        }
	        return result.toArray(new String[0]);
	    }

	    private boolean isInSameRow(String word, String[] rows) {
	        for (String row : rows) {
	            boolean isInRow = true;
	            for (char c : word.toCharArray()) {
	                if (row.indexOf(c) == -1) {
	                    isInRow = false;
	                    break;
	                }
	            }
	            if (isInRow) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
