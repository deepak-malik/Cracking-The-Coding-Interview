/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch11_Testing;

/**
 * <br> Problem Statement : 
 * 
 * Find the mistake(s) in the following code :
 * 
 * unsigned int i;
 * for (i = 100; i >= 0; --i) {
 * 		printf("%d\n", i);
 * }
 * 
 * @author Deepak
 *
 */
public class Problem_01 {

	/* There are two mistakes in this code, 
	 * 		1. unsigned int is always >= 0, so for condition will always be true
	 * 		2. Since we are dealing with unsigned int, so in print statement, instead of %d, it should be %u
	 * 
	 * Below is the correct code in java, 
	 * */

	public static void main(String[] args) {
		int i;
		for (i = 100; i >= 0; --i) {
			System.out.println(i);
		}
	}

}
