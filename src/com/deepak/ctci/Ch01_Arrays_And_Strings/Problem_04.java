/**
 * Cracking-The-Coding-Interview
 * Problem_04.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <br> Problem Statement :
 * 
 * Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word
 * or phrase that is same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 * 
 * ex. Input : Tact Coa
 * Output : True (permutations : "taco cat", "atco cta", etc.) 
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to check if a given string is a palindrome permutation
	 * - A string will be considered as a palindrome permutation, 
	 * if it does not have more then one odd character count
	 * 
	 * @param input
	 * @return {@link boolean}
	 */
	public static boolean isPalindromePermutation(String input) {
		/* If input is null, no further processing */
		if (input == null) {
			return false;
		}
		/* Counter for characters who have odd count */
		int oddCount = 0;
		/* Converting to lower case to avoid comparison issues */
		input = input.toLowerCase();
		/* Map to hold count of each character */
		Map<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			/* Current character that is being evaluated */
			char currentChar = input.charAt(i);
			/* If it is a letter or digit, check for existence in map 
			 * and update the count accordingly */
			if (Character.isLetter(currentChar) || Character.isDigit(currentChar)) {
				if (countMap.containsKey(currentChar)) {
					countMap.put(currentChar, countMap.get(currentChar) + 1);
				} else {
					countMap.put(currentChar, 1);
				}
			}
		}
		/* Loop through the entry set and find how many characters we have
		 * which has odd count */
		for (Entry<Character, Integer> key : countMap.entrySet()) {
			if (key.getValue() % 2 != 0) {
				oddCount++;
			}
		}
		/* If it is more then 1, return false */
		return oddCount <= 1;
	}

}
