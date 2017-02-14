/**
 * Cracking-The-Coding-Interview
 * Problem_10_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming.Problem_10.Color;

/**
 * Test cases for Problem 10
 * 
 * @author Deepak
 */
public class Problem_10_Test {

	/**
	 * Method to test paint fill
	 */
	@Test
	public void testPaintFill() {
		/* Define a screen with different colors */
		Color[][] screen = {{Color.Red, Color.Black, Color.Yellow}, 
				{Color.Blue, Color.Green, Color.White},
				{Color.Yellow, Color.Blue, Color.Green}};
		/* Check if entire screen is filled */
		Assert.assertTrue(Problem_10.paintFill(screen, 1, 1, Color.Red));
	}

}
