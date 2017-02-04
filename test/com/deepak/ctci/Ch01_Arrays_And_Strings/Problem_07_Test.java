/**
 * Cracking-The-Coding-Interview
 * Problem_07_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_07;
import com.deepak.ctci.Library.HelperMethods;

/**
 * Test cases to rotate a matrix
 * 
 * @author Deepak
 */
public class Problem_07_Test {

	/**
	 * Test case to rotate a matrix
	 */
	@Test
	public void testRotateMatrix() {
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,1,2,3}, {4,5,6,7}};
		System.out.println("Test Case 1 : Rotating Matrix => ");
		System.out.println("Actual Matrix : ");
		HelperMethods.printGrid(matrix);
		int[][] rotatedMatrix = Problem_07.rotateMatrix(matrix);
		System.out.println("Rotated Matrix : ");
		HelperMethods.printGrid(rotatedMatrix);
		System.out.println();
		Assert.assertEquals(matrix.length, rotatedMatrix.length);
		Assert.assertEquals(matrix[0].length, rotatedMatrix[0].length);
	}

	/**
	 * Test case to rotate a matrix in place
	 */
	@Test
	public void testRotateMatrixInPlace() {
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,1,2,3}, {4,5,6,7}};
		System.out.println("Test Case 2 : Rotating Matrix in Place => ");
		System.out.println("Actual Matrix : ");
		HelperMethods.printGrid(matrix);
		int[][] rotatedMatrix = Problem_07.rotateMatrixInPlace(matrix);
		System.out.println("Rotated Matrix : ");
		HelperMethods.printGrid(rotatedMatrix);
		System.out.println();
		Assert.assertEquals(matrix.length, rotatedMatrix.length);
		Assert.assertEquals(matrix[0].length, rotatedMatrix[0].length);
	}

}
