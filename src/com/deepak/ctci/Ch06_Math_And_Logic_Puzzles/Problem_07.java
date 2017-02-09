/**
 * Cracking-The-Coding-Interview
 * Problem_07.java
 */
package com.deepak.ctci.Ch06_Math_And_Logic_Puzzles;

import java.util.Random;

/**
 * <br> Problem Statement :
 * 
 * In the new post-apocalyptic world, the world queen is desperately 
 * concerned about the birth rate. Therefore, she declares that all 
 * families should ensure that they have one girl or else they face 
 * massive fines. If all families abide by this policy, that is, 
 * they continue to have children until they have one girl, 
 * at which point they immediately stop. What will the gender ratio 
 * of the new generation be?. Assume that the odds of someone having 
 * a boy or girl is equal. Solve this logically then write a simulation of it.
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * There are no unit tests for this because, every time
	 * ratio will be different since random generation is
	 * involved here
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ration for Girls v/s Boys => " + runFamilies(100) * 100);
	}

	/**
	 * Method to run the logic on n number of families
	 * 
	 * @param numberOfFamilies
	 * @return {@link double}
	 */
	public static double runFamilies(int numberOfFamilies) {
		int boys = 0;
		int girls = 0;
		/* Find the genders for each family and calculate percentage */
		for (int i = 0; i < numberOfFamilies; i++) {
			int[] genders = runOneFamily();
			boys += genders[0];
			girls += genders[1];
		}
		return girls / (double) (boys + girls);
	}

	/**
	 * Method to run one family
	 * 
	 * @return {@link int[]}
	 */
	public static int[] runOneFamily() {
		int boys = 0;
		int girls = 0;
		Random random = new Random();
		/* Keep going until girl child is born */
		while (girls == 0) {
			/* If true, it's a boy else a girl */
			boolean nextChild = random.nextBoolean();
			if (nextChild) {
				boys++;
			} else {
				girls++;
			}
		}
		/* Create an integer for count of both */
		int[] genders = {boys, girls};
		return genders;
	}

}
