/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch05_Bit_Manipulation;

/**
 * <br> Problem Statement :
 * 
 * Given a real number between 0 and 1 (ex. 0.72) that is
 * passed in as a double, print the binary representation.
 * If the number cannot be represented accurately in binary,
 * with at most 32 characters, print "ERROR".
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to print binary for a double
	 * 
	 * @param number
	 * @return {@link String}
	 */
	public static String printBinary(double number) {
		/* Number should be between 0 and 1 */
		if (number <= 0 || number >= 1) {
			return "ERROR";
		}
		/* Create a builder and append with . since we are
		 * dealing with decimal numbers here */
		StringBuilder builder = new StringBuilder();
		builder.append(".");
		/* Keep going until that number is greater then 0 */
		while (number > 0) {
			/* We should not cross 32 bit limit */
			if (builder.length() > 32) {
				return "ERROR";
			}
			/* Multiply that number by 2. We always have
			 * to keep the range between 0 and 1 so, 
			 * if it crosses 1, subtract 1 else keep the
			 * number as same */
			double r = number * 2;
			if (r >= 1) {
				builder.append(1);
				number = r - 1;
			} else {
				builder.append(0);
				number = r;
			}
		}
		return builder.toString();
	}

}
