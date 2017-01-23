/**
 * Cracking-The-Coding-Interview
 * Problem_03.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement : 
 * 
 * Implement an algorithm to delete a node
 * in the middle (i.e any node but the first
 * and last node. Not necessarily the exact middle)
 * of a singly linked list, given only access to 
 * first node.
 * 
 * ex. delete c from : a -> b -> c -> d -> e -> f
 * output : a -> b -> d -> e -> f
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to delete a node when access is 
	 * given only to that node
	 * 
	 * @param node
	 * @return {@link boolean}
	 */
	public static <T> boolean deleteNode(LinkedListNode<T> node) {
		/* If it is null or last node, return false */
		if (node == null || node.next == null) {
			return false;
		}
		/* Point to the next node. Skip the one to be deleted */
		node.data = node.next.data;
		node.next = node.next.next;
		return true;
	}

}
