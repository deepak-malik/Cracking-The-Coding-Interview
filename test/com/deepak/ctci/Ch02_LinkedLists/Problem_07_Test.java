/**
 * Cracking-The-Coding-Interview
 * Problem_07_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for Problem 07
 * 
 * @author Deepak
 */
public class Problem_07_Test {

	/**
	 * Test case to check intersection of 2 linked lists
	 * Our linked list for this test case is, 
	 * 
	 * 3 -> 1 -> 5 -> 9
	 * 					\
	 * 				      7 -> 2 -> 1
	 * 					/					
	 * 			 4 -> 6 
	 * 
	 * Intersection is at 7.
	 */
	@Test
	public void testIntersectionOfLinkedList() {
		/* Define nodes of list 1 */
		LinkedListNode<Integer> list1_node1 = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> list1_node2 = new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> list1_node3 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> list1_node4 = new LinkedListNode<Integer>(9);
		LinkedListNode<Integer> list1_node5 = new LinkedListNode<Integer>(7);
		LinkedListNode<Integer> list1_node6 = new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> list1_node7 = new LinkedListNode<Integer>(1);

		/* Define nodes of list 2 */
		LinkedListNode<Integer> list2_node1 = new LinkedListNode<Integer>(4);
		LinkedListNode<Integer> list2_node2 = new LinkedListNode<Integer>(6);

		/* Connect them so that they become similar to above linked list */
		list1_node1.next = list1_node2;
		list1_node2.next = list1_node3;
		list1_node3.next = list1_node4;
		list1_node4.next = list1_node5;
		list1_node5.next = list1_node6;
		list1_node6.next = list1_node7;
		list1_node7.next = null;
		list2_node1.next = list2_node2;
		list2_node2.next = list1_node5;

		Assert.assertEquals(Problem_07.findIntersection(list1_node1, list2_node1), list1_node5);
		Assert.assertNull(Problem_07.findIntersection(list1_node1, null));
		Assert.assertNull(Problem_07.findIntersection(null, list2_node1));
	}

}
