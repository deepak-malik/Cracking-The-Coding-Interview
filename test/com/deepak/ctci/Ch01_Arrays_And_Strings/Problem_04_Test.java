/**
 * Cracking-The-Coding-Interview
 * Problem_04_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_04;

/**
 * Test cases for problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Test case to check palindrome permutation
	 */
	@Test
	public void testPalindromePermutation() {
		Assert.assertTrue(Problem_04.isPalindromePermutation("Tact Coa"));
		Assert.assertTrue(Problem_04.isPalindromePermutation("Deepak Malik pmli"));
		Assert.assertFalse(Problem_04.isPalindromePermutation("Deepak Malik"));
		Assert.assertFalse(Problem_04.isPalindromePermutation(null));
		Assert.assertTrue(Problem_04.isPalindromePermutation("pop 1212"));
		Assert.assertFalse(Problem_04.isPalindromePermutation("1234 1256"));
	}

}
