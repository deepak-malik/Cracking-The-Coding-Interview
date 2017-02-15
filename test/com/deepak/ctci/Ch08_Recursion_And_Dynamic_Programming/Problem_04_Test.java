/**
 * Cracking-The-Coding-Interview
 * Problem_04_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Test case to check subsets
	 */
	@Test
	public void testSubSets() {
		ArrayList<Integer> set = new ArrayList<>();
		set.add(1);
		set.add(3);
		set.add(7);
		Assert.assertEquals(Problem_04.findSubSets_Recursive(set, 0).toString(), "[[], [7], [3], [3, 7], [1], [1, 7], [1, 3], [1, 3, 7]]");
		Assert.assertEquals(Problem_04.findSubSets_Recursive(set, 2).toString(), "[[], [7]]");
	}

}
