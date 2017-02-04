/**
 * Cracking-The-Coding-Interview
 * Problem_05.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import java.util.Stack;

/**
 * <br> Problem Statement :
 * 
 * Write a program to sort a stack such that the smallest items
 * are on top of stack. You can use an additional temporary stack,
 * but you may not copy the elements into any other data structure
 * (such as array). The stack supports the following operations:
 * push, pop, peek and isEmpty.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to sort stack
	 * 
	 * @param input
	 * @return {@link Stack}
	 */
	public static Stack<Integer> sortStack(Stack<Integer> input) {
		/* If input is null, no processing needed */
		if (input == null) {
			return null;
		}
		/*Create a temp stack */
		Stack<Integer> tempStack = new Stack<>();
		/* Keep going until input is not empty */
		while (!input.isEmpty()) {
			/* Pop value from input */
			int tempValue = input.pop();
			/* We want smallest one at the bottom. So keep comparing and 
			 * if temp stack has bigger item, pop it and push it to input stack */
			while (!tempStack.isEmpty() && tempStack.peek() > tempValue) {
				input.push(tempStack.pop());
			}
			/* Push temp value to the temp stack */
			tempStack.push(tempValue);
		}
		return tempStack;
	}

}
