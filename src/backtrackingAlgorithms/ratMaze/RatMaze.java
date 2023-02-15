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

  private static boolean solveMaze(int[][] maze) {
    int[][] sol = new int[N][N];
    if(solveMazeUtil(maze, 0, 0, sol) == false){
      System.out.println("Solution doesn't exist");
      return false;
    }
    printSolution(sol);
    return true;
  }

  private static void printSolution(int[][] sol) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.println(" " + sol[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static boolean solveMazeUtil(int[][] maze, int i, int i1, int[][] sol) {
  }
}
