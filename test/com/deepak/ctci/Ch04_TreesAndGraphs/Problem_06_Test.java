/**
 * Cracking-The-Coding-Interview
 * Problem_06_Test.java
 */
package com.deepak.ctci.Ch04_TreesAndGraphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Library.TreeNode;

/**
 * Test case for Problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/* Define the root node */
	private TreeNode<Integer> root;

	/**
	 * Setting up the tree
	 *        20
	 *       /  \
	 *      10   30
	 *     /  \ 
	 *    5    15 
	 *   / \     \
	 *  3   7     17
	 */
	@Before
	public void setup() {
		root = new TreeNode<Integer>(20);
		TreeNode<Integer> node1 = new TreeNode<Integer>(10);
		TreeNode<Integer> node2 = new TreeNode<Integer>(30);
		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
		TreeNode<Integer> node4 = new TreeNode<Integer>(15);
		TreeNode<Integer> node5 = new TreeNode<Integer>(3);
		TreeNode<Integer> node6 = new TreeNode<Integer>(7);
		TreeNode<Integer> node7 = new TreeNode<Integer>(17);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node3.left = node5;
		node3.right = node6;
		node4.right = node7;
		node7.parent = node4;
		node6.parent = node3;
		node5.parent = node3;
		node4.parent = node1;
		node3.parent = node1;
		node1.parent = root;
		node2.parent = root;
	}

	/**
	 * Test case to check in order successor 
	 */
	@Test
	public void testInOrderSuccessor() {
		Assert.assertNull(Problem_06.findSuccessor(root.right));
		Assert.assertNull(Problem_06.findSuccessor(null));
		Assert.assertTrue(Problem_06.findSuccessor(root).data == 30);
		Assert.assertTrue(Problem_06.findSuccessor(root.left.left.right).data == 10);
		Assert.assertTrue(Problem_06.findSuccessor(root.left.right).data == 17);
	}

}
