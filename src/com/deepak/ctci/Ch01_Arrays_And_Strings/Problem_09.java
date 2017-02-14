/**
 * Cracking-The-Coding-Interview
 * Problem_09.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

/**
 * <br> Problem Statement :
 * 
 * Assume you have a method isSubstring which checks
 * if one word is a substring of another. Given two
 * strings s1 and s2, write code to check if s2 is 
 * a rotation of s1 using only one call to isSubstring.
 * 
 * ex. "waterbottle" is a rotation of "erbottlewat"
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to check if one string is a rotation of another
	 * 
	 * Time Complexity : O(1)
	 * Space Complexity : O(1)
	 * 
	 * @param str1
	 * @param str2
	 * @return {@link boolean}
	 */
	public static boolean isRotation(String str1, String str2) {
		/* If any of the string is null, return null */
		if (str1 == null || str2 == null) {
			return false;
		}
		/* If one string is rotation of other, 
		 * there length should be equal and greater then zero */
		if (str1.length() == str2.length() && str1.length() > 0) {
			/* Concatenate str1 and str1 */
			String str1str1 = str1.concat(str1);
			/* Check if str2 is a substring of new string */
			return isSubString(str1str1, str2);
		}
		return false;
	}

	/**
	 * Method to check if a given string is a substring of another
	 * 
	 * @param big
	 * @param small
	 * @return {@link boolean}
	 */
	private static boolean isSubString(String big, String small) {
		if (big.toLowerCase().indexOf(small.toLowerCase()) >= 0) { 
			/* We can use big.contains(small) as well here */
			return true;
		}
		return false;
	}

}
