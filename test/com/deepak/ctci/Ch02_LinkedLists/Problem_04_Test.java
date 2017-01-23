/**
 * Cracking-The-Coding-Interview
 * Problem_04_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Method to test partition of a linked list
	 */
	@Test
	public void testPartitionOfLinkedList() {
		LinkedListNode<Integer> node1 = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> node2 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> node3 = new LinkedListNode<Integer>(8);
		LinkedListNode<Integer> node4 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> node5 = new LinkedListNode<Integer>(10);
		LinkedListNode<Integer> node6 = new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> node7 = new LinkedListNode<Integer>(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		Assert.assertEquals(node1.printForward(), "3->5->8->5->10->2->1");
		LinkedListNode<Integer> head = Problem_04.partition(node1, 5);
		Assert.assertEquals(head.printForward(), "1->2->3->5->8->5->10");
	}

}
