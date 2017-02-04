/**
 * Cracking-The-Coding-Interview
 * Problem_05_Test.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Ch04_Trees_And_Graphs.Problem_05;
import com.deepak.ctci.Library.TreeNode;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/* Root node of the tree */
	TreeNode<Integer> root;

	/* Setup Tree */
	@Before
	public void setup() {
		root = new TreeNode<>(13);
		TreeNode<Integer> node2 = new TreeNode<>(5);
		TreeNode<Integer> node3 = new TreeNode<>(19);
		TreeNode<Integer> node4 = new TreeNode<>(3);
		TreeNode<Integer> node5 = new TreeNode<>(7);
		TreeNode<Integer> node6 = new TreeNode<>(17);
		TreeNode<Integer> node7 = new TreeNode<>(23);
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
	}

	/**
	 * Test case to check if tree is BST when it is valid 
	 */
	@Test
	public void testIsBSTWhenTreeIsValid() {
		Assert.assertTrue(Problem_05.isBST(root));
	}

	/**
	 * Test case to check if tree is BST when it is invalid
	 */
	@Test
	public void testIsBSTWhenTreeIsInvalid() {
		root.right.right = new TreeNode<>(5);
		Assert.assertFalse(Problem_05.isBST(root));
	}

}
