package com.example.linguaggio;

/**
 * @see https://en.wikipedia.org/wiki/Row-_and_column-major_order
 * @see https://stackoverflow.com/questions/12429492/how-to-convert-a-monodimensional-index-to-corresponding-indices-in-a-multidimens
 * @author paolo
 *
 */
public class MatrixDemo extends Object {
	private int[][] matrix = { 
			{  1,  2,  3,  4,  5 }, 
			{  6,  7,  8,  9, 10 }, 
			{ 11, 12, 13, 14, 15 }, 
			{ 16, 17, 18, 19, 20 }
		};
	
	public int getValue(int row, int column) {
		return matrix[row][column];
	}
	
}