/**
 * Cracking-The-Coding-Interview
 * Problem_03.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

/**
 * <br> Problem Statement :
 * 
 * Imagine a stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would literally start a new stack when the
 * previous stack exceeds some threshold. Implement a data structure,
 * SetOfStacks which mimics this. SetOfStacks should be composed of several 
 * stacks and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a 
 * single stack (that is, pop() should return the same values as it would if
 * there were just a single stack.)
 * 
 * FOLLOW UP : Implement a function popAt(int index) which performs a pop
 * function on a specific sub-stack.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Class for set of stacks
	 *  
	 * @author Deepak
	 *
	 * @param <T>
	 */
	public static class SetOfStacks<T> {

		/* List of stacks and threshold of each */
		private List<Stack<T>> listOfStack;
		private int thresholdOfEachStack = 5;

		/**
		 * Default Constructor
		 */
		public SetOfStacks() {
			listOfStack = new ArrayList<>();
		}

		/**
		 * Method to push the item to the stack
		 * 
		 * @param item
		 */
		public void push(T item) {
			/* If size is zero, our set is empty,
			 * create a new stack and add it to set */
			if (listOfStack.size() == 0) {
				createNewStackAndPush(item);
			} else {
				/* Get the last stack, if reached threshold,
				 * create a new stack and add to set, else
				 * push item to the last stack */
				Stack<T> lastStack = getLastStack();
				if (lastStack != null) {
					if (lastStack.size() >= thresholdOfEachStack) {
						createNewStackAndPush(item);
					} else {
						lastStack.push(item);
					}
				}
			}
		}

		/**
		 * Method to pop the item from the stack
		 * 
		 * @return {@link T}
		 */
		public T pop() {
			/* Get the last stack, if null throw exception */
			Stack<T> lastStack = getLastStack();
			if (lastStack == null) {
				throw new EmptyStackException();
			}
			/* Find the item to be popped. After popping
			 * if stack is empty, remove from the set */
			T itemToPop = lastStack.pop();
			if (lastStack.size() == 0) {
				listOfStack.remove(listOfStack.size() - 1);
			}
			/* Return the item to be popped */
			return itemToPop;
		}

		/**
		 * Method to pop the item when stack index is given 
		 * 
		 * @param stackNumber
		 * @return {@link T}
		 */
		public T popAtIndex(int stackNumber) {
			/* if stack doesn't belong to set, return null */
			if (stackNumber >= listOfStack.size()) {
				return null;
			}
			/* Find the stack at given index and pop from it */
			return listOfStack.get(stackNumber).pop();
		}

		/**
		 * Method to find the size of the stack set
		 * 
		 * @return {@link int}
		 */
		public int size() {
			/* If set is empty, size is zero,
			 * else calculate size */
			if (listOfStack.isEmpty()) {
				return 0;
			}
			int totalSize = 0;
			for (Stack<T> stack : listOfStack) {
				totalSize += stack.size();
			}
			return totalSize;
		}

		/**
		 * Method to create a new stack and push item 
		 * 
		 * @param item
		 */
		private void createNewStackAndPush(T item) {
			Stack<T> stack = new Stack<>();
			stack.push(item);
			listOfStack.add(stack);
		}

		/**
		 * Method to get last stack from the set
		 * 
		 * @return {@link Stack}
		 */
		private Stack<T> getLastStack() {
			/* If set is not empty, return the last stack */
			if (!listOfStack.isEmpty()) {
				return listOfStack.get(listOfStack.size() - 1);
			}
			return null;
		}

	}

}
