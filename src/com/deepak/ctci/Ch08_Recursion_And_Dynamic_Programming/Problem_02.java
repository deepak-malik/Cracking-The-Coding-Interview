/**
 * Cracking-The-Coding-Interview
 * Problem_02.java
 */
package com.deepak.ctci.Ch08_Recursion_And_Dynamic_Programming;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * <br> Problem Statement :
 * 
 * Imagine a robot sitting on the upper left corner of the grid with
 * r rows and c columns. The robot can only move into two directions,
 * right and down, but certain cells are "off limit" such that the robot
 * cannot step on them. Design an algorithm to find a path for the robot
 * from the top left to the bottom right.
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to get paths when no cells are off limit
	 * 
	 * @param x
	 * @param y
	 * @return {@link int}
	 */
	public static int countPathsWhenNoCellsAreOffLimit(int x, int y) {
		/* If we are on first cell, return 1 */
		if (x <= 0 || y <= 0) {
			return 1;
		}
		/* Count paths on each side, i.e down (y - 1) and right (x - 1) */
		return countPathsWhenNoCellsAreOffLimit(x, y - 1) + 
				countPathsWhenNoCellsAreOffLimit(x - 1, y);
	}

	/**
	 * Method to get path when cells are off limit
	 * This is a brute force approach
	 * 
	 * @param maze
	 * @return {@link ArrayList<Point>}
	 */
	public static ArrayList<Point> getPath_BruteForce(boolean[][] maze) {
		/* If invalid maze, return null */
		if (maze == null || maze.length == 0) {
			return null;
		}
		/* Create path */
		ArrayList<Point> path = new ArrayList<>();
		/* Find the path, give maze, row, col and path to inner function.
		 * If exists, return that path else return null */
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path)) {
			return path;
		}
		return null;
	}

	/**
	 * Method to get path brute force
	 * 
	 * @param maze
	 * @param row
	 * @param col
	 * @param path
	 * @return {@link boolean}
	 */
	private static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path) {
		/* If it's a invalid row or column or cell is off limit,
		 * return false, because no path exists */
		if (row < 0 || col < 0 || !maze[row][col]) {
			return false;
		}
		/* Check if we are standing at origin */
		boolean isAtOrigin = (row == 0) && (col == 0);
		/* If there is a path from start to here, add my location */
		if (isAtOrigin || getPath(maze, row, col - 1, path) || getPath(maze, row - 1, col, path)) {
			Point p = new Point(row, col);
			path.add(p);
			return true;
		}
		return false;
	}

	/**
	 * Method to get path when cells are off limit
	 * This is a optimized approach
	 * 
	 * @param maze
	 * @return {@link ArrayList<Point>}
	 */
	public static ArrayList<Point> getPath_Optimized(boolean[][] maze) {
		/* If invalid maze, return null */
		if (maze == null || maze.length == 0) {
			return null;
		}
		/* Define path and failed points. Failed points are the one, 
		 * where no calculation is needed, i.e we have already see them */
		ArrayList<Point> path = new ArrayList<>();
		HashSet<Point> failedPoints = new HashSet<>();
		/* Check if path exists */
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
			return path;
		}
		return null;
	}

	/**
	 * Method to get path optimized
	 * 
	 * @param maze
	 * @param row
	 * @param col
	 * @param path
	 * @param failedPoints
	 * @return {@link boolean}
	 */
	private static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
		/* If it's a invalid row or column or cell is off limit,
		 * return false, because no path exists */
		if (row < 0 || col < 0 || !maze[row][col]) {
			return false;
		}
		/* Find the current point and check if we have already visited it 
		 * and it is an offset point */
		Point p = new Point(row, col);
		if (failedPoints.contains(p)) {
			return false;
		}
		/* Check if we are at origin */
		boolean isAtOrigin = (row == 0) && (col == 0);
		/* If there is a path from start to here, add my location */
		if (isAtOrigin || getPath(maze, row, col - 1, path, failedPoints) || getPath(maze, row - 1, col, path, failedPoints)) {
			path.add(p);
			return true;
		}
		/* If not, cache the result */
		failedPoints.add(p);
		return false;
	}

	/**
	 * Public class Point
	 * 
	 * @author Deepak
	 */
	public static class Point {

		/* Variables to hold position of row and column */
		public int row, column;

		/**
		 * Constructor 
		 * 
		 * @param row
		 * @param column
		 */
		public Point (int row, int column) {
			this.row = row;
			this.column = column;
		}

		@Override
		public String toString() {
			return "(" + row + "," + column + ")";
		}

	}

}
