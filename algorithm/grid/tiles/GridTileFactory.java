package algorithm.grid.tiles;

import java.util.HashMap;
import java.util.Map;

import algorithm.grid.symbol.Symbol;

/**
 * GridTile Factory Returns TileType to supplied grid symbol
 * 
 * @author nkumar5
 * 
 */
public class GridTileFactory {
	/**
	 * Holds symbol->GridTile mappings
	 */
	private static Map<Symbol, GridTile> symbolTileMap = new HashMap<Symbol, GridTile>();
	// Initialize symbols to corresponding tile type
	static {
		GridTile flatTile = new FlatLandTile();
		GridTile forestTile = new ForestTile();
		GridTile mountainTile = new MountainTile();
		GridTile waterTile = new WaterTile();

		symbolTileMap.put(Symbol.DOT, flatTile);
		symbolTileMap.put(Symbol.AT, flatTile);
		symbolTileMap.put(Symbol.X, flatTile);

		symbolTileMap.put(Symbol.ASTERIX, forestTile);
		symbolTileMap.put(Symbol.CAP, mountainTile);

		symbolTileMap.put(Symbol.TILDE, waterTile);
	}

	/**
	 * Returns {@link GridTile} for matched symbol
	 * 
	 * @param symbol
	 *            grid symbol
	 * @return {@link GridTile}
	 */
	public GridTile getGridTile(final Symbol symbol) {
		return (GridTile) symbolTileMap.get(symbol);
	}
}
