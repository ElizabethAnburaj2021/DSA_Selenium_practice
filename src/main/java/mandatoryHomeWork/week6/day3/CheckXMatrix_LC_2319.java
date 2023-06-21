
package mandatoryHomeWork.week6.day3;

import org.junit.Test;

public class CheckXMatrix_LC_2319 {
/*program:
 * A square matrix is said to be an X-Matrix if both of the following conditions hold:
A) All the elements in the diagonals of the matrix are non-zero.
B) All other elements are 0.
Given a 2D integer array grid of size n x n representing a square matrix, 
return true if grid is an X-Matrix. Otherwise, return false.

Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
Output: true
Explanation: Refer to the diagram above. 
An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
Thus, grid is an X-Matrix.
------------------------------------------------------------------
 * pseudo code:
 * 1. Create the method to check the diagonal. Return boolean because yes or No type.
 * 2. Declare n with the grid length
 * 3. Traverse a loop-> from 0 to n then do increment of i.Iterates through each element of the matrix using nested loops. 
 * For each element, it checks if it is a diagonal element by comparing the indices (i, j). 
 * If the indices are the same, it checks if the current element is equal to the diagonal element. 
 * 4. Check if the grid of i and j equals 0, then return false
 * 5. Else, check if the grid of i and j not equals 0, then return false
 * 6. else return true.
 */
	
	@Test
	public void example() {
		int[][] grid = { { 2,0,0,1 }, {0,3,1,0},{ 0,5,2,0 }, { 4,0,0,2 } };
		//output=true. 
		//[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]
		System.out.println(checkXMatrix(grid));
	}
	@Test
	public void example1() {
		int[][] grid = { { 5,7,0 }, {0,3,1},{ 0,5,0 } };
		
		//output=false.
		//[5,7,0],[0,3,1],[0,5,0]
		System.out.println(checkXMatrix(grid));
	}

private boolean checkXMatrix(int[][] grid) {
	int n=grid.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(isDiagonal(i, j, n)) {
				if(grid[i][j]==0) {
					return false;
				}
			}
		}
	}
	return true;
	
}
private boolean isDiagonal(int i, int j, int n) {
	return (i==j)||(i+j==n-1);
	
}
}
