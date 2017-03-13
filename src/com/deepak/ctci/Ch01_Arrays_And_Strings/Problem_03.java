/**
 * Cracking-The-Coding-Interview
 * Problem_03.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

/**
 * <br> Problem Statement :
 * 
 * Write a method to replace all spaces with the string "%20".
 * You may assume that the string has sufficient space at the end,
 * to hold additional characters, and you are given the true length
 * of the string.
 * 
 * ex. Input : "Mr John Smith     ", 13 
 * Output : "Mr%20John%20Smith"
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to replace spaces in a string with special character's (Already given)
	 * True length is also passed in the method
	 * 
	 * Time Complexity : O(n) => Where n is number of characters in the input
	 * Space Complexity : O(n) => For char array, worst case we may end up adding all characters to array
	 * 
	 * @param input
	 * @param trueLength
	 * @return {@link String}
	 */
	public static String replaceSpacesWithSpecialCharacter(String input, int trueLength) {
		if (input == null || input == "") {
			return null;
		}
		/* Do a substring on the input. This is to make sure, we
		 * only deal with the string that we need */
		input = input.substring(0, trueLength);
		String replacement = "%20";
		StringBuilder builder = new StringBuilder();
		/* Convert to character array and loop through each character, 
		 * if character is space, append the replacement text else append character */
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (c != ' ') {
				builder.append(c);
			} else {
				builder.append(replacement);
			}
		}
		return builder.toString();
	}

}
