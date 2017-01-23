/**
 * Cracking-The-Coding-Interview
 * Problem_08.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement : 
 * 
 * Given a circular linked list, implement an 
 * algorithm that returns the node at the beginning
 * of the loop.
 * 
 * DEFINITION: 
 * Circular Linked List : A linked list in which a
 * node's next pointer points to the earlier node, so
 * as to make a loop in the linked list.
 * 
 * Ex. Input : A -> B -> C -> D -> E -> C [The same C as earlier]
 * Output : C
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to return the node where loop starts
	 * 
	 * @param head
	 * @return {@link LinkedListNode}
	 */
	public static <T> LinkedListNode<T> beginingOfLoop(LinkedListNode<T> head) {
		/* If head is null, no processing needed */
		if (head == null) {
			return null;
		}
		/* Initialize two pointers fast and slow. Slow one to move
		 * one step at a time, whereas fast to move two at a time. */
		LinkedListNode<T> fastPointer = head.next;
		LinkedListNode<T> slowPointer = head;
		while (fastPointer != null && slowPointer != null && fastPointer.next != null) {
			/* If they meet, return the intersection else keep on incrementing */
			if (fastPointer.data.equals(slowPointer.data)) {
				return slowPointer;
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return null;
	}

}
