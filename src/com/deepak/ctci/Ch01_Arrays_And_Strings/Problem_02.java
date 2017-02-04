/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 *  
 * Given two strings, write a method to decide if one
 * is the permutation of other.
 * Following two separate approaches here for each of the
 * case sensitive and case insensitive comparison.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to check if two given strings are valid 
	 * case sensitive permutations
	 * 
	 * @param string1
	 * @param string2
	 * @return {@link boolean}
	 */
	public static boolean isValidPermutation_CaseSensitive(String string1, String string2) {
		/* Considering null and "" as valid permutations */
		if ((string1 == null && string2 == null) || (string1 == "" && string2 == "")) {
			return true;
		}
		/* No need to process further if length of two strings is not same */
		if (string1.length() != string2.length()) {
			return false;
		}
		/* Start the comparison of each character from different sides, 
		 * i.e start from 0 for 1st string and start from n - 1 for 2nd string */
		int i = 0, j = string2.length() - 1;
		while (i < string1.length() && j > 0) {
			/* If any of the character doesn't match, return false */
			if (string1.charAt(i) != string2.charAt(j)) {
				return false;
			}
			/* Increase or decrease the counter for each string appropriately */
			i++;
			j--;
		}
		return true;
	}

	/**
	 * Method to check if two given strings are valid 
	 * case insensitive permutations
	 * 
	 * @param string1
	 * @param string2
	 * @return {@link boolean}
	 */
	public static boolean isValidPermutation_CaseInSensitive(String string1, String string2) {
		/* Considering null and "" as valid permutations */
		if ((string1 == null && string2 == null) || (string1 == "" && string2 == "")) {
			return true;
		}
		/* No need to process further if length of two strings is not same */
		if (string1.length() != string2.length()) {
			return false;
		}
		/* Convert each of the strings to upper case character array, since it is case in sensitive comparison */
		char[] charArray1 = string1.toUpperCase().toCharArray();
		char[] charArray2 = string2.toUpperCase().toCharArray();
		/* Sort both the arrays */
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		/* Compare each character at same position, if doesn't match return false */
		for (int i = 0; i < charArray1.length; i++) {
			if (charArray1[i] != charArray2[i]) {
				return false;
			}
		}
		return true;
	}

}
