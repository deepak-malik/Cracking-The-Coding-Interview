/**
 * Cracking-The-Coding-Interview
 * Problem_05_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to check product of two numbers
	 */
	@Test
	public void testProduct() {
		Assert.assertEquals(Problem_05.product(2, 3), 6);
		Assert.assertEquals(Problem_05.product(3, 2), 6);
		Assert.assertEquals(Problem_05.product(9, 12), 108);
		Assert.assertEquals(Problem_05.product(0, 13), 0);
	}

}
