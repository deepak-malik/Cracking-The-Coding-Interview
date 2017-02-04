/**
 * Cracking-The-Coding-Interview
 * Problem_04_Test.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test cases for sorting a stack
	 */
	@Test
	public void testSortStack() {
		Stack<Integer> input = new Stack<>();
		input.push(2);
		input.push(9);
		input.push(7);
		input.push(3);
		input.push(1);
		input.push(5);
		input.push(10);
		Assert.assertTrue(input.size() == 7);
		Stack<Integer> output = Problem_05.sortStack(input);
		Assert.assertTrue(output.pop() == 10);
		Assert.assertTrue(output.pop() == 9);
		Assert.assertTrue(output.pop() == 7);
		Assert.assertTrue(output.pop() == 5);
		Assert.assertTrue(output.pop() == 3);
		Assert.assertTrue(output.pop() == 2);
		Assert.assertTrue(output.pop() == 1);
		Assert.assertTrue(output.size() == 0);
	}

}
