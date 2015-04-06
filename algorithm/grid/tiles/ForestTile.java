package algorithm.grid.tiles;

/**
 * Implementation of ForestTile
 * @author nkumar5
 *
 */
 class ForestTile implements GridTile{

	 /**
	  * Movement cost of this tile
	  */
	private static final int COST = 2;
	
	@Override
	public boolean isWalkable() {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}

	@Override
	public int getCost() {
		return COST;
	}

	@Override
	public String getDescription() {
		return "Forest";
	}

}
