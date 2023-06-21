package mandatoryHomeWork.week6.day1;

import java.util.Arrays;

import org.junit.Test;

public class SquaresOfSortedArray_LC977 {
	@Test
    public void example() {
        int[] nums = {-4, -2, 0, 2, 4};
        int[] result = sortedSquares(nums);
        System.out.println("Squares of sorted array: " + Arrays.toString(result));
    }
/*
 * Pseudo code
 * 1. The sortedSquares method takes the input array nums and returns the sorted squares array.
 * 2. Initialize a new array result of the same length as nums to store the squares of the elements.
 * 3. Initialize two pointers, left and right, which initially point to the start and end of the nums array, respectively.
 * 4. Iterate from the end of the result array, starting with i set to n - 1, and move the pointers inward until they meet.
 * 5. In each iteration, we calculate the squares of the elements at the left and right pointers, leftSquare and rightSquare respectively.
 * 6. Compare leftSquare and rightSquare and choose the larger value to be placed in the result array at index i.
 * 7. If leftSquare is greater, we store leftSquare in result[i] and increment left by 1. Otherwise, we store rightSquare in result[i] and decrement right by 1.
 * 8. After each iteration, we decrement i by 1 to move to the previous index of the result array.
 * 9. Repeat this process until left becomes greater than right, indicating that we have processed all the elements in nums
 * 10. Finally, we return the result array containing the sorted squares.
 * --------------------------------------------------------------------------
 * Time complexity:O(n)
 * Space complexity: O(n)
 * --------------------------------------------------------------------------
 * 
 */
    private static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int i = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
            i--;
        }

        return result;
    }
}

