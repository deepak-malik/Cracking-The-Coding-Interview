/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch05_BitManipulation;

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
	
	public int mergeMIntoN(int M, int N, int i, int j) {
		if (i < 0 || i >= 32 || j < i) {
			return 0;
		}
		
		return 0;
	}

}
