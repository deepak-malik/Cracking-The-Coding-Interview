/**
 * Cracking-The-Coding-Interview
 * Problem_11.java
 */
package com.deepak.ctci.Ch04_Trees_And_Graphs;


/**
 * <br> Problem Statement :
 * 
 * You are implementing a binary tree class from scratch,
 * which in addition to insert, find and delete, has a method
 * getRandomNode() which returns a random node from the tree.
 * All nodes should be equally likely to be chosen. Design and
 * implement an algorithm for getRandomNode(), and explain how
 * would you implement the rest of the method.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_11 {

	public static class BinaryTree<E extends Comparable<E>> {

		private Node<E> root;

		public void insert(E value) {
			if (root == null) {
				root = new Node<E>(value);
			} else {
				addNode(root, value);
			}
		}

		private void addNode(Node<E> root, E value) {
			if (root.data.compareTo(value) <= 0) {
				if (root.left != null) {
					addNode(root.left, value);
				} else {
					root.left = new Node<E>(value);
				}
			} else {
				if (root.right != null) {
					addNode(root.right, value);
				} else {
					root.right = new Node<E>(value);
				}
			}
		}

		public Node<E> find(E value) {
			Node<E> temp = root;
			while (temp != null && temp.data != value) {
				if (value.compareTo(temp.data) <= 0) {
					temp = temp.left;
				} else {
					temp = temp.right;
				}
			}
			return temp;
		}

		public void delete(E value) {

		}

		public Node<E> getRandomNode() {
			int size = findSize(root);
			System.out.println(size);
			return null;
		}

		private int findSize(Node<E> root) {
			if (root == null) {
				return 0;
			}
			return findSize(root.left) + 1 + findSize(root.right);
		}

	}

	public static class Node<T> {

		private T data;
		private Node<T> left;
		private Node<T> right;

		private Node(T data) {
			this.data = data;
		}

	}

}
