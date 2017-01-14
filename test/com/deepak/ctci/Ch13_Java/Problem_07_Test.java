/**
 * Cracking-The-Coding-Interview
 * Problem_07_Test.java
 */
package com.deepak.ctci.Ch13_Java;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch13_Java.Problem_07.Country;

/**
 * Test cases to find the total population of the country
 * 
 * @author Deepak
 */
public class Problem_07_Test {

	/**
	 * Test case for positive flow using loop
	 */
	@Test
	public void testGetPopulationUsingLoop() {
		/* Define the countries with continent names and population */
		Country country1 = new Country("North America", 1000);
		Country country2 = new Country("Asia", 1700);
		Country country3 = new Country("Europe", 1200);
		Country country4 = new Country("North America", 300);
		/* Add to the countries list */
		List<Country> countries = Arrays.asList(country1, country2, country3, country4);
		int population = Problem_07.getPopulationUsingLoop(countries, "North America");
		Assert.assertEquals(population, 1300);
	}

	/**
	 * Test case for positive flow using lambda
	 */
	@Test
	public void testGetPopulationUsingLambda() {
		/* Define the countries with continent names and population */
		Country country1 = new Country("North America", 1000);
		Country country2 = new Country("Asia", 1700);
		Country country3 = new Country("Europe", 1200);
		Country country4 = new Country("North America", 300);
		/* Add to the countries list */
		List<Country> countries = Arrays.asList(country1, country2, country3, country4);
		int population = Problem_07.getPopulationUsingLambda(countries, "North America");
		Assert.assertEquals(population, 1300);
	}

	/**
	 * Test case for negative flow using loop
	 * Here, pass the continent name as blank
	 */
	@Test
	public void testGetPopulationUsingLoopWithException() {
		/* Define the countries with continent names and population */
		Country country1 = new Country("North America", 1000);
		Country country2 = new Country("Asia", 1700);
		Country country3 = new Country("Europe", 1200);
		Country country4 = new Country("North America", 300);
		/* Add to the countries list */
		List<Country> countries = Arrays.asList(country1, country2, country3, country4);
		int population = Problem_07.getPopulationUsingLoop(countries, "");
		Assert.assertEquals(population, 0);
	}

	/**
	 * Test case for negative flow using lambda
	 * Here, pass the countries list as empty 
	 */
	@Test
	public void testGetPopulationUsingLambdaWithException() {
		/* Define empty countries list */
		List<Country> countries = Arrays.asList();
		int population = Problem_07.getPopulationUsingLambda(countries, "North America");
		Assert.assertEquals(population, 0);
	}

}
