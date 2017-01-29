/**
 * Cracking-The-Coding-Interview
 * Problem_05.java
 */
package com.deepak.ctci.Ch02_LinkedLists;

import com.deepak.ctci.Library.LinkedListNode;

/**
 * <br> Problem Statement : 
 * 
 * You have two numbers represented by a linked list,
 * where each node contains a single digit. The digits
 * are stored in reverse order, such that 1's digit is 
 * at the head of the list. Write a function that adds
 * the two numbers and returns the sum as linked list
 * 
 * Ex: Input : (7 -> 1 -> 6) + (5 -> 9 -> 2). That's 617 + 295
 * Output : 2 -> 1 > 9. That is, 912
 * 
 * FOLLOW UP : Suppose the digits are stored in forward order.
 * Repeat the above problem.
 * 
 * Ex. Input : (6 -> 1 -> 7) + (2 -> 9 -> 5). That's 617 + 295
 * Output : 9 -> 1 > 2. That is, 912
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to find sum backward order
	 * 
	 * @param headOfList1
	 * @param headOfList2
	 * @param carry
	 * @return {@link LinkedListNode}
	 */
	public static LinkedListNode<Integer> findSumBackwardOrder(LinkedListNode<Integer> headOfList1, LinkedListNode<Integer> headOfList2, int carry) {
		/* If all three inputs are null, no need to process */
		if (headOfList1 == null && headOfList2 == null && carry == 0) {
			return null;
		}
		/* Value can be carry, keep updating it by taking 
		 * one node from each list if not null*/
		int value = carry;
		if (headOfList1 != null) {
			value += headOfList1.data;
		}
		if (headOfList2 != null) {
			value += headOfList2.data;
		}
		/* Create the new node */
		LinkedListNode<Integer> resultHead = new LinkedListNode<>(value % 10);
		/* If one of the node's still has some value, follow the recursion */
		if (headOfList1 != null || headOfList2 != null) {
			LinkedListNode<Integer> nextNode = findSumBackwardOrder(headOfList1 == null ? null : headOfList1.next, 
					headOfList2 == null ? null : headOfList2.next, value / 10);
			resultHead.next = nextNode;
		}
		/* Return result head */
		return resultHead;
	}

}
