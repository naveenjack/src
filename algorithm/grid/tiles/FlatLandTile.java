package algorithm.grid.tiles;

/**
 * Implementation of FlatLandTile
 * 
 * @author nkumar5
 * 
 */
class FlatLandTile implements GridTile {

	/**
	 * Movement cost of this tile
	 */
	private static final int COST = 2;

	@Override
	public boolean isWalkable() {
		return Boolean.TRUE;
	}

	@Override
	public int getCost() {
		return COST;
	}

	@Override
	public String getDescription() {
		return "FlatLand";
	}

}
