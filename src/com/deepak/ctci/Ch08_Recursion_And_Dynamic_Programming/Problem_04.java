/**
 * Cracking-The-Coding-Interview
 * Problem_04.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.ArrayList;

/**
 * <br> Problem Statement :
 * 
 * Write a method to return all subsets of a set.
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to return sub sets from a set
	 * 
	 * Time Complexity : O(n2^n)
	 * Space Complexity : O(n2^n)
	 * 
	 * @param set
	 * @param index
	 * @return {@link ArrayList<ArrayList<Integer>>}
	 */
	public static ArrayList<ArrayList<Integer>> findSubSets_Recursive(ArrayList<Integer> set, int index) {
		/* We will be returning all subsets */
		ArrayList<ArrayList<Integer>> allSubSets;
		/* If we are at last index, return empty set */
		if (set.size() == index) {
			allSubSets = new ArrayList<>();
			allSubSets.add(new ArrayList<>());
		} else {
			/* Find sub sets by moving on to next index */
			allSubSets = findSubSets_Recursive(set, index + 1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<>();
			/* Check for each set */
			for (ArrayList<Integer> subset : allSubSets) {
				ArrayList<Integer> newSubSet = new ArrayList<>();
				newSubSet.add(item);
				newSubSet.addAll(subset);
				moreSubSets.add(newSubSet);
			}
			allSubSets.addAll(moreSubSets);
		}
		return allSubSets;
	}

}
