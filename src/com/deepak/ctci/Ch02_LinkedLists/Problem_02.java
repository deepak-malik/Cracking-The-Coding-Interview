/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement : 
 * 
 * Implement an algorithm to find K'th to 
 * last element of a singly linked list.
 * Note : Size of linked list is not known
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/* One Approach could be looping through the list twice.
	 * In first pass, loop through entire list and find the size.
	 * In second pass, loop through size - K times. */

	/**
	 * Method to find K'th to last element
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param head
	 * @param k
	 * @return {@link LinkedListNode}
	 */
	public static <T> LinkedListNode<T> findKthToLastElement(LinkedListNode<T> head, int k) {
		/* If head is null or K is negative, stop processing */
		if (head == null || k <= 0) {
			throw new IllegalArgumentException("Invalid Input!!");
		}
		/* Create two pointers */
		LinkedListNode<T> pointer1 = head, pointer2 = head;
		/* Move first pointer till K */
		for (int i = 0; i < k; i++) {
			if (pointer1 == null) {
				return null;
			}
			pointer1 = pointer1.next;
		}

		/* Now move both at same pace, when pointer1 hits end, 
		 * pointer2 will be at right element */
		while (pointer1 != null) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
		}
		return pointer2;
	}

}
