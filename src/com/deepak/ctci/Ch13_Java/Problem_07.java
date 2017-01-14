/**
 * Cracking-The-Coding-Interview
 * Problem_07.java
 */
package com.deepak.ctci.Ch13_Java;

import java.util.List;

/**
 * <br> Problem Statement:
 * 
 * There is a class country that has method 
 * getContinent() and getPopulation(). Write a function 
 * "int getPopulation(List<Country> countries, String continent)"
 * that computes the total population of a given continent, 
 * given a list of all countries and the name of a continent.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to get population using advanced java loop
	 * @param countries 
	 * @param continent
	 * @return {@link int}
	 */
	public static int getPopulationUsingLoop(List<Country> countries, String continent) {
		int totalPopulation = 0;
		for (Country country : countries) {
			if (country.getContinent().equalsIgnoreCase(continent)) {
				totalPopulation += country.getPopulation();
			}
		}
		return totalPopulation;
	}

	/**
	 * Method to get population using java 8 lambdas
	 * @param countries 
	 * @param continent
	 * @return {@link int}
	 */
	public static int getPopulationUsingLambda(List<Country> countries, String continent) {
		return countries.stream().filter(country -> country.getContinent().equalsIgnoreCase(continent)).mapToInt(Country::getPopulation).sum();
	}

	/**
	 * Class country 
	 * @author Deepak
	 */
	public static class Country {

		private String continent;
		private int population;

		/**
		 * Constructor
		 * @param continent
		 * @param population
		 */
		public Country(String continent, int population) {
			this.continent = continent;
			this.population = population;
		}

		public String getContinent() {
			return continent;
		}
		public void setContinent(String continent) {
			this.continent = continent;
		}

		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}

	}

}
