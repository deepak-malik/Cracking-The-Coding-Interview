/**
 * Cracking-The-Coding-Interview
 * Problem_12.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

/**
 * <br> Problem Statement :
 * 
 * Write an algorithm to print all ways of arranging eight queens 
 * on an 8 X 8 chess board so that none of them share the same row,
 * column or diagonal. In this case "diagonal" means all diagonals,
 * not just the two that bisects the board.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_12 {

	/**
	 * Method to place n queens on a board of size n
	 * 
	 * Time Complexity : 
	 * Space Complexity : O(n)
	 * 
	 * @param n
	 * @return {@link Position[]}
	 */
	public static Position[] solveNQueens(int n) {
		/* Positions of queen */
		Position[] positions = new Position[n];
		/* If we are able to place, return the positions else return blank positions */
		boolean placed = solveNQueens(n, 0, positions);
		if (placed) {
			return positions;
		} else {
			return new Position[0];
		}
	}

	/**
	 * Method to place N queens on a N X N chess board
	 * 
	 * @param n
	 * @param row
	 * @param positions
	 * @return {@link boolean}
	 */
	private static boolean solveNQueens(int n, int row, Position[] positions) {
		/* If we are at last row, return true since we are done placing */
		if (n == row) {
			return true;
		}
		/* Check for each column in the row */
		int col;
		for (col = 0; col < n; col++) {
			/* Mark queen as safe */
			boolean safe = true;
			/* Check if this row and column is under attack from any previous queen */
			for (int queen = 0; queen < row; queen++) {

				/* Queen will be under attack for these cases, 
				 * 	1. There is another queen in the same column
				 * 	2. There exists a queen in diagonal 1 i.e from top left to bottom right 
				 * 	3. There exists a queen in diagonal 2 i.e from bottom left to top right 
				 * 
				 * Now, for attack to happen,
				 * For diagonal 1 => row - col of queen should be equal to row - col of any other position
				 * For diagonal 2 => row + col of queen should be equal to row + col of any other position */
				if (positions[queen].col == col || positions[queen].row - positions[queen].col == row - col ||
						positions[queen].row + positions[queen].col == row + col) {
					safe = false;
					break;
				}
			}
			if (safe) {
				/* If queen is same, place it and move to next row */
				positions[row] = new Position(row, col);
				if (solveNQueens(n, row + 1, positions)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Class position
	 * 
	 * @author Deepak
	 */
	public static class Position {

		/* Variables to hold row and column value */
		int row, col;

		/**
		 * Constructor 
		 * 
		 * @param row
		 * @param col
		 */
		public Position(int row, int col) {
			this.row = row;
			this.col = col;
		}

		@Override
		public String toString() {
			return "(" + row + "," + col + ")";
		}

	}

}
