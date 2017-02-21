/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch17_Hard;

import java.util.Random;

/**
 * <br> Problem Statement :
 * 
 * Write a method to shuffle a deck of cards. It must be a
 * perfect shuffle - in other words, each of the 52! permutations
 * of the deck has to be equally likely. Assume that you are
 * given a random number generator which is perfect.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to shuffle deck of cards
	 * 
	 * @param cards
	 * @return {@link int[]}
	 */
	public static int[] shuffleDeckOfCards(int[] cards) {
		/* If we have empty deck, no need to shuffle */
		if (cards == null || cards.length == 0) {
			return new int[0];
		}
		Random random = new Random();
		for (int i = 1; i < cards.length; i++) {
			/* Find a random number to replace */
			int k = random.nextInt(i);
			/* If that is not equal to the current position, swap */
			if (k != i) {
				int temp = cards[k];
				cards[k] = cards[i];
				cards[i] = temp;
			}
		}
		return cards;
	}
	
}
