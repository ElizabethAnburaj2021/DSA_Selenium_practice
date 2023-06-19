package mandatoryHomeWorks.Week6.Day4;

import org.junit.Test;

public class LC_1886_matrixObtainedRotation {
	/*
	 * program: 1886. Determine Whether Matrix Can Be Obtained By Rotation Given two
	 * n x n binary matrices mat and target, return true if it is possible to make
	 * mat equal to target by rotating mat in 90-degree increments, or false
	 * otherwise. Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]] Output: true
	 * Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
	 * -----------------------------------------------------------------------
	 * pseudo code: 1. Step1: Transpose the Matrix means replace the column values
	 * as rows and row values as columns 2. Step2: Reverse the rows and received the
	 * expected output matrix.
	 */
	@Test
	public void example() {
		int[][] mat = { { 0, 1 }, { 1, 0 } };
		int[][] target = { { 1, 0 }, { 0, 1 } };
		System.out.println(matRotateAt90(mat, target));
	}

	@Test
	public void example2() {
		int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int target[][] = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(matRotateAt90(mat, target));
	}

	private boolean matRotateAt90(int[][] mat, int[][] target) {
		int n = mat.length;
		// swap for transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < i; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		// reverse the matrix
		int start = 0, end = mat.length - 1;
		while (start <= end) {
			for (int row = 0; row < mat.length; row++) {

				int temp = mat[row][start];
				mat[row][start] = mat[row][end];
				mat[row][end] = temp;

			}
			start++;
			end--;

			int row1 = n;
			int row2 = target.length;
			int col1 = mat[0].length;
			int col2 = target[0].length;

			if (row1 != row2 && col1 != col2) {
				return false;
			} else {
				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat[0].length; j++) {
						if (mat[i][j] == target[i][j]) {
							return true;
						}
					}
				}
			}
			return false;
		}
		return false;
	}
}
