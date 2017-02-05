/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch06_Math_And_Logic_Puzzles;

import java.text.DecimalFormat;
import java.util.List;

/**
 * <br> Problem Statement :
 * 
 * You have 20 bottles of pills. 19 bottles has 1.0 grams 
 * of pills but one bottle has pills of weight 1.1 grams.
 * Given a scale that provides a exact measurement, how
 * would you find the heavy bottle?
 * You can only use the scale once.
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find bottle with the heavy pill
	 * 
	 * Approach => Since we can use the scale only once,
	 * so take 1 pill from bottle one, 2 pills from bottle 2 and so on.
	 * Get the difference between actual weight of all pills collected
	 * and the standard weight (Standard one will be when we consider
	 * each pill is fixed 1.0 grams)
	 * 
	 * @param collectionOfBottles
	 * @param numberOfPills
	 * @return {@link int}
	 */
	public static int findBottleWithHeavyPill(List<Bottle> collectionOfBottles, int numberOfPills) {
		double standardWeight = 0.0;
		double actualWeight = 0.0;
		/* Get standard weight and actual weight from each bottle */
		for (Bottle bottle : collectionOfBottles) {
			standardWeight += bottle.bottleNumber * 1.0;
			actualWeight += bottle.bottleNumber * bottle.weightOfEachPill; 
		}
		/* Find the difference and get bottle number from that */
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		double difference = Double.valueOf(decimalFormat.format((actualWeight - standardWeight) * 10));
		int bottleNumber = (int) difference;
		if (bottleNumber > 0 || bottleNumber < collectionOfBottles.size()) {
			return bottleNumber;
		}
		return 0;
	}

	/**
	 * Method to replace a given bottle with the heavier pills
	 * 
	 * @param collectionOfBottles
	 * @param bottleNumber
	 * @param numberOfPills
	 * @return {@link List<Bottle>}
	 */
	public static List<Bottle> replaceBottleWithHeavierPills(List<Bottle> collectionOfBottles, int bottleNumber, int numberOfPills) {
		/* Find the bottle to replace pills from the collection and replace each pill */
		if (bottleNumber > 0 && bottleNumber <= collectionOfBottles.size()) {
			Bottle bottleToReplacePills = collectionOfBottles.get(bottleNumber - 1);
			bottleToReplacePills.weightOfEachPill = 1.1;
		}
		return collectionOfBottles;
	}

	/**
	 * Class for Bottle
	 * 
	 * @author Deepak
	 */
	public static class Bottle {

		/* Bottle number, # of pills and weight of each pill */
		int bottleNumber;
		int numberOfPills;
		double weightOfEachPill;

		/**
		 * Constructor
		 * 
		 * @param bottleNumber
		 * @param numberOfPills
		 * @param weightOfEachPill
		 */
		public Bottle(int bottleNumber, int numberOfPills, double weightOfEachPill) {
			this.bottleNumber = bottleNumber;
			this.numberOfPills = numberOfPills;
			this.weightOfEachPill = weightOfEachPill;
		}

	}

}
