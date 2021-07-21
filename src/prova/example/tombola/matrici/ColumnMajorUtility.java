package prova.example.tombola.matrici;

public class ColumnMajorUtility extends OrganizzazioneMatriceUtility{

	public int[] getRowColumnFromIndexV1(int index, int numberOfRows, int numberOfColumns) {
		int row = index % numberOfRows;
		int column = (index / numberOfRows) % numberOfColumns;
		return new int[] { row, column };
	}

	/**
	 * @see https://stackoverflow.com/questions/1817631/iterating-one-dimension-array-as-two-dimension-array
	 * @param index
	 * @param numberOfRows
	 * @return
	 */
	public int[] getRowColumnFromIndexV2(int index, int numberOfRows) {
		int row = index % numberOfRows;
		int column = (index - row) / numberOfRows;
		return new int[] { row, column };
	}

	/**
	 * @see https://stackoverflow.com/questions/1817631/iterating-one-dimension-array-as-two-dimension-array
	 *      <p>
	 *      If you want row-major order, given row rowIndex, column columnIndex and
	 *      are faking (for lack of a better term) a two-dimensional array with
	 *      numberOfColumns columns, the formula is
	 * 
	 *      <pre>
	 * <code>rowIndex * numberOfColumns + columnIndex</code>
	 *      </pre>
	 * 
	 *      If you want row-major order, given row rowIndex, column columnIndex and
	 *      are faking (for lack of a better term) a two-dimensional array with
	 *      numberOfRow rows, the formula is
	 * 
	 *      <pre>
	 * <code>columnIndex * numberOfRows + rowIndex</code>
	 *      </pre>
	 *      </p>
	 * @param row
	 * @param column
	 * @param numberOfRows
	 * @return
	 */
	public int getLinearIndexFromColumnMajor(int row, int column, int numberOfRows) {
//		return column * numberOfRows + row;
		throw new RuntimeException("Method not implemented");
	}

	@Override
	public int getLinearIndexFromRowColumn(int row, int column, int numberOfColumns) {
		// TODO Auto-generated method stub
		return 0;
	}
}
