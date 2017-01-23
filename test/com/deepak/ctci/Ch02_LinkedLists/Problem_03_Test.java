/**
 * Cracking-The-Coding-Interview
 * Problem_03_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case to check deletion of node from middle
	 * of the linked list
	 */
	@Test
	public void testDeleteNodeFromMiddle() {
		LinkedListNode<String> node1 = new LinkedListNode<String>("a");
		LinkedListNode<String> node2 = new LinkedListNode<String>("b");
		LinkedListNode<String> node3 = new LinkedListNode<String>("c");
		LinkedListNode<String> node4 = new LinkedListNode<String>("d");
		LinkedListNode<String> node5 = new LinkedListNode<String>("e");
		LinkedListNode<String> node6 = new LinkedListNode<String>("f");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		Assert.assertEquals(node1.printForward(), "a->b->c->d->e->f");
		Assert.assertTrue(Problem_03.deleteNode(node3));
		Assert.assertEquals(node1.printForward(), "a->b->d->e->f");
		Assert.assertFalse(Problem_03.deleteNode(node6));
		Assert.assertEquals(node1.printForward(), "a->b->d->e->f");
	}

}
