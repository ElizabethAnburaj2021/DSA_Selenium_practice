package mandatoryHomeWorks.week6.day3;

import org.junit.Test;

public class SplOneMatrix_LC1582 {
	/*
	 * pseudo code:
	 * 1. Declare the integer variables count as 0, R as matrix of length and C as matrix index of length
	 * 2. Declare array of matrix row as R and C as Column
	 * 3. Traverse a loop through rows from 0 to R as i and 0 to C as j
	 * 4. If matrix of i and j equals to 0 then do increment of Row[i].
	 * 5. Traverse a loop through columns from 0 to C as i and 0 to R as j
	 * 6. If the matrix of i and j equals to 0 then do increment of COL[i]
	 * 7. Traverse a loop to find the special one from 0 to R as x and 0 to C as y
	 * 8. Check if the matrix of x and y equals 1
	 * 9. Find the 0's of rows and columns-> no of rows=no of coulums-1 and no of col=no of rows-1 
	 * 10 if the conditions are satisfied then increment the count 
	 * 11. finally return count
	 */
	@Test
	public void example() {
		int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(numSpecial(mat));
	}
	
	@Test
	public void example1() {
		int[][] mat = { { 0, 0, 0 }, { 0, 1, 1 }, { 1, 0, 0 } };
		System.out.println(numSpecial(mat));
	}
	public int numSpecial(int [][] mat) {
		int count=0;
		int R=mat.length;
		int C=mat[0].length;
		
		int[] ROW= new int[R];
		int[] COL= new int[C];
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(mat[i][j]==0) {
					ROW[i]++;
				}
			}
		}
		
		for(int i=0;i<C;i++) {
			for (int j=0;j<R;j++) {
				if(mat[j][i]==0) {
					COL[i]++;
				}
			}
		}
		for(int x=0;x<mat.length;x++) {
			for(int y=0;y<mat[0].length;y++) {
				if(mat[x][y]==1) {
					if(ROW[x]==C-1 && COL[y]==R-1) {
						count++;
					}
				}
			}
		}
		return count;
		
	}

}
