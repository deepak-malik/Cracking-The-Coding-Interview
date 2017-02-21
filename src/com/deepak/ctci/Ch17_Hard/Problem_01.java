/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch17_Hard;

/**
 * <br> Problem Statement :
 * 
 * Write a function that adds two numbers. You should not
 * use + or any other arithmetic operators.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to add two numbers iteratively
	 * 
	 * Approach : In normal addition, we add two numbers
	 * and take a carry to next step. 
	 * Here, we will split these 2 parts i.e add separate and carry separate.
	 * Add : To add two binary numbers and forget to carry is XOR
	 * Carry : To take carry out of addition is AND Shifted left
	 * Now - Keep calculating until there is nothing to carry
	 * 
	 * @param a
	 * @param b
	 * @return {@link int}
	 */
	public static int add_Iterative(int a, int b) {
		while (b != 0) {
			/* Add 2 numbers without carry */
			int sum = a ^ b;
			/* Find carry */
			int carry = (a & b) << 1;
			a = sum;
			b = carry;
		}
		return a;
	}

	/**
	 * Method to add two numbers recursively
	 *  
	 * @param a
	 * @param b
	 * @return {@link int}
	 */
	public static int add_Recursive(int a, int b) {
		/* If second number is 0, return the first one */
		if (b == 0) {
			return a;
		}
		/* Find sum of 2 numbers */
		int sum = a ^ b;
		/* Find carry */
		int carry = (a & b) << 1;
		return add_Recursive(sum, carry);
	}

}
