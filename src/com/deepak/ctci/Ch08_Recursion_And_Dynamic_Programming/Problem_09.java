/**
 * Cracking-The-Coding-Interview
 * Problem_09.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.HashSet;
import java.util.Set;

/**
 * <br> Problem Statement :
 * 
 * Implement an algorithm to print all valid (i.e properly
 * opened and closed) combinations of n pairs of parentheses.
 * Example :
 * Input : 3
 * Output : "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to generate parenthesis for a given number n
	 * 
	 * @param n
	 * @return {@link Set<String>}
	 */
	public static Set<String> generateParens(int n) {
		Set<String> result = new HashSet<>();
		generateParens(result, "", n, n);
		return result;
	}

	/**
	 * Method to generate parenthesis for a number n
	 * 
	 * @param result
	 * @param prefix
	 * @param left
	 * @param right
	 */
	private static void generateParens(Set<String> result, String prefix, int left, int right) {
		/* Here left and right are number of "(" and ")" remaining
		 * respectively. If left is greater, then we should stop */
		if (left > right) {
			return;
		}
		/* When there is no left and right, just return the prefix */
		if (left == 0 && right == 0) {
			result.add(prefix);
			return;
		}
		/* If left has more then 0 parenthesis, add that */
		if (left > 0) {
			generateParens(result, prefix + "(", left - 1, right);
		}
		/* If right has more then 0 parenthesis, add that */
		if (right > 0) {
			generateParens(result, prefix + ")", left, right - 1);
		}
	}

}
