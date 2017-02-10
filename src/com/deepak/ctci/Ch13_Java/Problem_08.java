/**
 * Cracking-The-Coding-Interview
 * Problem_08.java
 */
package com.deepak.ctci.Ch13_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <br> Problem Statement:
 * 
 * Using lambda expressions, write a function
 * "List<Integer> getRandomSubset(List<Integer> list)"
 * that returns a random subset of arbitrary size.
 * All subsets including the empty subset are likely
 * equally to be chosen.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to get random subset using advanced java loop
	 * NOTE : We will use random to solve this problem. There can be other better ways
	 * 
	 * @param list
	 * @return {@link List<Integer>}
	 */
	public static List<Integer> getRandomSubsetUsingLoop(List<Integer> list) {
		List<Integer> randomSubset = new ArrayList<>();
		Random random = new Random();
		for (Integer item : list) {
			if (random.nextBoolean()) {
				randomSubset.add(item);
			}
		}
		return randomSubset;
	}

	/**
	 * Method to get random subset using lambda
	 * 
	 * @param list
	 * @return {@link List<Integer>}
	 */
	public static List<Integer> getRandomSubsetUsingLambda(List<Integer> list) {
		List<Integer> randomSubset = new ArrayList<>();
		Random random = new Random();
		Predicate<Object> flipCoin = o -> {
			return random.nextBoolean();
		};
		randomSubset = list.stream().filter(flipCoin).collect(Collectors.toList());
		return randomSubset;
	}

}
