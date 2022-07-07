package sudoku;

public class Sudoku {

  private static final int GRID_SIZE = 9;

  public static void main(String[] args) {
    int[][] board = {
        {7, 0, 2, 0, 5, 0, 6, 0, 0},
        {0, 0, 0, 0, 0, 3, 0, 0, 0},
        {1, 0, 0, 0, 0, 9, 5, 0, 0},
        {8, 0, 0, 0, 0, 0, 0, 9, 0},
        {0, 4, 3, 0, 0, 0, 7, 5, 0},
        {0, 9, 0, 0, 0, 0, 0, 0, 8},
        {0, 0, 9, 7, 0, 0, 0, 0, 5},
        {0, 0, 0, 2, 0, 0, 0, 0, 0},
        {0, 0, 7, 0, 4, 0, 2, 0, 3}
    };

    printBoard(board);

    if (solvedBoard(board)) {
      System.out.println("Solved successfully!");
    } else {
      System.out.println("Unsolvable board :(");
    }

    printBoard(board);
  }

  private static boolean solvedBoard(int[][] board) {
    for (int row = 0; row < GRID_SIZE; row++){
      for (int column = 0; column < GRID_SIZE; column++){
        if (board [row][column] == 0){
          for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++){
            if (isValidPlacement(board, numberToTry, row column)){
              board [row][column] = numberToTry;

              if (solvedBoard(board)){
                return true;
              }
              else {
                board [row][column] = 0;
              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  private static void printBoard(int[][] board) {
    for (int row = 0; row < GRID_SIZE; row++){
      if (row % 3 == 0 && row != 0){
        System.out.println("-----------");
      }
      for (int column = 0; column < GRID_SIZE; column++){
        if (column % 3 == 0 && column != 0){
          System.out.println("|");
        }
        System.out.println(board [row][column]);
      }
      System.out.println();
    }
  }
}
