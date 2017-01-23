/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check removal of duplicates from a linked list
	 * when temporary buffer is allowed
	 */
	@Test
	public void testRemoveDuplicatesWithBufferFromLinkedList() {
		LinkedListNode<String> node1 = new LinkedListNode<String>("Tom");
		LinkedListNode<String> node2 = new LinkedListNode<String>("Alex");
		LinkedListNode<String> node3 = new LinkedListNode<String>("Alex");
		LinkedListNode<String> node4 = new LinkedListNode<String>("Steve");
		LinkedListNode<String> node5 = new LinkedListNode<String>("Bob");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		Assert.assertEquals(node1.printForward(), "Tom->Alex->Alex->Steve->Bob");
		Problem_01.removeDuplicatesWithBuffer(node1);
		Assert.assertEquals(node1.printForward(), "Tom->Alex->Steve->Bob");
	}

	/**
	 * Test case to check removal of duplicates from a linked list
	 * when temporary buffer is not allowed
	 */
	@Test
	public void testRemoveDuplicatesWithoutBufferFromLinkedList() {
		LinkedListNode<String> node1 = new LinkedListNode<String>("Tom");
		LinkedListNode<String> node2 = new LinkedListNode<String>("Alex");
		LinkedListNode<String> node3 = new LinkedListNode<String>("Alex");
		LinkedListNode<String> node4 = new LinkedListNode<String>("Steve");
		LinkedListNode<String> node5 = new LinkedListNode<String>("Bob");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		Assert.assertEquals(node1.printForward(), "Tom->Alex->Alex->Steve->Bob");
		Problem_01.removeDuplicatesWithoutBuffer(node1);
		Assert.assertEquals(node1.printForward(), "Tom->Alex->Steve->Bob");
	}

}
