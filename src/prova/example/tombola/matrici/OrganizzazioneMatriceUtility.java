package prova.example.tombola.matrici;

public abstract class OrganizzazioneMatriceUtility {

	public abstract int[] getRowColumnFromIndexV1(int index, int numberOfRows, int numberOfColumns);

	public abstract int[] getRowColumnFromIndexV2(int index, int numberOfRows);

	public abstract int getLinearIndexFromColumnMajor(int row, int column, int numberOfRows);

	public abstract int getLinearIndexFromRowColumn(int row, int column, int numberOfColumns);

	public static final OrganizzazioneMatriceUtility createUtility(OrganizzazioneMatrice org) {

		OrganizzazioneMatriceUtility utility = null;
		switch (org) {
		case ROW_MAJOR:
			utility = new RowMajorUtility();
			break;
		case COLUMN_MAJOR:
			utility = new ColumnMajorUtility();
			break;
		}
		return utility;
	}
}
