/**
 * Cracking-The-Coding-Interview
 * Problem_05_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test case for problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to find the sum of two linked lists backward 
	 */
	@Test
	public void testFindSumBackwardOrder() {
		/* Define nodes of list 1 */
		LinkedListNode<Integer> list1_node1 = new LinkedListNode<Integer>(7);
		LinkedListNode<Integer> list1_node2 = new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> list1_node3 = new LinkedListNode<Integer>(6);

		/* Define nodes of list 2 */
		LinkedListNode<Integer> list2_node1 = new LinkedListNode<Integer>(5);
		LinkedListNode<Integer> list2_node2 = new LinkedListNode<Integer>(9);
		LinkedListNode<Integer> list2_node3 = new LinkedListNode<Integer>(2);

		/* Connect them*/
		list1_node1.next = list1_node2;
		list1_node2.next = list1_node3;
		list1_node3.next = null;

		list2_node1.next = list2_node2;
		list2_node2.next = list2_node3;
		list2_node3.next = null;

		Assert.assertEquals(list1_node1.printForward(), "7->1->6");
		Assert.assertEquals(list2_node1.printForward(), "5->9->2");
		Assert.assertEquals(Problem_05.findSumBackwardOrder(list1_node1, list2_node1, 0).printForward(), "2->1->9");
	}

}
