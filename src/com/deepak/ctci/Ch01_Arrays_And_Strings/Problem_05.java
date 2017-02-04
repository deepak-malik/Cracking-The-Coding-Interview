/**
 * Cracking-The-Coding-Interview
 * Problem_05.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

/**
 * <br> Problem Statement :
 * 
 * There are three types of edits that can be performed
 * on strings, insert a character, remove a character or
 * replace a character. Given two strings, write a function
 * to check of they are one edit (or zero edits) away.
 * 
 * ex. pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to check if two strings are one edit away
	 * 
	 * @param input1
	 * @param input2
	 * @return {@link boolean}
	 */
	public static boolean isOneEditAway(String input1, String input2) {
		/* If any of the string is null, don't process further */
		if (input1 == null || input2 == null) {
			return false;
		}
		/* Length of strings should tell us, which operation to perform.
		 * Inserting is reverse of removal, so we will have only removal */
		if (input1.length() == input2.length()) {
			return isReplaceEdit(input1, input2);
		} else if (input1.length() == input2.length() + 1) {
			/* Bigger string is the first parameter to this method */
			return isRemovalEdit(input1, input2);
		} else if (input1.length() + 1 == input2.length()) {
			return isRemovalEdit(input2, input2);
		}
		return false;
	}

	/**
	 * Method to check if two strings are a replace away
	 * Note : Here both the strings are of same length
	 * 
	 * @param input1
	 * @param input2
	 * @return {@link boolean}
	 */
	private static boolean isReplaceEdit(String input1, String input2) {
		int i = 0;
		int editCount = 0;
		/* Loop till the length of small string */
		while (i < input1.length()) {
			/* If character's doesn't match, increase the 
			 * edit count and move forward, else just move forward. */
			if (input1.charAt(i) != input2.charAt(i)) {
				editCount++;
				i++;
			} 
			i++;
		}
		/* We should be either 0 or 1 edits away */
		return editCount <= 1;
	}

	/**
	 * Method to check if two strings are a removal away
	 * Note : Here first string is bigger then second
	 * 
	 * @param input1
	 * @param input2
	 * @return {@link boolean}
	 */
	private static boolean isRemovalEdit(String input1, String input2) {
		int removalCount = 0;
		/* We need two pointers here, because both the strings are of different length */
		int i = 0, j = 0;
		while (i < input2.length()) {
			/* If characters doesn't match, we know first string has a character to remove.
			 * Jump the pointer just for first string and increase removal count */
			if (input1.charAt(i) != input2.charAt(j)) {
				removalCount++;
				i++;
			} 
			/* Move forward for both strings */
			i++;
			j++;
		}
		/* We should be either 0 or 1 removals away */
		return removalCount <= 1;
	}

}
