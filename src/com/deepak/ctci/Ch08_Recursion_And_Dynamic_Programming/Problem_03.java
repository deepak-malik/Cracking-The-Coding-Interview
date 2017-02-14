/**
 * Cracking-The-Coding-Interview
 * Problem_03.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

/**
 * <br> Problem Statement :
 * 
 * A magic index in an array A[0... n-1] is defined to be an index
 * such that A[i] = i. Given a sorted array of distinct integers,
 * write a method to find a magic index, if one exits in Array A?
 * 
 * FOLLOW UP : What if the values are not distinct?
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to check for magic index
	 * This is a brute force method
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int magicIndex_BruteForce(int[] array) {
		if (array != null) {
			/* Perform Linear Search */
			for (int i = 0; i < array.length; i++) {
				if (array[i] == i) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * Method to check for magic index 
	 * This is a optimized approach
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @return {@link int}
	 */
	public static int magicIndex_Optimized(int[] array, int start, int end) {
		/* Basic Validations */
		if (array == null || end < start) {
			return -1;
		}
		/* Since this is a sorted collection, apply binary search.
		 * Find mid index and mid value */
		int midIndex = (start + end) / 2;
		int midValue = array[midIndex];
		/* If matches, return the value, else
		 * either check right or left based on the condition */
		if (midIndex == midValue) {
			return midIndex;
		} else if (midValue < midIndex) {
			return magicIndex_Optimized(array, midIndex + 1, end);
		} else {
			return magicIndex_Optimized(array, start, midIndex - 1);
		}
	}

}
