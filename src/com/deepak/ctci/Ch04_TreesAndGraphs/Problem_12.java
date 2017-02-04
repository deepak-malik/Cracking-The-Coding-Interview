/**
 * Cracking-The-Coding-Interview
 * Problem_12.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * You are given a binary tree in which each node contains
 * an integer value (which might be positive or negative).
 * Design an algorithm to count the number of paths that 
 * sum to a given value. The path does not need to start 
 * at root or end at leaf, but it must go downwards (traveling
 * only from parent node to child nodes) 
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_12 {

	/**
	 * Method to find the count of paths with sum
	 *  
	 * @param root
	 * @param sum
	 * @return {@link int}
	 */
	public static int countPathsWithSum(TreeNode<Integer> root, int sum) {
		/* If root is null, zero paths available */
		if (root == null) {
			return 0;
		}
		/* Count paths with sum starting from root */
		int pathsFromRoot = countPathsWithSumFromNode(root, sum, 0);
		/* Find paths from left sub tree and right sub tree */
		int pathsOnLeft = countPathsWithSum(root.left, sum);
		int pathsOnRight = countPathsWithSum(root.right, sum);
		/* Return total sum */
		return pathsFromRoot + pathsOnLeft + pathsOnRight;
	}

	/**
	 * Methods to count paths with sum from a given node
	 * 
	 * @param node
	 * @param sum
	 * @param currentSum
	 * @return {@link int}
	 */
	private static int countPathsWithSumFromNode(TreeNode<Integer> node, int sum, int currentSum) {
		/* If node is null, no path exists */
		if (node == null) {
			return 0;
		}
		/* Update the current sum */
		currentSum += node.data;
		int totalPaths = 0;
		/* If current sum and target sum matches, we found a path */
		if (currentSum == sum) {
			totalPaths++;
		}
		/* Find paths for left subtree and right subtree */
		totalPaths += countPathsWithSumFromNode(node.left, sum, currentSum);
		totalPaths += countPathsWithSumFromNode(node.right, sum, currentSum);
		return totalPaths;
	}

}
