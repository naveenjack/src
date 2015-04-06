package algorithm.grid;

/**
 * Implements Grid interface Provides methods to access grid data
 * 
 * @author nkumar5
 * 
 */
public class Grid implements GGrid {

	/**
	 * Number of rows in the grid
	 */
	private int numRows;
	/**
	 * Number of columns in the grid
	 */
	private int numCols;
	/**
	 * Holds the grid elements
	 */
	private GPoint[][] gridPoints;

	/**
	 * Constructs Grid instance
	 * 
	 * @param numRows
	 *            number of rows in the grid
	 * @param numCols
	 *            number of columns in the grid
	 * @param points
	 *            grid points
	 */
	public Grid(final int numRows, final int numCols, final GPoint[][] points) {
		this.numRows = numRows;
		this.numCols = numCols;
		this.gridPoints = points;
	}

	/**
	 * Returns {@link GPoint} at (x,y) position in the grid
	 */
	public GPoint getGridPoint(final int x, final int y) {
		GPoint point = null;
		if (isValidPoint(x, y)) {
			point = gridPoints[x][y];
		}
		return point;
	}

	/**
	 * Checks if supplied x,y position is valid.
	 * 
	 * @param x
	 *            position in the grid
	 * @param y
	 *            position in the grid
	 * @return true/false
	 */
	boolean isValidPoint(final int x, final int y) {
		return ((x >= 0 && x <= (numRows - 1)) && (y >= 0 && y <= (numCols - 1)));

	}

	/**
	 * Returns number of rows in the grid
	 */
	public int getNumRows() {
		return numRows;
	}

	/**
	 * Returns number of columns in the grid
	 */
	public int getNumCols() {
		return numCols;
	}
}
