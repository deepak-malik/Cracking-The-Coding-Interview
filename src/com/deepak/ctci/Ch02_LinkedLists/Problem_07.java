/**
 * Cracking-The-Coding-Interview
 * Problem_07.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement : 
 * 
 * Given two singly linked list, determine if
 * the two lists intersect. Return the intersecting
 * node. Note that intersection is defined based 
 * on the reference and not value. That is, if K'th
 * node of the first linked list is the exact same node
 * (by reference) as the J'th node of the second
 * linked list, then they are intersecting.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to find intersection in two linked lists by reference
	 * 
	 * @param list1
	 * @param list2
	 * @return {@link LinkedListNode}
	 */
	public static <T> LinkedListNode<T> findIntersection(LinkedListNode<T> list1, LinkedListNode<T> list2) {
		/* If either of the lists are null, return null */
		if (list1 == null || list2 == null) {
			return null;
		}

		/* Get tail and size of each of the list */
		Result<T> result1 = getTailAndSize(list1);
		Result<T> result2 = getTailAndSize(list2);

		/* If tails are not equal, that means there is no intersection, return null */
		if (result1.tail != result2.tail) {
			return null;
		}

		/* Set pointers to the start of each linked list */
		LinkedListNode<T> shorter = result1.size < result2.size ? list1 : list2;
		LinkedListNode<T> longer = result1.size < result2.size ? list2 : list1;

		/* Advance the pointer of longer linked list by difference in size */
		longer = getKthNode(longer, Math.abs(result1.size - result2.size));

		/* Keep moving the pointers until they collide */
		while (shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}

		/* Return any one of them */
		return longer;
	}

	/**
	 * Method to get tail and size of the linked list
	 * 
	 * @param list
	 * @return {@link Result}
	 */
	private static <T> Result<T> getTailAndSize(LinkedListNode<T> list) {
		/* If list is null, return null */
		if (list == null) {
			return null;
		}
		/* Initialize size to 1 and current to head */
		int size = 1;
		LinkedListNode<T> current = list;
		/* Keep moving until we have traversed the whole list */
		while (current.next != null) {
			size++;
			current = current.next;
		}
		/* Return new result */
		return new Result<>(current, size);
	}

	/**
	 * Method to get K'th node of the linked list
	 * 
	 * @param head
	 * @param k
	 * @return {@link LinkedListNode}
	 */
	private static <T> LinkedListNode<T> getKthNode(LinkedListNode<T> head, int k) {
		/* Set head to current and keep moving forward until we reach K */
		LinkedListNode<T> current = head;
		while (k > 0 && current != null) {
			current = current.next;
			k--;
		}
		/* Return current node */
		return current;
	}

	/**
	 * Class to hold result 
	 * 
	 * @author Deepak
	 *
	 * @param <T>
	 */
	public static class Result<T> {

		/**
		 * Tail and size of the linked list
		 */
		private LinkedListNode<T> tail;
		private int size;

		/**
		 * Parameterized Constructor
		 * 
		 * @param tail
		 * @param size
		 */
		public Result(LinkedListNode<T> tail, int size) {
			this.tail = tail;
			this.size = size;
		}

	}

}
