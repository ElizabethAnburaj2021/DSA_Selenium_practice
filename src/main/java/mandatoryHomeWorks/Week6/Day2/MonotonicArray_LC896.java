package mandatoryHomeWorks.Week6.Day2;

public class MonotonicArray_LC896 {
    public void example() {
        int[] nums = {1, 2, 3, 4, 5};
        boolean isMonotonic = isMonotonicArray(nums);
        System.out.println("Is the array monotonic? " + isMonotonic);
    }
/*
 * Pseudo code
 * 1. Initialize two boolean variables, increasing and decreasing, to true. These variables will keep track of whether the array is non-increasing or non-decreasing, respectively.
 * 2. Iterate through the array from the first element to the second-to-last element.
 * 3. If the current element is greater than the next element (nums[i] > nums[i + 1]), it means the array is not increasing. So, we set increasing to false.
   4. If the current element is less than the next element (nums[i] < nums[i + 1]), it means the array is not decreasing. So, we set decreasing to false.
   5. Iterating through the entire array, if either increasing or decreasing is true, it means the array is monotonic. So, we return true. Otherwise, we return false.
 ----------------------------------------------------------------------------------
 Time complexity: O(n)
 Space Complexity: )(1)
 ---------------------------------------------------------------------------------
 */
    private static boolean isMonotonicArray(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}

