/**
 * Cracking-The-Coding-Interview
 * Problem_04_Test.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Library.TreeNode;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	private TreeNode<Integer> root;

	/**
	 * Setup to create a base tree
	 */
	@Before
	public void setup() {
		root = new TreeNode<Integer>(13);
		TreeNode<Integer> node2 = new TreeNode<Integer>(7);
		TreeNode<Integer> node3 = new TreeNode<Integer>(19);
		TreeNode<Integer> node4 = new TreeNode<Integer>(3);
		TreeNode<Integer> node5 = new TreeNode<Integer>(5);
		TreeNode<Integer> node6 = new TreeNode<Integer>(17);
		TreeNode<Integer> node7 = new TreeNode<Integer>(23);

		/* Setup Tree */
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
	}

	/**
	 * Method to test if binary tree is balanced
	 * Here difference between left subtree and right
	 * subtree is zero
	 */
	@Test
	public void testIsBalancedWhenDifferenceIsZero() {
		Assert.assertTrue(Problem_04.isBalanced(root));
	}

	/**
	 * Method to test if binary tree is balanced
	 * Here difference between left subtree and right
	 * subtree is one
	 */
	@Test
	public void testIsBalancedWhenDifferenceIsOne() {
		TreeNode<Integer> extraNode = new TreeNode<Integer>(2);
		root.left.left.left = extraNode;
		Assert.assertTrue(Problem_04.isBalanced(root));
	}

	/**
	 * Method to test if binary tree is balanced
	 * Here difference between left subtree and right
	 * subtree is more then one
	 */
	@Test
	public void testIsBalancedWhenDifferenceIsMoreThenOne() {
		TreeNode<Integer> extraNode1 = new TreeNode<Integer>(2);
		TreeNode<Integer> extraNode2 = new TreeNode<Integer>(21);
		extraNode1.left = extraNode2;
		root.left.left.left = extraNode1;
		Assert.assertFalse(Problem_04.isBalanced(root));
	}

}
