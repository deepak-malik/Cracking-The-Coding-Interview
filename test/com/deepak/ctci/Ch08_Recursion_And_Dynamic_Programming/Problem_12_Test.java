/**
 * Cracking-The-Coding-Interview
 * Problem_12_Test.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for Problem 12
 * 
 * @author Deepak
 */
public class Problem_12_Test {

	/**
	 * Test case for N queens when board size is either 2 or 3
	 * NOTE : You cannot place n queens on board of size 2 or 3
	 * It start from 4
	 */
	@Test
	public void testNQueensForBoardOfSize2And3() {
		Assert.assertEquals(Arrays.toString(Problem_12.solveNQueens(2)), "[]");
		Assert.assertEquals(Arrays.toString(Problem_12.solveNQueens(3)), "[]");
	}

	/**
	 * Test case for N queens when board size is 4
	 * 
	 * [*	Q	*	*]
	 * [* 	*	*	Q]
	 * [Q	*	*	*]
	 * [*	*	Q	*]
	 */
	@Test
	public void testNQueensForBoardOfSize4() {
		Assert.assertEquals(Arrays.toString(Problem_12.solveNQueens(4)), "[(0,1), (1,3), (2,0), (3,2)]");
	}

	/**
	 * Test case for N queens when board size is 8
	 */
	@Test
	public void testNQueensForBoardOfSize8() {
		Assert.assertEquals(Arrays.toString(Problem_12.solveNQueens(8)), "[(0,0), (1,4), (2,7), (3,5), (4,2), (5,6), (6,1), (7,3)]");
	}

	/**
	 * Test case for N queens when board size is 12
	 */
	@Test
	public void testNQueensForBoardOfSize12() {
		Assert.assertEquals(Arrays.toString(Problem_12.solveNQueens(12)), "[(0,0), (1,2), (2,4), (3,7), (4,9), (5,11), (6,5), (7,10), (8,1), (9,6), (10,8), (11,3)]");
	}

}
