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
	
	/**
	 * Method to print a full binary string
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String toFullBinaryString(int input, int numberOfBits) {
		StringBuilder builder = new StringBuilder();
		/* Create a display mask on the last bit */
		int displayMask = 1 << (numberOfBits - 1);
		/* Loop through all the bits and print accordingly */
		for (int bit = 1; bit <= numberOfBits; bit++) {
			builder.append((input & displayMask) == 0 ? '0' : '1');
			input <<= 1;
			/* Create space after 4 bits */
			if ((bit % 4) == 0) {
				builder.append(' ');
			}
		}
		return builder.toString().trim();
	}

}
