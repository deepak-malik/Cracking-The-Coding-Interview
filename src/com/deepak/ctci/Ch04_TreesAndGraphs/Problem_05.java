/**
 * Cracking-The-Coding-Interview
 * Problem_05.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Implement a function to check if a binary tree is BST
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to check if a binary tree is BST
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static boolean isBST(TreeNode<Integer> root) {
		return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Method to validate a binary search tree
	 * 
	 * @param root
	 * @param min
	 * @param max
	 * @return {@link boolean}
	 */
	private static boolean validateBST(TreeNode<Integer> root, Integer min, Integer max) {
		/* BST can have just one node */
		if (root == null) {
			return true;
		}
		/* If root's value is less then min or greater then equal to max, return false */
		if (root.data < min || root.data >= max) {
			return false;
		}
		/* Validate left and right sub trees recursively */
		return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
	}

}
