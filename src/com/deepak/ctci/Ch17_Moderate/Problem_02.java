/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch17_Moderate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Design a method to find the frequency of occurrences
 * of any given word in a book. What if we were running
 * this algorithm multiple times?
 * 
 * </br>
 *  
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find occurrences of a word in book
	 * 
	 * @param book
	 * @param word
	 * @return {@link int}
	 */
	public static int findOccurrences(List<String> book, String word) {
		/* If either book is null or word is null, stop processing */
		if (book == null || word == null) {
			return -1;
		}
		/* Initialize frequency of words */
		int frequency = 0;
		/* Check for each word, if matches, update the frequency */
		for (String wordFromBook : book) {
			if (wordFromBook.toLowerCase().equals(word.toLowerCase())) {
				frequency++;
			}
		}
		return frequency;
	}

	/**
	 * Method to find occurrences when algorithm is run multiple times
	 * 
	 * @param dictionary
	 * @param word
	 * @return {@link int}
	 */
	public static int findOccurrencesWhenRunMultipleTimes(Map<String, Integer> dictionary, String word) {
		/* If dictionary is null or word is null, stop processing */
		if (dictionary == null || word == null) {
			return -1;
		}
		/* Check if dictionary contains the word, if yes, get the count else return 0 */
		if (dictionary.containsKey(word.toLowerCase())) {
			return dictionary.get(word.toLowerCase());
		}
		return 0;
	}

	/**
	 * Method to setup the dictionary
	 * 
	 * @param book
	 * @return {@link Map<String, Integer>}
	 */
	public static Map<String, Integer> setUpDictionary(List<String> book) {
		/* If book is null, return null */
		if (book == null) {
			return null;
		}
		/* Create a dictionary and add lower case words to it with their count */
		Map<String, Integer> dictionary = new HashMap<>();
		for (String word : book) {
			/* Add only words, not spaces */
			if (word.trim() != "") {
				/* If word exists, increase the count, else make count as 1 */
				if (dictionary.containsKey(word.toLowerCase())) {
					dictionary.put(word.toLowerCase(), dictionary.get(word.toLowerCase()) + 1);
				} else {
					dictionary.put(word.toLowerCase(), 1);
				}
			}
		}
		return dictionary;
	}

}
