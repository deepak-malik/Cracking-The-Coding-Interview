/**
 * Cracking-The-Coding-Interview
 * Problem_01_Test.java
 */
package com.deepak.ctci.Ch06_Math_And_Logic_Puzzles;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.ctci.Ch06_Math_And_Logic_Puzzles.Problem_01.Bottle;

/**
 * Test cases for Problem 01 
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/* Define collection of bottles and number of pills in each bottle */
	private List<Bottle> collectionOfBottles;
	private int numberOfPills = 100;

	/**
	 * Setup bottles with 1.0 gram of pill in each
	 */
	@Before
	public void setup() {
		collectionOfBottles = new ArrayList<>();
		/* Filling 20 bottles with 1.0 gram of pill each */
		for (int i = 1; i <= 20; i++) {
			Bottle bottle = new Bottle(i, numberOfPills, 1.0);
			collectionOfBottles.add(bottle);
		}
	}

	/**
	 * Test case to check heavy bottle
	 */
	@Test
	public void testHeavyBottle() {
		/* When none of the bottles has heavier pills */
		List<Bottle> bottles1 = Problem_01.replaceBottleWithHeavierPills(collectionOfBottles, 0);
		Assert.assertEquals(Problem_01.findBottleWithHeavyPill(bottles1), 0);

		/* When any one valid bottle has heavier pills */
		List<Bottle> bottles2 = Problem_01.replaceBottleWithHeavierPills(collectionOfBottles, 17);
		Assert.assertEquals(Problem_01.findBottleWithHeavyPill(bottles2), 17);
	}

}
