/**
 * Cracking-The-Coding-Interview
 * Problem_03_Test.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch03_Stacks_And_Queues.Problem_03.SetOfStacks;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case to check set of stacks
	 */
	@Test
	public void testSetOfStacks() {
		SetOfStacks<Integer> setOfStacks = new SetOfStacks<>();
		Assert.assertEquals(setOfStacks.size(), 0);
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		setOfStacks.push(5);
		setOfStacks.push(6);
		Assert.assertEquals(setOfStacks.size(), 6);
		setOfStacks.push(7);
		setOfStacks.push(8);
		setOfStacks.push(9);
		setOfStacks.push(10);
		setOfStacks.push(11);
		setOfStacks.push(12);
		setOfStacks.push(13);
		Assert.assertEquals(setOfStacks.size(), 13);
		Assert.assertTrue(setOfStacks.pop() == 13);
		Assert.assertEquals(setOfStacks.size(), 12);
		Assert.assertTrue(setOfStacks.pop() == 12);
		Assert.assertEquals(setOfStacks.size(), 11);
		Assert.assertTrue(setOfStacks.pop() == 11);
		Assert.assertEquals(setOfStacks.size(), 10);
		Assert.assertTrue(setOfStacks.pop() == 10);
		Assert.assertEquals(setOfStacks.size(), 9);
		Assert.assertTrue(setOfStacks.popAtIndex(1) == 9);
		Assert.assertEquals(setOfStacks.size(), 8);
		Assert.assertTrue(setOfStacks.popAtIndex(0) == 5);
		Assert.assertEquals(setOfStacks.size(), 7);
	}

}
