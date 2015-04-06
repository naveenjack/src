package algorithm.grid.tiles;

/**
 * Implementation of Water tile
 * @author nkumar5
 *
 */
class WaterTile implements GridTile {

	@Override
	public boolean isWalkable() {
		return Boolean.FALSE;
	}

	@Override
	public int getCost() {
		new UnsupportedOperationException("N/A for Water Tile");
		return -1;
	}

	@Override
	public String getDescription() {
		return "Water";
	}

}
