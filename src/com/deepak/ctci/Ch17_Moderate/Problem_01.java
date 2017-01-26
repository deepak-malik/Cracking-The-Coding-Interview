/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch17_Moderate;

import java.util.HashMap;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Write a program to swap two numbers in place.
 * i.e You cannot use temporary variables
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to swap two numbers in place
	 * 
	 * @param a
	 * @param b
	 * @return {@link Map<String, Integer>}
	 */
	public static Map<String, Integer> swap(int a, int b) {
		if (Integer.valueOf(a) == null || Integer.valueOf(b) == null) {
			return null;
		}
		Map<String, Integer> result = new HashMap<>();
		a = a - b;
		b = a + b;
		a = b - a;
		result.put("first", a);
		result.put("second", b);
		return result;
	}

	/**
	 * Method to swap two numbers in place using bits
	 * 
	 * @param a
	 * @param b
	 * @return {@link Map<String, Integer>}
	 */
	public static Map<String, Integer> swapUsingBits(int a, int b) {
		if (Integer.valueOf(a) == null || Integer.valueOf(b) == null) {
			return null;
		}
		Map<String, Integer> result = new HashMap<>();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		result.put("first", a);
		result.put("second", b);
		return result;
	}

}
