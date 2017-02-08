/**
 * Cracking-The-Coding-Interview
 * Problem_05_Test.java
 */
package com.deepak.ctci.Ch06_Math_And_Logic_Puzzles;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch06_Math_And_Logic_Puzzles.Problem_05.Jug;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to check four quarters of water
	 */
	@Test
	public void testFourQuartersOfWater() {
		Jug jug1 = new Jug(5);
		Jug jug2 = new Jug(3);
		Problem_05.fillWithWater(jug1, 5);
		Problem_05.transferFromJug1ToJug2(jug1, jug2, 3);
		Problem_05.makeEmpty(jug2);
		Problem_05.transferFromJug1ToJug2(jug1, jug2, 2);
		Problem_05.fillWithWater(jug1, 5);
		Problem_05.transferFromJug1ToJug2(jug1, jug2, 1);
		Assert.assertEquals(jug1.getCurrentCapacity(), 4);
		Assert.assertEquals(jug2.getCurrentCapacity(), 3);
	}

}
