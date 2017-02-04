/**
 * Cracking-The-Coding-Interview
 * Problem_06_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_06;

/**
 * Test cases for Problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/**
	 * Test case to check compression when input is null
	 */
	@Test
	public void testCompressStringWhenNull() {
		Assert.assertNull(Problem_06.compressString(null));
	}

	/**
	 * Test case to check compression with valid value
	 */
	@Test
	public void testCompressStringWithValidValue() {
		Assert.assertEquals(Problem_06.compressString("aabcccccaaa"), "a2b1c5a3");
	}

	/**
	 * Test case to check compression when input is small
	 */
	@Test
	public void testCompressStringWhenInputIsSmall() {
		Assert.assertEquals(Problem_06.compressString("acfedhi"), "acfedhi");
	}

}
