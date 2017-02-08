/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch05_Bit_Manipulation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case for binary representation of decimal number
	 */
	@Test
	public void testBinaryRepresentationOfDecimalNumber() {
		Assert.assertEquals(Problem_02.printBinary(0.125), ".001");
		Assert.assertEquals(Problem_02.printBinary(0.734), "ERROR");
		Assert.assertEquals(Problem_02.printBinary(0.5), ".1");
		Assert.assertEquals(Problem_02.printBinary(0.99), "ERROR");
	}

}
