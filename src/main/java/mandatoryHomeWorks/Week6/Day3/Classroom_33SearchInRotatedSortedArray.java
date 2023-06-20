package mandatoryHomeWorks.week6.day3;
import org.junit.Test;

public class Classroom_33SearchInRotatedSortedArray {
	/*
	 * pseudo code:
	 * 1. Declare two pointers, left and right, to the start and end indices of the array, respectively.
	 * 2. Left as 0 and Right as nums of length-1
	 * 3. Iteration of the while loop, it calculates the middle index mid using the formula (left + right) / 2. 
	 * Then, it checks if the element at mid is equal to the target. 
	 * 4. If it is, the method returns the index mid.
	 * 5. It checks if the left half of the array is sorted by comparing the element at left with the element at mid
	 *  a) If it is sorted, it further checks if the target is within the range of the left half. If it is, the right pointer is updated to mid - 1 to continue searching in the left half; otherwise, the left pointer is updated to mid + 1 to search in the right half.
	 * 6. If the left half is not sorted, it implies that the right half is sorted. 
	 *  b) it checks if the target is within the range of the right half. 
	 * 7. If it is in the left pointer is updated to mid + 1 to search in the right half; 
	 *	c) otherwise, the right pointer is updated to mid - 1 to search in the left half.
	 * 8. If the target element is not found after the loop, the method returns -1.
	 *
	 */
	@Test
	public void example() {
		int nums[] = {4,5,6,7,0,1,2};
		int target =0;
		//output=4
		System.out.println(search(nums,target));
	}
	@Test
	public void example1() {
		int nums[] = {4,5,6,7,0,1,2};
		int target =3;
		//output=-1
		System.out.println(search(nums,target));
	}
	@Test
	public void example2() {
		int nums[] = {1};
		int target =0;
		//output=-1
		System.out.println(search(nums,target));
	}
	@Test
	public void example3() {
		int nums[] = {1,2,3,5,6,7,8};
		int target =5;
		//output=3
		System.out.println(search(nums,target));
	}
	@Test
	public void example4() {
		int nums[] = {1,2,3,5,6,7,8};
		int target =-5;
		//output=-1
		System.out.println(search(nums,target));
	}
	public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {  // If the Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {  // If the Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;  // when the Target element is not found
    }


}
