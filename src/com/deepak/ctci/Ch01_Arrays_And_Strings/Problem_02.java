/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 *  
 * Given two strings, write a method to decide if one is the permutation of other.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to check if two strings are valid permutation
	 * This is a brute force approach
	 *  
	 * @param str1
	 * @param str2
	 * @return {@link boolean}
	 */
	public static boolean isValidPermutation_BruteForce(String str1, String str2) {
		/* None of the strings should be empty and there length should be equal */
		if (str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length()) {
			return false;
		}
		/* Convert both to char array and sort them */
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		/* If both of them as string are equal, they are permutation of each other */
		return new String(str1Array).equals(new String(str2Array));
	}

	/**
	 * Method to check if two strings are permutation 
	 * This is a optimized approach when we assume that strings are ASCII
	 * 
	 * @param str1
	 * @param str2
	 * @return {@link boolean}
	 */
	public static boolean isValidPermutation_Optimized(String str1, String str2) {
		/* None of the strings should be empty and there length should be equal */
		if (str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length()) {
			return false;
		}
		/* Since we know it is a ASCII string, we can take a int array of 256 size */
		int[] letters = new int[256];
		/* Initially array will have all 0's, Increment
		 * the count for each character in first string */
		for (int i = 0; i < str1.length(); i++) {
			letters[str1.charAt(i)]++;
		}
		/* Decrement the count for each character when
		 * we traverse the second string and check if count has 
		 * gone below 0, if yes then they are not permutation */
		for (int i = 0; i < str2.length(); i++) {
			letters[str2.charAt(i)]--;
			if (letters[str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

}
