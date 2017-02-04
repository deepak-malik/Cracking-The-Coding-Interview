/**
 * Cracking-The-Coding-Interview
 * Problem_08_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.HelperMethods;

/**
 * Test cases for Problem 08
 * 
 * @author Deepak
 */
public class Problem_08_Test {

	/**
	 * Method to test zero matrix
	 */
	@Test
	public void testZeroMatrix() {
		int[][] matrix = {{7,3,9,3,5}, {0,1,3,9,0}, {2,1,7,3,4}, {3,4,7,6,9}};
		
		System.out.println("Input Matrix => ");
		HelperMethods.printGrid(matrix);
		Assert.assertEquals(Arrays.toString(matrix[0]), "[7, 3, 9, 3, 5]");
		Assert.assertEquals(Arrays.toString(matrix[1]), "[0, 1, 3, 9, 0]");
		Assert.assertEquals(Arrays.toString(matrix[2]), "[2, 1, 7, 3, 4]");
		Assert.assertEquals(Arrays.toString(matrix[3]), "[3, 4, 7, 6, 9]");
		
		int[][] updatedMatrix = Problem_08.setZeros(matrix);
		System.out.println("Output Matrix => ");
		HelperMethods.printGrid(updatedMatrix);
		Assert.assertEquals(Arrays.toString(matrix[0]), "[0, 3, 9, 3, 0]");
		Assert.assertEquals(Arrays.toString(matrix[1]), "[0, 0, 0, 0, 0]");
		Assert.assertEquals(Arrays.toString(matrix[2]), "[0, 1, 7, 3, 0]");
		Assert.assertEquals(Arrays.toString(matrix[3]), "[0, 4, 7, 6, 0]");
	}
	
}
