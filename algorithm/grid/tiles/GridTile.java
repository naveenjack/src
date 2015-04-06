package algorithm.grid.tiles;

/**
 * Defines interface methods for Grid Tile
 * 
 * @author nkumar5
 * 
 */
public interface GridTile {

	/**
	 * Returns true if tile is walkable
	 * 
	 * @return boolean true/false
	 */
	public boolean isWalkable();

	/**
	 * Returns movement cost of the tile
	 * 
	 * @return
	 */
	public int getCost();

	/**
	 * Description of the tile
	 * 
	 * @return description
	 */
	public String getDescription();
}
