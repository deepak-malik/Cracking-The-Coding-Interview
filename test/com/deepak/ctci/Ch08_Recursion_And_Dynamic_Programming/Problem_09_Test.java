/**
 * Cracking-The-Coding-Interview
 * Problem_09_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 09
 * 
 * @author Deepak
 */
public class Problem_09_Test {

	/**
	 * Test case to check parenthesis generation
	 */
	@Test
	public void testParenthesis() {
		Assert.assertEquals(String.join(",", Problem_09.generateParens(1)), "()");
		Assert.assertEquals(String.join(",", Problem_09.generateParens(2)), "()(),(())");
		Assert.assertEquals(String.join(",", Problem_09.generateParens(3)), "()()(),(()()),()(()),((())),(())()");
	}

}
