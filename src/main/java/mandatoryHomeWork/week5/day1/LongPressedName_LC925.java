package mandatoryHomeWork.week5.day1;

import org.junit.Test;

public class LongPressedName_LC925 {
	@Test
    public void example() {
        String name = "alex";
        String typed = "aaleex";

        boolean isLongPressed = isLongPressedName(name, typed);
        System.out.println("Is the typed name equivalent to the given name? " + isLongPressed);
    }
/*
 * Pseudo code:
 * 1. Initialize two pointers, i and j, to keep track of the current positions in the given name and typed name, respectively.
 * 2. Traverse the loop->  Iterate through the characters of the typed name using the j pointer.
 * 3. If the characters at the current positions of both i and j match, we move both pointers forward by incrementing them.
 * 4. If the current character in the typed name is the same as the previous character i.e.typed.charAt(j) == typed.charAt(j - 1), we only move the j pointer forward. 
   5. If none of the above conditions are met, it means that the typed name is not equivalent to the given name, so we return false.
   6. Check if all characters in the given name have been processed (i == name.length()). 
   7. If true, it means that the typed name is equivalent to the given name with long presses, so we return true. Otherwise, we return false.
   ----------------------------------------------------------
   Time complexity: O(n+m)
   Space complexity: O(1)
 * 
 */
    private static boolean isLongPressedName(String name, String typed) {
        int i = 0; // pointer for the given name
        int j = 0; // pointer for the typed name

        while (j < typed.length()) {
            // If both characters match, move both pointers forward
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // If the current character in the typed name is the same as the previous character,
            // move only the pointer of the typed name forward
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            // If none of the above conditions are met, the typed name is not equivalent to the given name
            else {
                return false;
            }
        }

        // Check if all characters in the given name have been processed
        return i == name.length();
    }
}

