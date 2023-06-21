package mandatoryHomeWork.week5.day4;

import org.junit.Test;

public class FinalValueAfterOperations_LC_2011 {
	/*
	 * pseudo code:
	 * 1. initialize the variable with 0. 
	 * Then, we iterate through each operation in the operations array.
	 * 2. Traverse a loop-> For each operation, we check its value and update the variable accordingly. 
	 * 3. If the operation is "++X" or "X++", we increment the variable by 1. 
	 * 4. If the operation is "--X" or "X--", we decrement the variable by 1.
	 * ---------------------------------------------------------------------------
	 * Time complexity:O(n)
	 * Space complexity: O(1)
	 * --------------------------------------------------------------
	 */
	@Test
	 public void example() {
	        String[] operations = {"++X", "X++", "--X", "X--"};

	        int finalValue = getFinalValue(operations);
	        System.out.println("Final Value: " + finalValue);
	    }

	    private static int getFinalValue(String[] operations) {
	        int variable = 0;

	        for (String operation : operations) {
	            if (operation.equals("++X") || operation.equals("X++")) {
	                variable++;
	            } else if (operation.equals("--X") || operation.equals("X--")) {
	                variable--;
	            }
	        }

	        return variable;
	    }

}
