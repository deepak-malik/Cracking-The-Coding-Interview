/**
 * Cracking-The-Coding-Interview
 * Problem_05.java
 */
package com.deepak.ctci.Ch13_Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * <br> Problem Statement:
 * 
 * Explain the difference between TreeMap, HashMap and LinkedHashMap.
 * Provide and example when each one would be best?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/* All of these are sub classes of Map and all of them deals with 
	 * key value pairs giving some way to iterate over the keys. The way
	 * all of these behaves is similar but they differ in their lookup time
	 * and the way they store key value pairs . 
	 * Below is a differentiation : 
	 * 
	 * 	1. HashMap : This offers O(1) for lookup of keys and insertion. But there is no sort order
	 * 		maintained for this. This is implemented by arrays of Linked List (which is now changed 
	 * 		to Tree in java 8)
	 * 
	 * 	2. TreeMap : This offers O(log N) for lookup and insertion. Order is maintained in this so key
	 * 		must implement a comparable interface. This is implemented using Red-Black trees. 
	 * 
	 * 	3. LinkedHashMap : This again offers O(1) for lookup and insertion. Order is maintained in this 
	 * 		but in the same way as insertion happens. This is implemented using doubly linked lists. 
	 * 
	 * When to use : 
	 * 	- Use HashMap unless there is a strict need to use something else. HashMap provides very fast lookup.
	 * 		TreeMap is used when we want to maintain a specific order. for example you need to fetch first 
	 * 		10 name of students who start with a given alphabet. LinkedHashMap can be used in case of caching
	 * 		where you want to remove the last element. */

	/* Lets insert -1, 0 and 1 in all of these HashMaps */

	/**
	 * Method to check the insertion order of these maps
	 * @param args
	 */
	public static void main(String[] args) {
		/* HashMap */
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "A");
		hashMap.put(-1, "B");
		hashMap.put(0, "C");
		System.out.println("HashMap : ");
		hashMap.forEach((k, v) -> System.out.println(k));

		/* LinkedHashMap */
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "A");
		linkedHashMap.put(-1, "B");
		linkedHashMap.put(0, "C");
		System.out.println("\nLinkedHashMap : ");
		linkedHashMap.forEach((k, v) -> System.out.println(k));

		/* TreeMap */
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "A");
		treeMap.put(-1, "B");
		treeMap.put(0, "C");
		System.out.println("\nTreeMap : ");
		treeMap.forEach((k, v) -> System.out.println(k));
	}

}
