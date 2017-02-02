/**
 * Cracking-The-Coding-Interview
 * Problem_04.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Implement a function to check if a binary tree is balanced.
 * For the purpose of this question, a balanced tree is defined
 * to be a tree such that height of left sub tree and right 
 * sub tree of any given node never differs by one.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to check if Binary Tree is balanced when root is given
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static <T> boolean isBalanced(TreeNode<T> root) {
		/* If root is null, not balanced */
		if (root == null) {
			return false;
		}
		/* Find height of both left and right subtree */
		int heightOfLeftTree = findHeight(root.left);
		int heightOfRightSubTree = findHeight(root.right);
		/* If difference is either 0 or 1, we are good */
		return Math.abs(heightOfLeftTree - heightOfRightSubTree) < 2;
	}

	/**
	 * Method to find the height of tree when a node is given 
	 * 
	 * @param node
	 * @return {@link int}
	 */
	private static <T> int findHeight(TreeNode<T> node) {
		/* If node is null, height is 0 */
		if (node == null) {
			return 0;
		}
		/* Find height of left tree and right tree recursively */
		int left = findHeight(node.left);
		int right = findHeight(node.right);
		/* Which ever is greater add 1 to it */
		return left > right ? left + 1 : right + 1;
	}

}
