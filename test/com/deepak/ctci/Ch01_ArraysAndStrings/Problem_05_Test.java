/**
 * Cracking-The-Coding-Interview
 * Problem_05_Test.java
 */
package com.deepak.ctci.Ch01_ArraysAndStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to check if two strings are one edit away
	 */
	@Test
	public void testOneEditAway() {
		Assert.assertTrue(Problem_05.isOneEditAway("pale", "ple"));
		Assert.assertTrue(Problem_05.isOneEditAway("pales", "pale"));
		Assert.assertTrue(Problem_05.isOneEditAway("pale", "bale"));
		Assert.assertFalse(Problem_05.isOneEditAway("pale", "bake"));
		Assert.assertFalse(Problem_05.isOneEditAway("Hello", "Hi"));
	}

}
