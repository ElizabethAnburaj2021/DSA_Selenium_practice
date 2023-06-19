package mandatoryHomeWorks.Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Leetcode1200_MinimumAbsoluteDiff {
	@Test
	public void example() {
	int	arr[] = {4,2,1,3};
	System.out.println(minimumAbsDifference(arr));
	}
	
	@Test
	public void example1() {
	int	arr[] = {1,3,6,10,15};
	System.out.println(minimumAbsDifference(arr));
	}
	
	@Test
	public void example2() {
	int	arr[] = {3,8,-10,23,19,-4,-14,27};
	System.out.println(minimumAbsDifference(arr));
	}
	/*
	 * pseudo code
	 * 1. Return type as List as expected so we do conversion
	 * 2. Sort given arrays as ascending order
	 * 3. find max value using Iteger.Max_value method and store it as a variable. To find min difference
	 * 4. Declare a Array list  
	 * 5. Traverse a loop from 1 to arr.length
	 * 6. arr[i] difference arr[i-1] and store this value as difference
	 * 7. If diff are less than the min diff then say mindiff=diff
	 * 8. Clear the result
	 * 9. Add the arrays as list arr[i-1], as arr[i]
	 * 10. else if diff equals to mindiff then
	 * 11. add arrays as list arr[i-1], arr[i]
	 * 12. finally return the result as lists
	 * 
	 */

	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // Find the minimum absolute difference
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                result.clear(); // Clear previous pairs
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            } else if (diff == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }
}
