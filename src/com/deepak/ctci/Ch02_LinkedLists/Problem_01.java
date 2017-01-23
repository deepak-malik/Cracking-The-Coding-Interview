/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import java.util.HashSet;
import java.util.Set;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement:
 * 
 * Write code to remove duplicates from unsorted linked list
 * 
 * FOLLOW UP : How would you solve this problem 
 * if temporary buffer is not allowed.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to remove duplicates from a linked list
	 * when additional buffer is allowed
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * @param head
	 */
	public static <T> void removeDuplicatesWithBuffer(LinkedListNode<T> head) {
		/* If head is null, stop processing */
		if (head == null) {
			return;
		}
		/* We need just one pointer here i.e previous to keep track of
		 * previous node, because if we find duplicate, we have to remove 
		 * current node and point previous to next */
		Set<T> set = new HashSet<>();
		LinkedListNode<T> current = head;
		LinkedListNode<T> previous = null;
		/* Check until current is not null, we will be incrementing current */
		while (current != null) {
			/* If value doesn't exist in set, add it
			 * and move the pointer else just move the pointer */
			if (!set.contains(current.data)) {
				set.add(current.data);
				previous = current;
			} else {
				previous.next = current.next;
			}
			current = current.next;
		}
	}

	/**
	 * Method to remove duplicates from Linked list
	 * when no additional buffer is allowed.
	 * 
	 * Time Complexity : O(n^2)
	 * Space Complexity : O(1)
	 * 
	 * @param head
	 */
	public static <T> void removeDuplicatesWithoutBuffer(LinkedListNode<T> head) {
		/* If head is null, stop processing */
		if (head == null) {
			return;
		}
		/* We will need two pointers here i.e current and runner.
		 * When current is pointing to a node, move runner through
		 * rest of the list, checking for duplicates */
		LinkedListNode<T> current = head;
		while (current != null) {
			/* Have runner point to current node */
			LinkedListNode<T> runner = current;
			while (runner.next != null) {
				/* If it is duplicate, jump runner over the node */
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next; 
				}
			}
			current = current.next;
		}
	}

}
