/**
 * Cracking-The-Coding-Interview
 * Problem_08.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Design an algorithm and write code to find the fist common
 * ancestor of two nodes in a binary tree. Avoid storing additional
 * nodes in a data structure.
 * Note : This is not necessarily a BST
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to find the common ancestor of two nodes 
	 * 
	 * @param root
	 * @param node1
	 * @param node2
	 * @return {@link TreeNode}
	 */
	public static <T> TreeNode<T> findCommonAncestor(TreeNode<T> root, TreeNode<T> node1, TreeNode<T> node2) {
		/* If root is null or any of the given node is null, return null */
		if (root == null || node1 == null || node2 == null) {
			return null;
		}
		/* Find parent of each node and keep going up until parent matches */
		TreeNode<T> parentOfNode1 = findParent(node1.data, root, null);
		TreeNode<T> parentOfNode2 = findParent(node2.data, root, null);
		while (parentOfNode1 != parentOfNode2) {
			parentOfNode1 = findParent(parentOfNode1.data, root, null);
			parentOfNode2 = findParent(parentOfNode2.data, root, null);
		}
		/* Return parent of any node */
		return parentOfNode1;
	}

	/**
	 * Method to find the parent 
	 * 
	 * @param data
	 * @param root
	 * @param parent
	 * @return {@link TreeNode}
	 */
	private static <T> TreeNode<T> findParent(T data, TreeNode<T> root, TreeNode<T> parent) {
		/* If root is null, no parent exists */
		if (root == null) {
			return null;
		}
		/* If root doesn't match the data, check for parent in left tree */
		if (!root.data.equals(data)) {
			parent = findParent(data, root.left, root);
			/* If parent doesn't exists in left sub tree, check in right sub tree */
			if (parent == null) {
				parent = findParent(data, root.right, root);
			}
		}
		return parent;
	}

}
