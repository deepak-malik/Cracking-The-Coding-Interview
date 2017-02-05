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
		Assert.assertEquals(Problem_01.countWays(0), 0);
		Assert.assertEquals(Problem_01.countWays(1), 1);
		Assert.assertEquals(Problem_01.countWays(5), 5);
	}

}
