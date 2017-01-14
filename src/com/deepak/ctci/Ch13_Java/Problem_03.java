/**
 * Cracking-The-Coding-Interview
 * Problem_03.java
 */
package com.deepak.ctci.Ch13_Java;

/**
 * <br> Problem Statement:
 * 
 * What is the difference between final, finally and finalize?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {
	
	/* There is a significant difference between these 3 which is defined below :
	 * 	1. final - This keyword is used with a variable or class to make sure it is not changeable
	 * 		For ex. final when used with a variable (primitive) makes sure it's value doesn't gets changed.
	 * 				final when used with a variable (reference) makes sure that variable doesn't point to any other object in same heap.
	 * 
	 * 	2. finally - This is used with try catch block and ensures it gets executed even if try block has a break or a return statement. 
	 * 		This even gets executed when there is a exception. This is mainly used to close any open connections, open input streams etc. 
	 * 
	 * 	3. finalize - This is used by the garbage collector once it ensures that no reference for a variable exists furthermore. */
	
	/**
	 * This string is defined as final. I can't change the value of it in entire file or even application.
	 */
	@SuppressWarnings("unused")
	private final static String sample = "Problem_03";
	
	/* Use case for finally has been already explained in Problem 2 */

}
