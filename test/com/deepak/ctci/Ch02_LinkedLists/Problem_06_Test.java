/**
 * Cracking-The-Coding-Interview
 * Problem_06_Test.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * Test cases for Problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/**
	 * Method to test if a given linked list is palindrome
	 */
	@Test
	public void testIsPalindrome() {
		LinkedListNode<String> node1 = new LinkedListNode<String>("A");
		LinkedListNode<String> node2 = new LinkedListNode<String>("B");
		LinkedListNode<String> node3 = new LinkedListNode<String>("C");
		LinkedListNode<String> node4 = new LinkedListNode<String>("D");
		LinkedListNode<String> node5 = new LinkedListNode<String>("C");
		LinkedListNode<String> node6 = new LinkedListNode<String>("B");
		LinkedListNode<String> node7 = new LinkedListNode<String>("A");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		Assert.assertTrue(Problem_06.isPalindrome(node1));
	}

	/**
	 * Method to test if a given linked list
	 * is palindrome when head is null
	 */
	@Test
	public void testIsPalindromeWhenHeadIsNull() {
		Assert.assertTrue(Problem_06.isPalindrome(null));
	}

}
