/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Ch04_Trees_And_Graphs.Problem_03;
import com.deepak.ctci.Library.TreeNode;

/**
 * Test cases for Problem 03 
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/* Root of the tree */
	private TreeNode<Integer> root;

	/**
	 * Setup to create a base tree
	 * 
	 * 			13
	 * 	  	  /    \
	 * 		 7		19
	 *	    / \    /  \
	 * 	   3   9  17  23
	 */
	@Before
	public void setup() {
		root = new TreeNode<Integer>(13);
		TreeNode<Integer> node2 = new TreeNode<Integer>(7);
		TreeNode<Integer> node3 = new TreeNode<Integer>(19);
		TreeNode<Integer> node4 = new TreeNode<Integer>(3);
		TreeNode<Integer> node5 = new TreeNode<Integer>(9);
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
	 * Test case to check creation of linked list at each level 
	 */
	@Test
	public void testCreationOfLinkedListAtEachDepth() {
		List<LinkedList<TreeNode<Integer>>> linkedLists = Problem_03.createLinkedListAtEachDepth(root);
		Problem_03.printResult(linkedLists);
	}

}
