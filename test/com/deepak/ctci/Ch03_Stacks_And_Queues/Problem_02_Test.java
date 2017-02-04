/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch03_Stacks_And_Queues.Problem_02.CustomStack;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case for custom stack
	 */
	@Test
	public void testCustomStack() {
		CustomStack stack = new CustomStack(10);
		Assert.assertTrue(stack.size() == 0);
		stack.push(3);
		stack.push(5);
		Assert.assertTrue(stack.min() == 3);
		Assert.assertTrue(stack.size() == 2);
		stack.push(1);
		Assert.assertTrue(stack.min() == 1);
		Assert.assertTrue(stack.size() == 3);
	}

}
