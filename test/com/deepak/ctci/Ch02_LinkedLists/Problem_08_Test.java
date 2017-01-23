/**
 * Cracking-The-Coding-Interview
 * Problem_08_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for problem 08
 * 
 * @author Deepak
 */
public class Problem_08_Test {

	/**
	 * Test case to check happy flow
	 */
	@Test
	public void testBeginningOfLoop() {
		LinkedListNode<String> node1 = new LinkedListNode<String>("A");
		LinkedListNode<String> node2 = new LinkedListNode<String>("B");
		LinkedListNode<String> node3 = new LinkedListNode<String>("C");
		LinkedListNode<String> node4 = new LinkedListNode<String>("D");
		LinkedListNode<String> node5 = new LinkedListNode<String>("E");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;
		Assert.assertEquals(Problem_08.beginingOfLoop(node1).data, "C");
	}

	/**
	 * Test case to check beginning of loop when head is null
	 */
	@Test
	public void testBeginningOfLoopWhenHeadIsNull() {
		Assert.assertNull(Problem_08.beginingOfLoop(null));
	}

	/**
	 * Test case to check beginning of loop when there is no loop
	 */
	@Test
	public void testBeginningOfLoopWhenThereIsNoLoop() {
		LinkedListNode<String> node1 = new LinkedListNode<String>("A");
		LinkedListNode<String> node2 = new LinkedListNode<String>("B");
		LinkedListNode<String> node3 = new LinkedListNode<String>("C");
		LinkedListNode<String> node4 = new LinkedListNode<String>("D");
		LinkedListNode<String> node5 = new LinkedListNode<String>("E");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		Assert.assertEquals(Problem_08.beginingOfLoop(node1), null);
	}

}
