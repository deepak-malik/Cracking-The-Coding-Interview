/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * <br> Problem Statement :
 *  
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use any additional data structure?
 * 
 * ASCII v/s UNICODE - String can be either of these. ASCII has basically 128
 * characters (256 in a extended set) ranging from 0 - 127 whereas, UNICODE is
 * a superset of ASCII and has 0 - 2^21 characters. Only difference is size. 
 * 
 * </br>
 *  
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to check if a given string has all unique characters.
	 * Assume input here is ASCII code.
	 * 
	 * Approach : Iterate through the characters in string, 
	 * if it doesn't appear then set the flag to true. 
	 * If it appears, return false.
	 * 
	 * Time Complexity : O(n) - Because if there are n characters, we will loop n times 
	 * Space Complexity : O(n) 
	 * 
	 * @param iWord
	 * @return {@link boolean}
	 */
	public static boolean hasUniqueAscii(String iWord) {
		/* ASCII can have max 256, if it crosses limit 
		 * or word is null then return false. Handling both
		 * null and empty separately. Normally, Apache utility
		 * StringUtils.isNotBlank() should do the job */
		if (iWord == null || iWord == "" || iWord.length() > 256) {
			return false;
		}
		/* Create a array of boolean flags for each of the character */
		boolean[] charFlags = new boolean[256];
		for (int i = 0; i < iWord.length(); i++) {
			/* Find index of each character and update the flag to true for that position. 
			 * Now, if we get the character at same position again, we already have a true there
			 * and we know that this character is repeated. */
			int index = iWord.charAt(i);
			if (!charFlags[index]) {
				/* If not true, update to true */
				charFlags[index] = true;
			} else {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to check if a given string has all unique characters
	 * Assume input here is Unicode.
	 * 
	 * Approach : Iterate through each character in string,
	 * compare each of it for an existence in set. If it doesn't
	 * appear in set, add it. if exists, return false.
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * @param iWord
	 * @return {@link boolean}
	 */
	public static boolean hasUniqueUnicode(String iWord) {
		/* Empty string is not unique. This differs from user to user */ 
		if (iWord == null || iWord == "") {
			return false;
		}
		/* Convert to character array and loop through each character */
		char[] characters = iWord.toCharArray();
		Set<Character> set = new HashSet<>();
		for (Character c : characters) {
			/* Check if set contains the character, if yes, return false else add to set */
			if (set.contains(c)) {
				return false;
			} else {
				set.add(c);
			}
		}
		return true;
	}

}
