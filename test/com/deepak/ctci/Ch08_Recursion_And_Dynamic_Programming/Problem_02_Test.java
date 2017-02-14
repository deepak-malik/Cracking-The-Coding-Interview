/**
 * Cracking-The-Coding-Interview
 * Problem_02_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming.Problem_02.Point;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case when no cells are off limit
	 */
	@Test
	public void testWhenNoCellsAreOffLimit() {
		/* Square matrix of 2 X 2 and we always start from (0, 0)*/
		Assert.assertEquals(Problem_02.countPathsWhenNoCellsAreOffLimit(1, 1), 2);
		/* Square matrix of 3 X 3 and we always start from (0, 0)*/
		Assert.assertEquals(Problem_02.countPathsWhenNoCellsAreOffLimit(3, 3), 20);
	}

	/**
	 * Method to test path brute force
	 */
	@Test
	public void testGetPathBruteForce() {
		boolean[][] maze = {{true, false, true}, {true, true, false}, {false, true, true}};
		ArrayList<Point> path = Problem_02.getPath_BruteForce(maze);
		Assert.assertEquals(path.toString(), "[(0,0), (1,0), (1,1), (2,1), (2,2)]");
	}

	/**
	 * Method to test path optimized
	 */
	@Test
	public void testGetPathOptimized() {
		boolean[][] maze = {{true, false, true}, {true, true, false}, {false, true, true}};
		ArrayList<Point> path = Problem_02.getPath_Optimized(maze);
		Assert.assertEquals(path.toString(), "[(0,0), (1,0), (1,1), (2,1), (2,2)]");
	}

}
