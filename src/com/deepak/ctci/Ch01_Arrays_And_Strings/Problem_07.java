/**
 * Cracking-The-Coding-Interview
 * Problem_07.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

/**
 * <br> Problem Statement :
 * 
 * Given an image represented by an N X N matrix, where
 * each pixel in the image is 4 bytes, write a method to
 * rotate the image by 90 degrees. Can you do this in place.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to rotate a matrix by 90 degrees
	 * 
	 * @param matrix
	 * @return {@link int[][]}
	 */
	public static int[][] rotateMatrix(int[][] matrix) {
		/* Return false if matrix is null. Since this is N X N matrix,
		 * it has to be square */
		final int M = matrix.length;
		final int N = matrix[0].length;
		if (matrix == null || M != N) {
			return null;
		}
		/* Create a new matrix with same length and width */
		int[][] rotatedMatrix = new int[M][N];
		/* We need two loops, because we have to loop through each layer
		 * and each layer has length and width */
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				/* Update the position of elements */
				rotatedMatrix[j][M - 1 - i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	/**
	 * Method to rotate a matrix in place
	 * 
	 * @param matrix
	 * @return {@link int[][]}
	 */
	public static int[][] rotateMatrixInPlace(int[][] matrix) {
		/* Return false if matrix is null. Since this is N X N matrix,
		 * it has to be square */
		final int M = matrix.length;
		final int N = matrix[0].length;
		if (matrix == null || M != N) {
			return null;
		}
		for (int layer = 0; layer < N / 2; layer++) {
			int first = layer;
			int last = N - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; /* Save top */
				matrix[first][i] = matrix[last - offset][first]; /* Left to Top */
				matrix[last-offset][first] = matrix[last][last - offset]; /* Bottom to Left */
				matrix[last][last - offset] = matrix[i][last]; /* Right to Bottom */
				matrix[i][last] = top; /* Top to Right */
			}
		}
		return matrix;
	}

}
