package application;

import java.awt.Point;

import searches.BFS;
import searches.DFS;
import searches.Greedy;
import searches.Magic;
import searches.RandomWalk;

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
	public Point start;
	public Point goal;
	// instance variables for cross class communication
	public Maze myMaze;
	public MazeDisplay myMazeDisplay;
	// Instance variables moved over from the model and display
	public Greedy greedy;				
	public BFS bfs;
	public DFS dfs;
	public RandomWalk rand;
	public Magic magic;
	public String search = "";

	public MazeController(int rows, int cols) {
		// Initializing logic state
		int numRows = rows;
		int numColumns = cols;
		start = new Point(1,1);
		goal = new Point(numRows-2, numColumns-2);
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getGoal() {
		return goal;
	}

	public void setGoal(Point goal) {
		this.goal = goal;
	}

	public Maze getMyMaze() {
		return myMaze;
	}

	public void setMyMaze(Maze myMaze) {
		this.myMaze = myMaze;
	}

	public MazeDisplay getMyMazeDisplay() {
		return myMazeDisplay;
	}

	public void setMyMazeDisplay(MazeDisplay myMazeDisplay) {
		this.myMazeDisplay = myMazeDisplay;
	}

	public Greedy getGreedy() {
		return greedy;
	}

	public void setGreedy(Greedy greedy) {
		this.greedy = greedy;
	}

	public BFS getBfs() {
		return bfs;
	}

	public void setBfs(BFS bfs) {
		this.bfs = bfs;
	}

	public DFS getDfs() {
		return dfs;
	}

	public void setDfs(DFS dfs) {
		this.dfs = dfs;
	}

	public RandomWalk getRand() {
		return rand;
	}

	public void setRand(RandomWalk rand) {
		this.rand = rand;
	}

	public Magic getMagic() {
		return magic;
	}

	public void setMagic(Magic magic) {
		this.magic = magic;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	
}