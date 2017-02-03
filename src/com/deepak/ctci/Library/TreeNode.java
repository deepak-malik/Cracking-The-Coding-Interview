/**
 * Cracking-The-Coding-Interview
 * TreeNode.java
 */
package com.deepak.ctci.Library;

/**
 * Class for Tree Node. Keeping this generic
 * 
 * @author Deepak
 *
 * @param <T>
 */
public class TreeNode<T> {

	public T data;
	public TreeNode<T> left;
	public TreeNode<T> right;
	public TreeNode<T> parent;

	public TreeNode(T data) {
		this.data = data;
	}

}
