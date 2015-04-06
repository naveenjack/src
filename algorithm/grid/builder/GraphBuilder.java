package algorithm.grid.builder;

import java.util.List;

import algorithm.grid.GGrid;

/**
 * Define interface/methods to build a graph
 * 
 * @author nkumar5
 * 
 */
public interface GraphBuilder {

	/**
	 * Parses elements of a graph
	 * 
	 * @param points
	 *            list of graph points/vertex
	 */
	void parseElements(List<String> points);
	
	/**
	 * Constructs and returns the graph
	 * @return GGrid
	 */
	GGrid buildGraph();
}
