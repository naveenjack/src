package algorithm.grid.tiles;

/**
 * Implementation for Mountain tile
 * 
 * @author nkumar5
 * 
 */
class MountainTile implements GridTile {

	/**
	 * Movement cost of this tile
	 */
	private static final int COST = 3;

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
		return "Mountain";
	}

}
