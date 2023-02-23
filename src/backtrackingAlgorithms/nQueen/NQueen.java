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

  private boolean solveNQUtil(int[][] board, int i) {
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
