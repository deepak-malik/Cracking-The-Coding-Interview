/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_02;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check if two case sensitive strings are valid permutation
	 */
	@Test
	public void testValidPermutationForCaseSensitiveStrings() {
		Assert.assertFalse(Problem_02.isValidPermutation_CaseSensitive("Dog", "god"));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseSensitive("Deepak Malik", "kilaM kapeeD"));
		Assert.assertFalse(Problem_02.isValidPermutation_CaseSensitive("Dog", "God"));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseSensitive("", ""));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseSensitive(null, null));
		Assert.assertFalse(Problem_02.isValidPermutation_CaseSensitive("ABCD", "DBCAF"));
	}

	/**
	 * Test case to check if two case insensitive strings are valid permutation
	 */
	@Test
	public void testValidPermutationForCaseInSensitiveStrings() {
		Assert.assertTrue(Problem_02.isValidPermutation_CaseInSensitive("Dog", "god"));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseInSensitive("Deepak Malik", "kilaM kapeeD"));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseInSensitive("Dog", "God"));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseInSensitive("", ""));
		Assert.assertTrue(Problem_02.isValidPermutation_CaseInSensitive(null, null));
		Assert.assertFalse(Problem_02.isValidPermutation_CaseInSensitive("ABCD", "DBCAF"));
	}

}
