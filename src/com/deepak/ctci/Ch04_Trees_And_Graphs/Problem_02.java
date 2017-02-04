/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement : 
 * 
 * Given a sorted (increasing order) array with unique integer
 * elements. Write an algorithm to create BST with minimal height.
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to create minimal BST when array of integers is given 
	 * 
	 * @param input
	 * @return {@link TreeNode}
	 */
	public static TreeNode<Integer> createMinimalBST(Integer[] input) {
		return createMinimalBST(input, 0, input.length - 1);
	}

	/**
	 * Method to create a minimal BST when array of integers, start index
	 * and end index are given 
	 *  
	 * @param input
	 * @param start
	 * @param end
	 * @return {@link TreeNode}
	 */
	private static TreeNode<Integer> createMinimalBST(Integer[] input, int start, int end) {
		/* No processing needed if any of the below condition is true */
		if (input == null || start < 0 || end > input.length || start > end) {
			return null;
		}
		/* Find mid element and create a node out of it */
		int mid = (start + end) / 2;
		TreeNode<Integer> root = new TreeNode<Integer>(input[mid]);
		/* Create left tree and right tree */
		root.left = createMinimalBST(input, start, mid - 1);
		root.right = createMinimalBST(input, mid + 1, end);
		/* Return root */
		return root;
	}

}
