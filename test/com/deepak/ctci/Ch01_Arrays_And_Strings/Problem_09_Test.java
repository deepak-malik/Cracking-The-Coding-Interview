/**
 * Cracking-The-Coding-Interview
 * Problem_09_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_09;

/**
 * Test cases for Problem 09
 * 
 * @author Deepak
 */
public class Problem_09_Test {

	/**
	 * Test case to check string rotation
	 */
	@Test
	public void testStringRotation() {
		Assert.assertTrue(Problem_09.isRotation("waterbottle", "erbottlewat"));
		Assert.assertFalse(Problem_09.isRotation("camera", "macera"));
		Assert.assertTrue(Problem_09.isRotation("rotation", "rotation"));
		Assert.assertFalse(Problem_09.isRotation("sample", null));
		Assert.assertFalse(Problem_09.isRotation(null, "sample"));
		Assert.assertFalse(Problem_09.isRotation(null, null));
	}

}
