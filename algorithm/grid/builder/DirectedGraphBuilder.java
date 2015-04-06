package algorithm.grid.builder;

import java.util.List;

import algorithm.grid.GGrid;
import algorithm.grid.GPoint;
import algorithm.grid.Grid;
import algorithm.grid.GridPoint;
import algorithm.grid.symbol.Symbol;
import algorithm.grid.tiles.GridTileFactory;
import algorithm.grid.tiles.GridTile;

/**
 * Parses and constructs DirectedGraph
 * @author nkumar5
 *
 */
public class DirectedGraphBuilder implements GraphBuilder {

	private final GridTileFactory gridTileFactory = new GridTileFactory();
	private int numRows;
	private int numCols;
	private GPoint[][] gridPoints = null;

	@Override
	public void parseElements(final List<String> points) {
		System.out.println("in parseElement" + points);
		//calculate number of rows in the grid
		numRows = points.size();
		int row = 0;
		//Parse row by row
		for (String point : points) {
			System.out.println("parseElements : point=" + point);
			//calculate number of columns in the grid
			numCols = point.length();
			if (gridPoints == null) {
				gridPoints = new GPoint[numRows][numCols];
			}
			
			// Parse each value in the row
			for (int i = 0; i < point.length(); i++) {
				String vertex = Character.toString(point.charAt(i));
				System.out.println("parseElements s=" + vertex + " row=" + row
						+ " col=" + i);
				//Build GridPoint with required fields
				GPoint gpoint = buildGridPoint(vertex, row, i);
				gridPoints[row][i] = gpoint;
			}
			row++;
		}

	}

	/**
	 * 
	 * @param vertex
	 * @param row
	 * @param col
	 * @return
	 */
	GPoint buildGridPoint(final String vertex, final int row, final int col) {
		Symbol symbol = Symbol.valueFromSymbol(vertex);
		GridTile tile = gridTileFactory.getGridTile(symbol);
		System.out.println("buildGridPoint:  symbol=" + symbol + " tile="
				+ tile);
		if (symbol == null || tile == null) {
			throw new NullPointerException("Cannot find symbol in the grid");
		}
		return new GridPoint(row, col, symbol, tile);
	}

	@Override
	public GGrid buildGraph() {
		return new Grid(numRows, numCols, gridPoints);
	}

}
