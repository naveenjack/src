package algorithm.grid.demo;

import java.util.ArrayList;
import java.util.List;

import algorithm.grid.GGrid;
import algorithm.grid.algorithms.AStarAlgorithm;
import algorithm.grid.builder.DirectedGraphBuilder;

public class GridBuilderDemo {

	public static void main(String[] args) {
		String row1 = "@*^^^";
		String row2 ="~~*~.";
		String row3 = "**...";
		String row4 = "^..*~";
		String row5 = "~~*~X";
		
		List<String> pointList = new ArrayList<String>();
		pointList.add(row1);
		pointList.add(row2);
		pointList.add(row3);
		pointList.add(row4);
		pointList.add(row5);
		DirectedGraphBuilder builder = new DirectedGraphBuilder();
		builder.parseElements(pointList);
		GGrid grid = builder.buildGraph();
		
		//Algorithm
		AStarAlgorithm algorithm = new AStarAlgorithm();
		algorithm.search(grid, "@", "X");
		
	}
}
