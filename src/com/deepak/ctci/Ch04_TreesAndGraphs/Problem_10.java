/**
 * Cracking-The-Coding-Interview
 * Problem_10.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * T1 and T2 are two very large binary trees, with T1
 * much bigger then T2. Create an algorithm to determine
 * if T2 is a subtree of T1. 
 * A tree T2 is a subtree of T1 if there exists a node n
 * in T1 such that the subtree of n is identical to T2.
 * That is, if you cut off the tree at node n, the two
 * trees would be identical.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_10 {

	/**
	 * Method to check if T2 is a subtree of T1
	 * 
	 * @param rootOfT1
	 * @param rootOfT2
	 * @return {@link boolean}
	 */
	public static <T> boolean isSubTree(TreeNode<T> rootOfT1, TreeNode<T> rootOfT2) {
		/* Empty tree is always a subtree */
		if (rootOfT2 == null) {
			return true;
		}
		/* Check if T1 contains T2 */
		return containsTree(rootOfT1, rootOfT2);
	}

	/**
	 * Method to check if Tree T1 contains Tree T2
	 * when head node of both trees are given 
	 * 
	 * @param node1
	 * @param node2
	 * @return {@link boolean}
	 */
	private static <T> boolean containsTree(TreeNode<T> node1, TreeNode<T> node2) {
		/* If parent tree is null, return false */
		if (node1 == null) {
			return false;
		} else if (node1.data == node2.data && areTreesSame(node1, node2)) {
			/* If data matches and tree's are same, return true */
			return true;
		}
		/* Keep moving down and check if left subtree or right subtree contains the given T2 */
		return containsTree(node1.left, node2) || containsTree(node1.right, node2);
	}

	/**
	 * Method to check if two trees are same given the root nodes
	 * 
	 * @param root1
	 * @param root2
	 * @return {@link boolean}
	 */
	private static <T> boolean areTreesSame(TreeNode<T> root1, TreeNode<T> root2) {
		/* If both are null, they are sub tree */
		if (root1 == null && root2 == null) {
			return true;
		} else if (root1 == null || root2 == null) {
			/* If one is null, they are not */
			return false;
		} else if (root1.data != root2.data) {
			/* If root doesn't match, they are not same */
			return false;
		}
		/* Keep checking for similarity level by level */
		return areTreesSame(root1.left, root2.left) && areTreesSame(root1.right, root2.right);
	}

}
