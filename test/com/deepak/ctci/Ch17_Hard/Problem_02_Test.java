/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch17_Hard;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to shuffle deck of cards
	 */
	@Test
	public void testCardsShuffle() {
		int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
				41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
				51, 52};
		/* We can just check if we got all cards back after shuffling.
		 * Order cannot be checked here since random calculation is involved. */
		Assert.assertEquals(Problem_02.shuffleDeckOfCards(cards).length, 52);
	}

}
