/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch05_Bit_Manipulation;

/**
 * <br> Problem Statement :
 * 
 * You are given two 32 bit numbers, N and M, and two bit positions,
 * i and j. Write a method to insert M into N such that M starts at
 * bit j and ends at bit i. You can assume that bits j through i have
 * enough space to fit all of M. That is, if M = 10011, you can assume
 * that there are at least 5 bits between j and i. You would not for example,
 * have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
 * 
 * Example : 
 * Input N = 10000000000, M = 10011, i = 2, j = 6
 * Output N = 10001001100
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to merge M into N
	 * 
	 * @param N
	 * @param M
	 * @param i
	 * @param j
	 * @return {@link int}
	 */
	public static int mergeMIntoN(int N, int M, int i, int j) {
		/* Since we are dealing with 32 bits, 
		 * i and j can't be greater then 32 */
		if (i > 32 || i > j) {
			return 0;
		}
		/* We need to clear the bits from i to j.
		 * For that, we need a mask. Let's take all 1's
		 * and keep only those 1, where M can fit in, rest
		 * can be made 0 */
		int allOnes = ~0;
		int left = allOnes << (j + 1);
		int right = ((1 << i) - 1);
		int mask = left | right;

		/* Clear i through j */
		int n_cleared = N & mask;
		int m_shifted = M << i;
		return n_cleared | m_shifted;
	}

}
