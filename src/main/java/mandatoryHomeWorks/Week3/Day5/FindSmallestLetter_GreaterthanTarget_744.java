package mandatoryHomeWorks.week3.day5;

import org.junit.Test;

public class FindSmallestLetter_GreaterthanTarget_744 {
	@Test
	public void example() {
		char [] letters = {'c','f','j'};
		char target = 'a';
		System.out.println(findSmallestOne(letters, target));
	}
	@Test
	public void example1() {
		char [] letters = {'c','f','j'};
		char target = 'c';
		System.out.println(findSmallestOne(letters, target));
	}
	/*
	 * Pseudo code
	 * 1. Declare left as 0
	 * 2. Right as char array length-1
	 * 3. Traverse an arrray when left is lesser than the right
	 * 4. if left+(right-left)/2 and store it in a variable called mid
	 * 5. If the charr of mid is less than or equal to target
	 * 6. then store left values as mid+1
	 * 7. else store mid-1 as right
	 * 8. If the target is greater than the target letter-> the left is lesser than length ? and letters of left assigned to letters of 0
	 *9. return the 8th point
	 */
	private char findSmallestOne(char[] letters, char target) {
	        int left = 0;
	        int right = letters.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (letters[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        
	        // Wrap around if the target is greater than the largest letter
	        return left < letters.length ? letters[left] : letters[0];
	    }		
	}
