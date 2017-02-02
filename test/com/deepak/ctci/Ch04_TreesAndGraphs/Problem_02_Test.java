/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check minimal BST creation
	 */
	@Test
	public void testMinimalBST() {
		Integer[] arrayInput = {1, 3, 5, 7, 9, 13, 17};
		Assert.assertTrue(Problem_02.createMinimalBST(arrayInput).data == 7);
		Assert.assertTrue(Problem_02.createMinimalBST(arrayInput).left.data == 3);
		Assert.assertTrue(Problem_02.createMinimalBST(arrayInput).right.data == 13);
	}

}
