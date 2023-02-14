package backtrackingAlgorithms.ratMaze;

public class RatMaze {

  private static int N;

  public static void main(String[] args) {
//    Ratmaze rat = new RatMaze();
    int[][] maze = {{1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}};
    N = maze.length;
    solveMaze(maze);
  }

  private static void solveMaze(int[][] maze) {
    int[][] sol = new int[N][N];
    if(solveMazeUtil();)
  }
}
