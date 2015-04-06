package algorithm.grid;

import algorithm.grid.symbol.Symbol;
import algorithm.grid.tiles.GridTile;

/**
 * Define interface for accessing grid points
 * 
 * @author nkumar5
 * 
 */
public interface GPoint {

	/**
	 * Returns X position of the grid element/point
	 * 
	 * @return X value
	 */
	int getXPos();

	/**
	 * Returns X position of the grid element/point
	 * 
	 * @return Y value
	 */
	int getYPos();

	/**
	 * Returns symbol of the grid point/element
	 * 
	 * @return symbol
	 */
	Symbol getSymbol();

	/**
	 * Returns grid tile type
	 * 
	 * @return grid tile type
	 */
	GridTile getTile();

}
