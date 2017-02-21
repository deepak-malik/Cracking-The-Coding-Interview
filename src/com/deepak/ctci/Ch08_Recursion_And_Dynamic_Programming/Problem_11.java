/**
 * Cracking-The-Coding-Interview
 * Problem_11.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

/**
 * <br> Problem Statement :
 * 
 * Given an infinite number of quarters (25 cents), 
 * dimes (10 cents), nickels (5 cents) and pennies 
 * (1 cent), write code to calculate number of ways
 * to represent n cents.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_11 {

	/**
	 * Method to find number of coins needed to make up a given amount
	 * TODO : Explanation pending
	 * 
	 * @param denominations
	 * @param amount
	 * @return {@link int}
	 */
	public static int findNumberOfCoins(int[] denominations, int amount) {
		int[] solution = new int[amount + 1];
		solution[0] = 1;
		for (int den : denominations) {
			for (int i = den; i < (amount + 1); i++) {
				solution[i] += solution[i - den];
			}
		}
		return solution[solution.length - 1];
	}

}
