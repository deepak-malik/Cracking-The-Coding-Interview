/**
 * Cracking-The-Coding-Interview
 * Problem_03_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case to check for magic index brute force
	 */
	@Test
	public void testMagicIndexBruteForce() {
		int[] array = {-9, -3, 0, 2, 3, 4, 6, 9, 10, 13};
		Assert.assertEquals(Problem_03.magicIndex_BruteForce(array), 6);
		int[] array1 = {-9, -3, 0, 2, 3, 4, 8, 9, 10, 13};
		Assert.assertEquals(Problem_03.magicIndex_BruteForce(array1), -1);
	}
	
	/**
	 * Test case to check for magic index optimized
	 */
	@Test
	public void testMagicIndexOptimized() {
		int[] array = {-9, -3, 0, 2, 3, 4, 6, 9, 10, 13};
		Assert.assertEquals(Problem_03.magicIndex_Optimized(array, 0, array.length - 1), 6);
		int[] array1 = {-9, -3, 0, 2, 3, 4, 8, 9, 10, 13};
		Assert.assertEquals(Problem_03.magicIndex_Optimized(array1, 0, array.length - 1), -1);
	}
	
}
