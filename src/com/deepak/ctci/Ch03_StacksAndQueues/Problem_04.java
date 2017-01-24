/**
 * Cracking-The-Coding-Interview
 * Problem_04.java
 */
package com.deepak.ctci.Ch03_StacksAndQueues;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * <br> Problem Statement :
 * 
 * Implement a MyQueue class which implements a queue using two stacks.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * MyQueue class implemented using two stacks
	 * 
	 * @author Deepak
	 *
	 * @param <T>
	 */
	public static class MyQueue<T> {

		/* Initializing two stacks */
		private Stack<T> stack1 = null;
		private Stack<T> stack2 = null;

		/**
		 * Default Constructor
		 */
		public MyQueue() {
			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}

		/**
		 * Method to peek and element from queue
		 * 
		 * @return {@link T}
		 */
		public T peek() {
			/* If both the stacks are empty, queue underflows */
			if (isEmpty()) {
				throw new NoSuchElementException("Queue Underflow!!");
			}
			/* Peek happens from stack 2, if it is empty,
			 * move all elements from stack 1 to stack 2*/
			if (stack2.isEmpty()) {
				moveStack1ToStack2();
			}
			/* Peek from stack 2*/
			return stack2.peek();
		}

		/**
		 * Method to enqueue items in queue
		 * 
		 * @param item
		 */
		public void enqueue(T item) {
			/* Enqueue happens on stack 1 */
			stack1.push(item);
		}

		/**
		 * Method to dequeue from the queue
		 * 
		 * @return
		 */
		public T dequeue() {
			/* If both the stacks are empty, queue underflows */
			if (isEmpty()) {
				throw new NoSuchElementException("Queue Underflow!!");
			}
			/* If stack 2 is empty, move all items from stack 1 to stack 2.
			 * Dequeue happens from stack 2 */
			if (stack2.isEmpty()) {
				moveStack1ToStack2();
			}
			/* Pop element from stack 2 */
			return stack2.pop();
		}

		/**
		 * Method to display items in the queue
		 */
		public void display() {
			if (!stack1.isEmpty()) {
				System.out.println(Arrays.toString(stack1.toArray()));
			}
			if (!stack2.isEmpty()) {
				System.out.println(Arrays.toString(stack2.toArray()));
			}
		}

		/**
		 * Method to return size of the queue
		 * 
		 * @return {@link int}
		 */
		public int size() {
			return stack1.size() + stack2.size();
		}

		/**
		 * Method to check if queue is empty
		 * 
		 * @return {@link boolean}
		 */
		public boolean isEmpty() {
			return stack1.isEmpty() && stack2.isEmpty();
		}

		/**
		 * Method to move all items from stack 1 to stack 2
		 */
		private void moveStack1ToStack2() {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

	}

}
