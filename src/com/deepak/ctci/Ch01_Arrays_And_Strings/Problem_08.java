/**
 * Cracking-The-Coding-Interview
 * Problem_08.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;


/**
 * <br> Problem Statement :
 * 
 * Write an algorithm such that if an element in an
 * M X N matrix is 0, it's entire row and column are
 * set to 0.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to set zeros in rows and columns if one entry is zero
	 * 
	 * Time Complexity : O(n^2)
	 * Space Complexity : O(n)
	 * 
	 * @param matrix
	 * @return {@link int[][]}
	 */
	public static int[][] setZeros(int[][] matrix) {
		/* Find number of rows and columns */
		int rows = matrix.length;
		int cols = matrix[0].length;
		/* Create an array of boolean for row and column size */
		boolean[] rowzero = new boolean[rows];
		boolean[] colzero = new boolean[cols];
		/* Traverse through the matrix, where 0 is found, 
		 * make that row and column as true in array.
		 * Note - Matrix is as it is still. Not touched */
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (matrix[r][c] == 0) {
					rowzero[r] = true;
					colzero[c] = true;
				}
			}
		}
		/* Let's deal with rows, for each row, if any one is zero
		 * make the row as zero. Don't touch the column
		 * yet, because we don't know at which position we stand right
		 * now. If we will make column zero, we will loose next set of elements 
		 * int the column */
		for (int r = 0; r < rows; r++) {
			if (rowzero[r]) {
				for (int c = 0; c < cols; c++) {
					matrix[r][c] = 0;
				}
			}
		}
		/* Check each column, if zero found, 
		 * update corresponding column */
		for (int c = 0; c < cols; c++) {
			if (colzero[c]) {
				for (int r = 0; r < rows; r++) {
					matrix[r][c] = 0;
				}
			}
		}
		return matrix;
	}

}
