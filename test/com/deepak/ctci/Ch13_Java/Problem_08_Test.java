/**
 * Cracking-The-Coding-Interview
 * Problem_08_Test.java
 */
package com.deepak.ctci.Ch13_Java;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases to find a random subset out of a given list
 * 
 * @author Deepak
 */
public class Problem_08_Test {

	/**
	 * Test case to get the random subset using the advanced java loop
	 */
	@Test
	public void testGetRandomSubsetUsingLoop() {
		List<Integer> list = Arrays.asList(3, 5, 7, 10, 44, 32, 78);
		List<Integer> subset = Problem_08.getRandomSubsetUsingLoop(list);
		Assert.assertNotNull(subset);
		Assert.assertTrue(list.size() > subset.size()); /* Since size of subset should be less ideally */
	}

	/**
	 * Test case to get the random subset using lambda 
	 */
	@Test
	public void testGetRandomSubsetUsingLambda() {
		List<Integer> list = Arrays.asList(3, 5, 7, 10, 44, 32, 78);
		List<Integer> subset = Problem_08.getRandomSubsetUsingLambda(list);
		Assert.assertNotNull(subset);
		Assert.assertTrue(list.size() > subset.size());
	}

}
