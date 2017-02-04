/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * <br> Problem Statement :
 * 
 * How would you design a stack which, in addition to push and pop, 
 * has a function min() which returns a minimum element? Push, pop 
 * and min, all should operate in O(1) time
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Custom stack implemented 
	 * 
	 * @author Deepak
	 */
	public static class CustomStack {

		/* Array to keep track of main stack */
		private Integer[] array;
		/* Size of main stack */
		private int size = 0;
		/* Creating a new stack for min value since we want O(1) solution 
		 * and looping through array to find min is not O(1) */
		private Stack<Integer> stackForMinValue = new Stack<>();

		/**
		 * Constructor
		 * 
		 * @param capacity
		 */
		public CustomStack(int capacity) {
			array = new Integer[capacity];
		}

		/**
		 * Method to push an item in the stack 
		 * 
		 * @param item
		 */
		public void push(Integer item) {
			/* If length of array has reached size, array is full */
			if (size == array.length) {
				throw new IllegalStateException("Cannot insert on full stack");
			}
			/* Push item to stack for min value */
			pushToStackForMinValue(item);
			/* insert in array at last */
			array[size++] = item;
		}

		/**
		 * Method to push minimum value to stack
		 *  
		 * @param item
		 */
		private void pushToStackForMinValue(Integer item) {
			/* Check if stack is empty (We will hold just one min value here).
			 * If it is empty, simply push the item, else compare with the existing
			 * one, if it is smaller, pop the one available in stack and push this new
			 * smaller one. */
			if (!stackForMinValue.isEmpty()) {
				if (item < stackForMinValue.peek()) {
					stackForMinValue.pop();
					stackForMinValue.push(item);
				}
			} else {
				stackForMinValue.push(item);
			}
		}

		/**
		 * Method to pop the element from the stack 
		 * 
		 * @return {@link Integer}
		 */
		public Integer pop() {
			/* If size is zero, cannot pop */
			if (size == 0) {
				throw new NoSuchElementException("Cannot pop from empty stack");
			}
			/* Find the element to be returned and adjust array */
			Integer result = array[size - 1];
			array[size - 1] = null;
			size--;
			return result;
		}

		/**
		 * Method to get size of the stack 
		 * 
		 * @return {@link}
		 */
		public int size() {
			return size;
		}

		/**
		 * Method to find minimum value 
		 * 
		 * @return {@link Integer}
		 */
		public Integer min() {
			return stackForMinValue.peek();
		}

	}

}
