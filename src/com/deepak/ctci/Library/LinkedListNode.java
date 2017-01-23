/**
 * Cracking-The-Coding-Interview
 * LinkedListNode.java
 */
package com.deepak.ctci.Library;

/**
 * Class for Linked list Node
 * Keeping this as a generic node class
 * 
 * @author Deepak
 */
public class LinkedListNode<T> {

	public LinkedListNode<T> next;
	public LinkedListNode<T> prev;
	public LinkedListNode<T> last;
	public T data;

	public LinkedListNode() {}

	public LinkedListNode(T data) {
		this.data = data;
	}	

	public LinkedListNode(T data, LinkedListNode<T> next, LinkedListNode<T> previous) {
		this.data = data;
		setNext(next);
		setPrevious(previous);
	}

	public void setNext(LinkedListNode<T> nextNode) {
		next = nextNode;
		if (this == last) {
			last = nextNode;
		}
		if (nextNode != null && nextNode.prev != this) {
			nextNode.setPrevious(this);
		}
	}

	public void setPrevious(LinkedListNode<T> prevNode) {
		prev = prevNode;
		if (prevNode != null && prevNode.next != this) {
			prevNode.setNext(this);
		}
	}	

	public String printForward() {
		if (next != null) {
			return data + "->" + next.printForward();
		} else {
			return String.valueOf(data);
		}
	}

	public LinkedListNode<T> clone() {
		LinkedListNode<T> nextNode = null;
		if (next != null) {
			nextNode = next.clone();
		}
		LinkedListNode<T> head = new LinkedListNode<T>(data, nextNode, null);
		return head;
	}

}
