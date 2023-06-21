package mandatoryHomeWork.week5.day4;

import org.junit.Test;

public class MaxConsecutiveOnes_LC485 {
	@Test
    public void example() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};

        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }
/*
 * Pseudo code
 * 1. The findMaxConsecutiveOnes method takes the input array nums and returns the maximum consecutive ones count.
 * 2. Initialize two variables, maxConsecutiveOnes and currentConsecutiveOnes, to keep track of the maximum and current consecutive ones counts, respectively. Both are initially set to 0.
 * 3. Iterate through each element in the nums array.
 * 4. If the current element is 1, 
 * Then increment currentConsecutiveOnes by 1 and update maxConsecutiveOnes to the maximum value between the current maxConsecutiveOnes and currentConsecutiveOnes.
 * 5. If the current element is 0, it means the consecutive ones streak is broken. We reset currentConsecutiveOnes to 0.
 * 6. After iterating through the entire array, the maxConsecutiveOnes variable will hold the maximum consecutive ones count.
 * 7. Finally, we return the maxConsecutiveOnes value.
 * ----------------------------------------------------------------------
 * Time complexity:O(n)
 * Space complexity:O(1)
 * -----------------------------------------------------------------------
 *
 */
    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }

        return maxConsecutiveOnes;
    }
}

