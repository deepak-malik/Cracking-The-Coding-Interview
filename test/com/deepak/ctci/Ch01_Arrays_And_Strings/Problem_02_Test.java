/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check valid permutation through brute force method
	 */
	@Test
	public void testValidPermutation_BruteForce() {
		Assert.assertTrue(Problem_02.isValidPermutation_BruteForce("apple", "papel"));
		Assert.assertTrue(Problem_02.isValidPermutation_BruteForce("carrot", "tarroc"));
		Assert.assertFalse(Problem_02.isValidPermutation_BruteForce("hello", "llloh"));
	}

	/**
	 * Test case to check valid permutation through optimized approach
	 */
	@Test
	public void testValidPermutation_Optimized() {
		Assert.assertTrue(Problem_02.isValidPermutation_Optimized("apple", "papel"));
		Assert.assertTrue(Problem_02.isValidPermutation_Optimized("carrot", "tarroc"));
		Assert.assertFalse(Problem_02.isValidPermutation_Optimized("hello", "llloh"));
	}

}
