package mandatoryHomeWorks.week6.day4;

import java.util.Arrays;

import org.junit.Test;

public class FlipImage_LC_832 {
	/*
	 * program: Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, Flip [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

--------------------------------------------------------------------
pseudo code:
1. Declare the integer variabe as n to store the matrix length
2. Step1: Do the flip-> Swap
a) Traverse the loop to flip image i From 0 to n.
b) Declare the left as 0 and right as n-1
c) while left is lesser than or equal to
d) Declare temp variable as matrix of i of left
e) matrix of i of left as matrix of i of right
f) matrix of i of right as temp
g) then do left++ and right--
3. Step 2: Do invert
2 parser-> Traverse a loop i and j(rows and column) from 0 to n
b) if matrix of i and j equals to 1 then matrix of i and j as 0 
c) else matrix of i and j equal to 1

Single parcer-> while swapping the left check left >0?0:1
and with right>0?0:1

4. Print the matrix -> Create a method and do traverse the matrix for each times and print as String.
	 */
	@Test
	public void example() {
	int[][] A = { { 1,1,0 }, {1,0,1},{ 0,0,0} };
	//output: [[1,0,0],[0,1,0],[1,1,1]]
	flipImage(A);
	print2D(A);
	}
	@Test
	public void example1() {
	int[][] A = { {1,1,0,0 }, {1,0,0,1},{0,1,1,1},{ 1,0,1,0} };
	//output: [1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]
	flipImage(A);
	print2D(A);
	}

	private int[][] flipImage(int[][] A) {
		int n=A.length;
		
		//traverse the matrix to flip the image using swap
		for(int i=0;i<n;i++) {
			int left=0,right=n-1;
			
			//swap
			while(left<=right) {
				int temp=A[i][left]>0?0:1;
				A[i][left]=A[i][right]>0?0:1;
				A[i][right]=temp;
				left++;
				right--;
			}
		}
		//invert the image
		/*
		 * for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { if(A[i][j]==1) { A[i][j]=0;
		 * }else { A[i][j]=1; } } }
		 */
		return A;
	}
	private void print2D(int[][] A) {
		for(int[] print:A) {
			System.out.println(Arrays.toString(print));
		}
	}
}
