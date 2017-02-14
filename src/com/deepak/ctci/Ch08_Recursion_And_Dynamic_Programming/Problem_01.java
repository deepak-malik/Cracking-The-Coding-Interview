/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * A child is running up the staircase with n steps
 * and can hop either 1 step, 2 steps or either 3 steps
 * at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to count number of ways to climb stairs
	 * Note : This is a brute force method
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int countWaysBruteForce(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else {
			/* Total number of possibilities, He can either hop 1 step
			 * + hop 2 steps + hop 3 steps */
			return countWaysBruteForce(n - 1) + countWaysBruteForce(n - 2) + countWaysBruteForce(n - 3);
		}
	}

	/**
	 * Method to count the number of ways in a optimized way
	 * Note : This solution includes "memoization" since we want to remove
	 * the unnecessary call to countWaysBruteForce method i.e, if we have 
	 * seen that value of n before, return the cached value
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int countWaysOptimized(int n) {
		/* Create a new array of size n + 1 and fill it with -1 */
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return countWays(n, memo);
	}

	/**
	 * Method to count ways using memoization 
	 * 
	 * @param n
	 * @param memo
	 * @return {@link int}
	 */
	private static int countWays(int n, int[] memo) {
		/* Base cases */
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (memo[n] > -1) {
			/* Check if we have value available in cache i.e memo[n] > -1 
			 * If yes, return the value from cache */
			return memo[n];
		} else {
			/* Count all the values for our use cases */
			memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
			return memo[n];
		}
	}

}
