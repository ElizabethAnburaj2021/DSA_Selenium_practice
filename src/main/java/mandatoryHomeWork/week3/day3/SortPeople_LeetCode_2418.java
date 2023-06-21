package mandatoryHomeWork.week3.day3;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class SortPeople_LeetCode_2418 {
	@Test
	public void example() {
		int[] heights = { 180, 190, 170 };
		String[] names = { "Mary", "John", "Emma" };
		System.out.println(Arrays.toString(sortPeople(heights, names)));
	}
	@Test
	public void example1() {
		 int [] heights = {155,185,150};
		String[] names = {"Alice","Bob","Bob"};
		System.out.println(Arrays.toString(sortPeople(heights, names)));
	}
	/* Program:
You are given an array of strings names, and an array heights that consists of distinct positive integers. 
Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights
--------------------------------------------------------------------
Time complexity: O(n)
Space complexity:O(n)
-----------------------------------------------------
Pseudo code:
1. Initialize the Hash Map for Integer and String to store the Heights and Names.
2. Declare a Counter variable as 0
3. Traverse a loop from 0 to height.length and store the key and value pairs in Hashmap.
i.e. hm.put(heights[i],names[i])
4. Sort the heights array using the Arrays.sort(heights)
5. Traverse a loop to find the descending order of height from length-1, end when i >=0
6. Get key from the hashmap.
i.e. hm.get(heights[i]); store it in the names array and counter++
i.e. names[counter++]=hm.get(heights[i]);
7. finally return the names.

	 */
	private String[] sortPeople(int[] heights, String[] names) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		int counter = 0;
		for (int i = 0; i < heights.length; i++) {
			hm.put(heights[i], names[i]);// added key and value pairs
		}
		// sort the heights
		Arrays.sort(heights);
		for (int i = heights.length - 1; i >= 0; i--) {
			names[counter++] = hm.get(heights[i]);
		}
		return names;
	}

}
