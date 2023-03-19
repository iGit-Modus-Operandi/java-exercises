package backtrackingAlgorithms.nQueen;

public class NQueen {

  private final int N = 4;
  public static void main(String[] args) {
    NQueen Queen = new NQueen();
    Queen.solveNQ();
  }

  private boolean solveNQ() {
    int board[][] = {{0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}};
    if(solveNQUtil(board, 0) == false){
      System.out.println("Solution does not exist");
      return false;
    }
    
    printSolution(board);
    return true;
  }

  private boolean solveNQUtil(int[][] board, int col) {
    if (col > N){
      return true;
    }
    for (int i = 0; i < N; i++) {
      if (isSafe(board, i, col)){
        board[i][col] = 1;

        if(solveNQUtil(board, col + 1)){
          return true;
        }

        board[i][col] = 0;
      }
    }
    return false;
  }

  private boolean isSafe(int[][] board, int i, int col) {
  }

  private void printSolution(int[][] board) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.println(" " + board[i][j] + " ");
      }
      System.out.println();
    }
  }


}
