package algorithm.grid;

/**
 * Grid Interface Defines Grid methods
 * 
 * @author nkumar5
 * 
 */
public interface GGrid {

	/**
	 * Returns number of rows in the grid
	 * 
	 * @return number of rows
	 */
	int getNumRows();

	/**
	 * Returns number of columns in the grid
	 * 
	 * @return number of columns
	 */
	int getNumCols();

	/**
	 * Returns Grid Point based on the (x,y) position of the grid
	 * 
	 * @param row
	 *            grid row position
	 * @param col
	 *            grid column position
	 * @return
	 */
	GPoint getGridPoint(final int row, final int col);

}
