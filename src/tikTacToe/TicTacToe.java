package tikTacToe;

import java.util.Scanner;

public class TicTacToe {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    printBoard(board);

    while (true){
      playerTurn(board, scanner);
      if (isGameFinished(board)){
        break;
      }
      printBoard(board);

      computerTurn(board);
      if (isGameFinished(board)){
        break;
      }
      printBoard(board);
    }
    scanner.close();
  }

  private static void computerTurn(char[][] board) {
  }

  private static boolean isGameFinished(char[][] board) {
  }

  private static void playerTurn(char[][] board, Scanner scanner) {
  }

  private static void printBoard(char[][] board) {
  }
}