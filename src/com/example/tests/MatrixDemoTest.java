package com.example.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.linguaggio.MatrixDemo;

import prova.example.tombola.matrici.RowMajorUtility;

class MatrixDemoTest {

	private static final int REFERENCE_VALUE = 8;
	private static final int REFERENCE_ROW_VALUE = 1;
	private static final int REFERENCE_COLUM_VALUE = 2;
	private static final int REFERENCE_INDEX = 7;
	private static final int NUMBER_OF_ROWS = 4;
	private static final int NUMBER_OF_COLUMNS = 5;
	private static final int x = 0;
	private static final int y = 1;

//	@Test
//	void fromIndexToXYVy() {
//		RowMajorUtility md = new RowMajorUtility();
//		int[] rowCol = md.getRowColumnFromIndexV1(REFERENCE_INDEX, NUMBER_OF_ROWS, NUMBER_OF_COLUMNS);
//		// risultato atteso [y,2]
//		assertEquals(REFERENCE_ROW_VALUE, rowCol[x]);
//		assertEquals(REFERENCE_COLUM_VALUE, rowCol[y]);
//		// risulatato atteso 8
//		assertEquals(md.getValue(rowCol[x], rowCol[y]), REFERENCE_VALUE);
//	}

//	void fromIndexToXYV2() {
//		MatrixDemo md = new MatrixDemo();
//		int[] rowCol = md.getRowColumnFromIndexRowMajorV2(REFERENCE_INDEX, NUMBER_OF_COLUMNS);
//		// risultato atteso [y,2]
//		assertEquals(REFERENCE_ROW_VALUE, rowCol[x]);
//		assertEquals(REFERENCE_COLUM_VALUE, rowCol[y]);
//		// risulatato atteso 8
//		assertEquals(md.getValue(rowCol[x], rowCol[y]), REFERENCE_VALUE);
//	}

//	void fromXYToIndex() {
//		MatrixDemo md = new MatrixDemo();
//		int linearIndex = md.getLinearIndexFromRowMajor(REFERENCE_ROW_VALUE, REFERENCE_COLUM_VALUE, NUMBER_OF_COLUMNS);
//		// risulatato atteso 7
//		assertEquals(REFERENCE_INDEX, linearIndex);
//	}
}