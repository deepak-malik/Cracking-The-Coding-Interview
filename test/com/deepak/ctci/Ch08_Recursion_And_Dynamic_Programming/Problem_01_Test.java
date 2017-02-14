/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to count number of steps
	 */
	@Test
	public void testCountSteps() {
		/* Brute Force */
		Assert.assertEquals(Problem_01.countWaysBruteForce(0), 1);
		Assert.assertEquals(Problem_01.countWaysBruteForce(1), 1);
		Assert.assertEquals(Problem_01.countWaysBruteForce(3), 4);
		Assert.assertEquals(Problem_01.countWaysBruteForce(5), 13);
		/* Optimized */
		Assert.assertEquals(Problem_01.countWaysOptimized(0), 1);
		Assert.assertEquals(Problem_01.countWaysOptimized(1), 1);
		Assert.assertEquals(Problem_01.countWaysOptimized(3), 4);
		Assert.assertEquals(Problem_01.countWaysOptimized(5), 13);
	}

}
