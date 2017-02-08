/**
 * Cracking-The-Coding-Interview
 * Problem_05.java
 */
package com.deepak.ctci.Ch06_Math_And_Logic_Puzzles;

/**
 * <br> Problem Statement :
 * 
 * You have a five-quart jug, a three-quart jug and 
 * and unlimited supply of water(but no measuring cups).
 * How would you come up with exactly four-quarts of 
 * water? Note that the jugs are oddly shaped, such that
 * filling up exactly "half" of the jug would be impossible.
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/* Solution Approach : 
	 * 1. Fill 5 quart jug -> Pour water in 3 quart jug until it is full.
	 * 2. Now, 5 quart jug has 2 quarts of water left, because 3 quarts is taken out.
	 * 3. Now, throw away all the water from 3 quarts jug and fill it with 2 quarts left in a 5 quarts jug
	 * 4. Now, 5 quart is empty and 3 quarts jug has exactly 2 quarts of water
	 * 5. Fill 5 quarts again, once full, start pouring water to 3 quarts of jug (Which has just 1 quart space left)
	 * 6. Once 3 quart jug becomes full, we will have exactly 4 quarts left in bigger jug.*/

	/**
	 * Method to fill jug with water
	 * 
	 * @param jug
	 * @param numberOfQuarts
	 */
	public static void fillWithWater(Jug jug, int numberOfQuarts) {
		for (int i = 1; i <= numberOfQuarts; i++) {
			jug.increaseCapacity();
		}
	}

	/**
	 * Method to make a jug empty
	 * 
	 * @param jug
	 */
	public static void makeEmpty(Jug jug) {
		jug.currentCapacity = 0;
	}

	/**
	 * Method to transfer water from jug 1 to jug 2
	 * 
	 * @param jug1
	 * @param jug2
	 * @param numberOfQuarts
	 */
	public static void transferFromJug1ToJug2(Jug jug1, Jug jug2, int numberOfQuarts) {
		/* Decrease the capacity from jug 1 and increase for jug 2 */
		for (int i = 1; i <= numberOfQuarts; i++) {
			jug1.decreaseCapacity();
			jug2.increaseCapacity();
		}
	}

	/**
	 * Static class for Jug
	 * 
	 * @author Deepak
	 */
	public static class Jug {

		/* Variables to keep track of max capacity
		 * and current capacity */
		private int maxCapacity;
		private int currentCapacity;

		/**
		 * Constructor 
		 * 
		 * @param maxCapacity
		 */
		public Jug(int maxCapacity) {
			this.maxCapacity = maxCapacity;
			this.currentCapacity = 0;
		}

		/**
		 * Method to increase capacity by 1
		 */
		public void increaseCapacity() {
			if (currentCapacity <= maxCapacity) {
				currentCapacity++;
			} else {
				throw new StackOverflowError("Jug overflowing!!");
			}
		}

		/**
		 * Method to decrease capacity by 1
		 */
		public void decreaseCapacity() {
			if (currentCapacity > 0) {
				currentCapacity--;
			} else {
				throw new StackOverflowError("Jug underflowing!!");
			}
		}

		/**
		 * Method to get current capacity of jug
		 * 
		 * @return {@link int}
		 */
		public int getCurrentCapacity() {
			return currentCapacity;
		}

	}

}
