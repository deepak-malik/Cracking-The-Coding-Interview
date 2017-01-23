/**
 * Cracking-The-Coding-Interview
 * Problem_06.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement : 
 * 
 * Implement a function to check if a linked
 * list is a palindrome.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to check if a given linked list is a palindrome
	 * 
	 * @param head
	 * @return {@link boolean}
	 */
	public static <T> boolean isPalindrome(LinkedListNode<T> head) {
		/* If head is null, stop processing */
		if (head == null) {
			return true;
		}
		/* Reverse the linked list so that we have access to both 
		 * head and reverse head. Then we will compare each item in
		 * linked list one by one*/
		LinkedListNode<T> reverseHead = reverseAndClone(head);
		/* Keep checking the elements until both are null */
		while (head != null && reverseHead != null) {
			/* If at any point, data doesn't match, return false */
			if (!head.data.equals(reverseHead.data)) {
				return false;
			}
			/* Increment the pointers */
			head = head.next;
			reverseHead = reverseHead.next;
		}
		/* Since we have traversed through the entire list, both 
		 * head and reverseHead should be null */
		return head == null && reverseHead == null;
	}

	/**
	 * Method to reverse and clone a linked list when only head node is given 
	 * 
	 * @param node
	 * @return {@link LinkedListNode}
	 */
	private static <T> LinkedListNode<T> reverseAndClone(LinkedListNode<T> node) {
		LinkedListNode<T> head = null;
		/* Keep incrementing the node until it is null */
		while (node != null) {
			/* Clone the node and place it on head */
			LinkedListNode<T> newNode = new LinkedListNode<T>(node.data);
			newNode.next = head;
			head = newNode;
			node = node.next;
		}
		return head;
	}

}
