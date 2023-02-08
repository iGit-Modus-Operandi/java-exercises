package backtrackingAlgorithms.knightsTour;

public class KnightsTour {

  private static int N = 8;

  public static void main(String[] args) {
    solveKnightsTour();
  }

  private static boolean solveKnightsTour() {
    int[][] sol = new int[8][8];

    for (int x = 0; x < N; x++) {
      for (int y = 0; y < N; y++) {
        sol[x][y] = -1;
      }
    }

    int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
    int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

    sol[0][0] = 0;

    if(!solveKTUtil(0, 0, 1, sol, xMove, yMove)){
      System.out.println("Solution does not exist");
      return false;
    } else {
      printSolution(sol);
    }
    return true;
  }

  private static boolean solveKTUtil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove) {
    int k, next_x, next_y;
    if (movei == N * N){
      return true;
    }
    for (int k = 0; k < 8; k++) {
      next_x = x + xMove[k];
      next_y = y + yMove[k];

    }
  }

  private static void printSolution(int[][] sol) {
  }
}
