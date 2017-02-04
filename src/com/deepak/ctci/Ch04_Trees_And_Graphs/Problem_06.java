/**
 * Cracking-The-Coding-Interview
 * Problem_06.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Write an algorithm to find the next node i.e
 * (in-order successor) of a given node in a BST.
 * You may assume that each node has a link to 
 * it's parent.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to find the successor of the given node
	 * 
	 * @param node
	 * @return {@link TreeNode}
	 */
	public static <T> TreeNode<T> findSuccessor(TreeNode<T> node) {
		/* If node is null, no successor */
		if (node == null) {
			return null;
		}
		/* If right node is not null, successor 
		 * will be minimum value in right node. */
		if (node.right != null) {
			return findMinimum(node.right);
		} 
		/* Create the current node as temp node
		 * and get it's parent */
		TreeNode<T> temp = node;
		TreeNode<T> parent = temp.parent;
		/* Keep traversing up until we reach the root of that tree */
		while (parent != null && temp == parent.right) {
			temp = parent;
			parent = parent.parent;
		}
		/* Return parent */
		return parent;
	}

	/**
	 * Method to find minimum node when root is given 
	 * 
	 * @param root
	 * @return {@link TreeNode}
	 */
	private static <T> TreeNode<T> findMinimum(TreeNode<T> root) {
		/* Copy root to temp node and 
		 * keep going left till last element */
		TreeNode<T> temp = root;
		while (temp.left != null) {
			temp = temp.left;
		}
		/* Return the last element in left tree */
		return temp;
	}

}
