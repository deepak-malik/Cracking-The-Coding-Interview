/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

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
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int countWays(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		/* Total number of possibilities, He can either hop 1 step
		 * + hop 2 steps + hop 3 steps */
		return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
	}

}
