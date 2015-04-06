package algorithm.grid.algorithms;

import java.util.ArrayList;
import java.util.List;

import algorithm.grid.GGrid;
import algorithm.grid.GPoint;
import algorithm.grid.symbol.Symbol;

/**
 * Searches shortest path using Manhattan algorithm
 * @author nkumar5
 *
 */
public class AStarAlgorithm {
	/**
	 * Holds grid instance
	 */
	GGrid grid;
	/**
	 * Ending/target grid point
	 */
	GPoint endingPoint;
	/**
	 * List of shortest path GridPoint
	 */
	List<GPoint> shortestPath = new ArrayList<GPoint>();

	public void search(final GGrid grid, final String startSymbol,
			final String endSymbol) {
		this.grid = grid;
		Symbol sSymbol = Symbol.valueFromSymbol(startSymbol);
		Symbol eSymbol = Symbol.valueFromSymbol(endSymbol);
		GPoint startingPoint = findPoint(sSymbol);
		endingPoint = findPoint(eSymbol);

		List<GPoint> adjacentPoints = getAdjacentPoint(startingPoint);
		GPoint shortestPoint = findShortestPoint(adjacentPoints);
		// TODO : Need to repeatedly/recursively calculate shortest point and add the points to shortestPath list
	}

	/**
	 * Finds shortest/cost effective GridPoit among all adjacent GridPoint
	 * @param adjacentPoints list of adjacent points
	 * @return
	 */
	GPoint findShortestPoint(final List<GPoint> adjacentPoints) {
		int shortestCost = -1;
		GPoint shortestPoint = null;
		for (GPoint point : adjacentPoints) {
			if (point.getTile().isWalkable()) {
				int cost = calculateCost(point);
				if (shortestCost == -1) {
					shortestCost = cost;
					shortestPoint = point;
				} else if (cost < shortestCost) {
					shortestCost = cost;
					shortestPoint = point;
				}
				System.out.println("effective cost is " + cost);
			}
		}
		return shortestPoint;
	}

	/**
	 * Calculates the distance from GridPoint to ending point
	 * @param point
	 * @return
	 */
	int calculateCost(final GPoint point) {
		System.out.println("calculateCost: (x1,y1)" + point.getXPos() + ","
				+ point.getYPos() + " symbol=" + point.getSymbol());
		System.out.println("calculateCost: (x2,y2)" + endingPoint.getXPos()
				+ "," + endingPoint.getYPos() + "symbol="
				+ endingPoint.getSymbol());
		int cost = Math.abs(point.getXPos() - endingPoint.getXPos())
				+ Math.abs(point.getYPos() - endingPoint.getYPos());
		return cost;
	}

	/**
	 * Finds starting/ending point 
	 * @param startSymbol
	 * @return
	 */
	GPoint findPoint(Symbol symbol) {
		GPoint targetPoint = null;
		int rows = grid.getNumRows();
		int cols = grid.getNumCols();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				GPoint currentPoint = grid.getGridPoint(i, j);
				System.out.println("currentPoint=" + currentPoint);
				System.out.println("Symbol is =" + symbol);
				if (currentPoint != null
						&& currentPoint.getSymbol().equals(symbol)) {
					targetPoint = currentPoint;
					break;
				}
			}
			if (targetPoint != null) {
				break;
			}
		}
		return targetPoint;
	}

	
	/**
	 * Finds the adjacent points of given GridPoint
	 * @param currentPoint current GridPoint
	 * @return list of adjacent GridPoint
	 */
	List<GPoint> getAdjacentPoint(final GPoint currentPoint) {
		List<GPoint> adjacentPoints = new ArrayList<GPoint>();
		int currentRow = currentPoint.getXPos();
		int currentCol = currentPoint.getYPos();

		// rightAdjacent Point
		int rightAdjacentX = currentRow;
		int rightAdjacentY = currentCol + 1;

		// leftAdjacent Point
		int leftAdjacentX = currentRow;
		int leftAdjacentY = currentCol - 1;

		// topAdjacentPoint
		int topAdjacentX = currentRow - 1;
		int topAdjacentY = currentCol;

		// Bottom Adjacent Point
		int bottomAdjacentX = currentRow + 1;
		int bottomAdjacentY = currentCol;

		addToPointList(rightAdjacentX, rightAdjacentY, adjacentPoints);
		addToPointList(leftAdjacentX, leftAdjacentY, adjacentPoints);
		addToPointList(topAdjacentX, topAdjacentY, adjacentPoints);
		addToPointList(bottomAdjacentX, bottomAdjacentY, adjacentPoints);

		return adjacentPoints;
	}

	/**
	 * Adds (xPos,yPos) GridPoint to pointList if given (xPos,yPos) are valid
	 * @param xPos in the grid
	 * @param yPos in the grid
	 * @param pointList list GridPoint
	 */
	void addToPointList(int xPos, int yPos, List<GPoint> pointList) {
		GPoint point = grid.getGridPoint(xPos, yPos);
		if (point != null) {
			pointList.add(point);
		}
	}
}
