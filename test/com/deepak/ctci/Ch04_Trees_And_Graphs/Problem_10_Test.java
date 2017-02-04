/**
 * Cracking-The-Coding-Interview
 * Problem_10_Test.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Ch04_Trees_And_Graphs.Problem_10;
import com.deepak.ctci.Library.TreeNode;

/**
 * Test cases for Problem 10
 * 
 * @author Deepak
 */
public class Problem_10_Test {

	/* Root nodes of Tree T1 and T2 */
	private TreeNode<Integer> rootOfT1;
	private TreeNode<Integer> rootOfT2;

	@Before
	public void setup() {
		/* Define the nodes of tree T1 */
		rootOfT1 = new TreeNode<>(9);
		TreeNode<Integer> node2 = new TreeNode<>(5);
		TreeNode<Integer> node3 = new TreeNode<>(13);
		TreeNode<Integer> node4 = new TreeNode<>(2);
		TreeNode<Integer> node5 = new TreeNode<>(8);
		TreeNode<Integer> node6 = new TreeNode<>(11);
		TreeNode<Integer> node7 = new TreeNode<>(17);

		/* Construct T1 */
		rootOfT1.left = node2;
		rootOfT1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		/* Construct T2 */
		rootOfT2 = node3;
		rootOfT2.left = node6;
		rootOfT2.right = node7;
	}

	/**
	 * Test case to check if T2 is a sub tree of T1
	 */
	@Test
	public void testIsSubTree() {
		Assert.assertTrue(Problem_10.isSubTree(rootOfT1, rootOfT2));
		Assert.assertTrue(Problem_10.isSubTree(rootOfT1, null));
		Assert.assertFalse(Problem_10.isSubTree(null, rootOfT2));
		Assert.assertTrue(Problem_10.isSubTree(null, null));
		TreeNode<Integer> newRoot = new TreeNode<>(18);
		Assert.assertFalse(Problem_10.isSubTree(rootOfT1, newRoot));
	}

}
