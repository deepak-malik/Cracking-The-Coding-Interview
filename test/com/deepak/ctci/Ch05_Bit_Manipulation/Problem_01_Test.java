/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch05_Bit_Manipulation;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.HelperMethods;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Method to test merging of bits from M to N
	 */
	@Test
	public void testMergeOfBits() {
		int N = 103217;
		int M = 13;
		Assert.assertEquals(HelperMethods.toFullBinaryString(N, 32), "0000 0000 0000 0001 1001 0011 0011 0001");
		Assert.assertEquals(HelperMethods.toFullBinaryString(M, 32), "0000 0000 0000 0000 0000 0000 0000 1101");
		Assert.assertEquals(HelperMethods.toFullBinaryString(Problem_01.mergeMIntoN(103217, 13, 4, 12), 32), "0000 0000 0000 0001 1000 0000 1101 0001");
	}

}
