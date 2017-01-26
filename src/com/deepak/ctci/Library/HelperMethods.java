/**
 * Cracking-The-Coding-Interview
 * HelperMethods.java
 */
package com.deepak.ctci.Library;

import java.util.Arrays;
import java.util.Random;

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

	/**
	 * Method to get a random integer between a given range
	 * 
	 * @param min
	 * @param max
	 * @return {@link int}
	 */
	public static int randomIntInRange(int min, int max) {
		Random random = new Random();
		return random.nextInt(max + 1 - min) + min;
	}

}
