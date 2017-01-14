/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch13_Java;

/**
 * <br> Problem Statement:
 * 
 * In Java, does the finally block gets executed if we insert
 * a return statement inside the try block of a try-catch-finally?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/* Yes, finally block will always be executed even if try block has,
	 * 	1. return statement
	 * 	2. exception
	 * 	3. break statement 
	 * 	4. continue statement
	 *  
	 * There are only 2 possible ways where a finally block may not get executed. They are, 
	 * 	1. If the child thread processing the try block dies.
	 * 	2. if the VM executing the process, gets killed */

	public static void main(String[] args) {
		int x = 0;
		int y = 5;
		try {
			int result = y/x;
			System.out.println("Divison success !!. Result : " + result);
		} catch (Exception exception) {
			System.out.println("Exception occured. Message : " + exception.getMessage());
		} finally {
			System.out.println("Finally block executed even when there was a exception in try block !!");
		}
	}

}
