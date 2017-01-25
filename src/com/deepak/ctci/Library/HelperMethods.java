/**
 * Cracking-The-Coding-Interview
 * HelperMethods.java
 */
package com.deepak.ctci.Library;

import java.util.Arrays;

/**
 * Class to hold helper methods
 * 
 * @author Deepak
 */
public class HelperMethods {

	/**
	 * Method to print the grid in a matrix
	 * 
	 * @param matrix
	 */
	public static void printGrid(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}

}
