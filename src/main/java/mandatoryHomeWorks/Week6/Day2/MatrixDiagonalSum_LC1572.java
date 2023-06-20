package mandatoryHomeWorks.week6.day2;
import org.junit.Test;

public class MatrixDiagonalSum_LC1572 {
	/*
	 * program:
	 * Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on 
the secondary diagonal that are not part of the primary diagonal.
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

pseudo code:
1. Declare a variable to store sum of the values.
2. Declare the start as 0 and end as matrix length-1 variables to traverse the matrix.
3. Traverse the loop from 0 to matrix length
4. Add matrix of start and mat of end and store into sum and increment sum. i.e. sum+=mat[i][start]+mat[i][end] 
5. Increment the start and decrement the end
6. if the start and end is equal. i.e the mid point as odd then decrease the sum equal to mat[i][start]	 
7. Finally return sum. 
*/
@Test
public void example() {
	int[][] mat = { { 1,2,3 }, {4,5,6},{ 7,8,9 } };
	diagonalSum(mat);
}
private int diagonalSum(int[][] mat) {
	int sum=0,start=0,end =mat.length-1;
	for(int i=0;i<mat.length;i++) {
		if(start==end)sum-=mat[i][start];
		sum+=mat[i][start]+mat[i][end];
		start++;
		end--;
		}System.out.println(sum);
	return sum;	
}	
}
