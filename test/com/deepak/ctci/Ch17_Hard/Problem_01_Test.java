/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch17_Hard;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case for addition of two numbers
	 */
	@Test
	public void testAddition() {
		Assert.assertEquals(Problem_01.add_Iterative(100, 5), 105);
		Assert.assertEquals(Problem_01.add_Iterative(0, 0), 0);
		Assert.assertEquals(Problem_01.add_Iterative(355, 823), 1178);
		Assert.assertEquals(Problem_01.add_Recursive(100, 5), 105);
		Assert.assertEquals(Problem_01.add_Recursive(0, 0), 0);
		Assert.assertEquals(Problem_01.add_Recursive(355, 823), 1178);
	}

}
