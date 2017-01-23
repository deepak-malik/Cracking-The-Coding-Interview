/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to find K'th to last element
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testFindingKthToLastElement() {
		LinkedListNode<Integer> node1 = new LinkedListNode<Integer>(7);
		LinkedListNode<Integer> node2 = new LinkedListNode<Integer>(13);
		LinkedListNode<Integer> node3 = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> node4 = new LinkedListNode<Integer>(34);
		LinkedListNode<Integer> node5 = new LinkedListNode<Integer>(71);
		LinkedListNode<Integer> node6 = new LinkedListNode<Integer>(56);
		LinkedListNode<Integer> node7 = new LinkedListNode<Integer>(10);
		LinkedListNode<Integer> node8 = new LinkedListNode<Integer>(39);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = null;
		Assert.assertEquals(Problem_02.findKthToLastElement(node1, 3).data.intValue(), 56);
		Assert.assertEquals(Problem_02.findKthToLastElement(node1, 6).data.intValue(), 3);
		Assert.assertEquals(Problem_02.findKthToLastElement(node1, 0).data.intValue(), 0);
	}

}
