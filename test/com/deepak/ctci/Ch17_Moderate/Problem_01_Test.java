/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch17_Moderate;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases to swap two numbers
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to swap numbers in place
	 */
	@Test
	public void testNumberSwap() {
		Map<String, Integer> output = Problem_01.swap(7, 3);
		Assert.assertEquals(output.get("first"), Integer.valueOf(3));
		Assert.assertEquals(output.get("second"), Integer.valueOf(7));
	}

	/**
	 * Test case to swap numbers using bits
	 */
	@Test
	public void testNumberSwapUsingBits() {
		Map<String, Integer> output = Problem_01.swapUsingBits(7, 3);
		Assert.assertEquals(output.get("first"), Integer.valueOf(3));
		Assert.assertEquals(output.get("second"), Integer.valueOf(7));
	}

}
