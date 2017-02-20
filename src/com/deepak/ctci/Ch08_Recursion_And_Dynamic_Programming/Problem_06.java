/**
 * Cracking-The-Coding-Interview
 * Problem_06.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

/**
 * <br> Problem Statement :
 * 
 * In the classic problem of the Towers of Hanoi, 
 * you have 3 towers and disks of different sizes
 * which can slide onto any tower. The puzzle starts
 * with disks sorted in ascending order of size from 
 * top to bottom (i.e each disk sits on top of an even
 * larger one). You have the following constraints,
 * 	1. Only one disk can be moved at a time.
 * 	2. A disk is slid off the top of one tower onto another tower.
 * 	3. A disk cannot be placed on top of a smaller disk.
 * 
 * Write a program to move the disks from 1st tower to 3rd tower using stacks.
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to solve tower of Hanoi
	 * 
	 * Time Complexity - O(2^n) because we need 2^n - 1 moves
	 * Space Complexity - O(n)
	 * 
	 * @param numOfDisks
	 * @param from
	 * @param to
	 * @param buffer
	 */
	public static void towerOfHanoi(int numOfDisks, char from, char to, char buffer) {
		if (numOfDisks == 1) {
			System.out.println("Moving Disc 1 from " + from + " to " + to);
		} else {
			towerOfHanoi(numOfDisks - 1, from, buffer, to);
			System.out.println("Moving Disc " + numOfDisks + " from " + from + " to " + to);
			towerOfHanoi(numOfDisks - 1, buffer, to, from);
		}
	}

}
