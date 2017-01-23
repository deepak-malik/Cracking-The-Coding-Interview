/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch01_ArraysAndStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check the uniqueness of Ascii strings
	 */
	@Test
	public void testUniqueCharactersForAsciiString() {
		Assert.assertFalse(Problem_01.hasUniqueAscii("Deepak"));
		Assert.assertFalse(Problem_01.hasUniqueAscii(""));
		Assert.assertFalse(Problem_01.hasUniqueAscii(null));
		Assert.assertTrue(Problem_01.hasUniqueAscii("Malik"));
	}

	/**
	 * Test case to check the uniqueness of Unicode strings
	 */
	@Test
	public void testUniqueCharactersForUnicodeString() {
		Assert.assertFalse(Problem_01.hasUniqueUnicode("Deepak"));
		Assert.assertFalse(Problem_01.hasUniqueUnicode(""));
		Assert.assertFalse(Problem_01.hasUniqueUnicode(null));
		Assert.assertTrue(Problem_01.hasUniqueUnicode("Malik"));
	}

}
