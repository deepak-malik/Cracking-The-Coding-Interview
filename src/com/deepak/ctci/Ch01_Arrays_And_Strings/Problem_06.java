/**
 * Cracking-The-Coding-Interview
 * Problem_06.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

/**
 * <br> Problem Statement :
 * 
 * Implement a method to perform basic string compression
 * using the count of repeated characters. For ex. the string
 * "aabcccccaaa" would become "a2b1c5a3". If the sum compressed string
 * does not become smaller then the original string, then your 
 * method should return the original string. You can assume that
 * the string has only upper case and lower case letters.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to compress a string 
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String compressString(String input) {
		/* If input is null, no further processing required */
		if (input == null) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		/* Initialize current character and count */
		char currentChar = 0;
		int count = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			/* Find current character and check with next character.
			 * If matches, increase the count else append the character
			 * and count. Reset the counter. */
			currentChar = input.charAt(i);
			if (currentChar != input.charAt(i + 1)) {
				builder.append(currentChar);
				builder.append(count);
				count = 1;
			} else {
				count++;
			}
		}
		/* There is no append happening for last set of characters,
		 * because if condition won't be true. Appending them here. */
		builder.append(currentChar);
		builder.append(count);
		/* if builder's length is less as compared to
		 * input, return builder's string else return input */
		if (builder.toString().length() < input.length()) {
			return builder.toString();
		} 
		return input;
	}

}
