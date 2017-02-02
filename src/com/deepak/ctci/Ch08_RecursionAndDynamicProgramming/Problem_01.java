package com.deepak.ctci.Ch08_RecursionAndDynamicProgramming;

public class Problem_01 {

	public static void main(String[] args) {
		System.out.println(countWays(0));
		System.out.println(countWays(1));
		System.out.println(countWays(5));
	}

	public static int countWays(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		/* Total number of possibilities, He can either hop 1 step
		 * + hop 2 steps + hop 3 steps */
		return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
	}

}
