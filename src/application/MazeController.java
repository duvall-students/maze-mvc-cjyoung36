package application;

import java.awt.Point;

import searches.BFS;
import searches.DFS;
import searches.Greedy;
import searches.Magic;
import searches.RandomWalk;
import searches.SearchAlgorithm;
import searches.SearchFactory;

/**
 * 
 * @author christopherjyoung
 *
 *	This class will hold the Maze model and controller logic
 *
 *	What to do:
 *	- Create a new class in the “application” folder and name it MazeController.
 *	- Move the instance variables that are application-specific (that is, not shapes and buttons) into the controller.  
 *	  In particular, the Maze, start and end points, and search algorithms all should be moved.
 *	- Add a “MazeController” instance variable to the MazeDisplay.
 *	- In the MazeDisplay’s constructor, initialize the MazeController variable  by calling its constructor.  
 *    I passed the number of rows and columns as arguments to the MazeController, but I did not store them there since 
 *    they are stored in the MazeController.
 *	- Finally, move the methods that work on those instance variables over to the controller.  
 *	  Each time you move a method, replace it with a call to the controller’s method.
 */


public class MazeController {
	// Where to start and stop the search
	private Point start;
	private Point goal;
	
	private boolean paused = false;
	
	// instance variables for cross class communication
	public Maze myMaze;
	public MazeDisplay myMazeDisplay;
	public SearchFactory myFactory;
	
	// Instance variables moved over from the model and display
	private Greedy greedy;				
//	private BFS bfs;
//	private DFS dfs;
//	private RandomWalk rand;
	private Magic magic;
	
//	public String search = "";
	private SearchAlgorithm search;

	public MazeController(int rows, int cols, MazeDisplay display) {
		myMazeDisplay = display;
		start = new Point(1, 1);
		goal = new Point(rows - 2, cols - 2);
		myMaze = new Maze(rows, cols);
		myFactory = new SearchFactory();
	}

	public void step(double elapsedTime) {
		if (!paused) {
			doOneStep(elapsedTime);
		}
	}
	
	public void doOneStep(double elapsedTime) {
		if (search != null) {
			search.step();
			myMazeDisplay.redraw();
		}
	}

	public void startSearch(String searchType) {
		search = myFactory.makeSearch(searchType, myMaze, start, goal);
	}
	
	public int getCellState(Point position) {
		return myMaze.get(position);
	}
	
	public Maze getMaze() {
		return myMaze;
	}
	
}