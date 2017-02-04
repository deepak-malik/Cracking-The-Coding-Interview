/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch16_Moderate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch16_Moderate.Problem_02;

/**
 * Test cases to find occurrences of a word in book
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to find occurrences of a word
	 */
	@Test
	public void testFindOccurrences() {
		List<String> book = Arrays.asList("This", "is", "a", "sample", "text", "from", "a", "random", "book", ".", "This", "book", "is", "mainly", "for", "software", "enginners");
		Assert.assertEquals(Problem_02.findOccurrences(book, "this"), 2);
		Assert.assertEquals(Problem_02.findOccurrences(book, "random"), 1);
		Assert.assertEquals(Problem_02.findOccurrences(book, "hello"), 0);
	}

	/**
	 * Test case to find occurrences when run multiple times
	 */
	@Test
	public void testFindOccurrencesWhenRunMultipleTimes() {
		List<String> book = Arrays.asList("This", "is", "a", "sample", "text", "from", "a", "random", "book", ".", "This", "book", "is", "mainly", "for", "software", "enginners");
		Map<String, Integer> dictionary = Problem_02.setUpDictionary(book);
		Assert.assertEquals(Problem_02.findOccurrencesWhenRunMultipleTimes(dictionary, "this"), 2);
		Assert.assertEquals(Problem_02.findOccurrencesWhenRunMultipleTimes(dictionary, "random"), 1);
		Assert.assertEquals(Problem_02.findOccurrencesWhenRunMultipleTimes(dictionary, "hello"), 0);
	}

}
