/**
 * Cracking-The-Coding-Interview
 * Problem_03.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.deepak.ctci.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree, design an algorithm which 
 * creates a linked list of all the nodes at each depth.
 * Ex. If you have a tree with depth D, you will have
 * D linked lists.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to create a linked list at each depth 
	 * 
	 * @param root
	 * @return {@link List<LinkedList<TreeNode<T>>>}
	 */
	public static <T> List<LinkedList<TreeNode<T>>> createLinkedListAtEachDepth(TreeNode<T> root) {
		/* If root is null, no list can be created */
		if (root == null) {
			return null;
		}
		/* Create a list to hold results */
		List<LinkedList<TreeNode<T>>> result = new ArrayList<>();
		/* Visit the root */
		LinkedList<TreeNode<T>> current = new LinkedList<>();
		current.add(root);
		/* Keep going until elements are there */
		while (current.size() > 0) {
			/* Add current level and move to next level */
			result.add(current);
			LinkedList<TreeNode<T>> parents = current;
			current = new LinkedList<>();
			/* Add children for each parent node */
			for (TreeNode<T> parent : parents) {
				if (parent.left != null) {
					current.add(parent.left);
				}
				if (parent.right != null) {
					current.add(parent.right);
				}
			}
		}
		return result;
	}

	/**
	 * Method to print result 
	 * 
	 * @param result
	 */
	public static <T> void printResult(List<LinkedList<TreeNode<T>>> result) {
		int depth = 0;
		/* Loop through each entry is the list and get iterator */
		for (LinkedList<TreeNode<T>> entry : result) {
			Iterator<TreeNode<T>> iterator = entry.iterator();
			System.out.println("Linked List at depth " + depth + " : ");
			/* Keep printing until we have elements in the iterator */
			while (iterator.hasNext()) {
				/* Get the node and print its data */
				TreeNode<T> treeNode = (TreeNode<T>) iterator.next();
				System.out.println(treeNode.data);
			}
			System.out.println();
			depth++;
		}
	}

}
