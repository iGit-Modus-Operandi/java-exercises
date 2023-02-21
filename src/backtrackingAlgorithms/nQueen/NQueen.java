package backtrackingAlgorithms.nQueen;

public class NQueen {

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
  }


}
