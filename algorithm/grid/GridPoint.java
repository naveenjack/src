package algorithm.grid;

import algorithm.grid.symbol.Symbol;
import algorithm.grid.tiles.GridTile;

/**
 * Provides implementation for {@link GPoint} interface
 * 
 * @author nkumar5
 * 
 */
public class GridPoint implements GPoint {

	/**
	 * GridPoint row position in the grid
	 */
	private int row;
	/**
	 * GridPoint column position in the grid
	 */
	private int col;
	/**
	 * Symbol in the grid point
	 */
	private Symbol symbol;
	/**
	 * Type of grid tile
	 */
	private GridTile tile;

	/**
	 * Constructs GridPoint
	 * 
	 * @param row
	 *            position in the grid
	 * @param col
	 *            column position in the gird
	 * @param symbol
	 *            in the grid point
	 * @param tile
	 *            type of grid point
	 */
	public GridPoint(final int row, final int col, final Symbol symbol,
			final GridTile tile) {
		this.row = row;
		this.col = col;
		this.symbol = symbol;
		this.tile = tile;
	}

	/**
	 * Returns grid point x/row position
	 */
	public int getXPos() {
		return row;
	}

	/**
	 * Returns grid point y/column position
	 */
	public int getYPos() {
		return col;
	}

	/**
	 * Returns symbol in the grid point
	 */
	public Symbol getSymbol() {
		return symbol;
	}

	/**
	 * Returns type of tile
	 */
	public GridTile getTile() {
		return tile;
	}

	@Override
	public String toString() {
		String summary = "row = " + row + " col=" + col + " symbol=" + symbol;
		return summary;
	}
}
