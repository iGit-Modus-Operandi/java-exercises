package tikTacToe;

import java.util.Random;
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
    Random random = new Random();
    int computerMove;
    while(true){
      computerMove = random.nextInt(9) + 1;
      if (isValidMove(board, Integer.toString(computerMove))){
        break;
      }
    }
    System.out.println("Computer chose " + computerMove);
    placeMove(board, Integer.toString(computerMove), '0');
  }

  private static void placeMove(char[][] board, String toString, char c) {
  }

  private static boolean isValidMove(char[][] board, String toString) {
  }

  private static boolean isGameFinished(char[][] board) {
  }

  private static void playerTurn(char[][] board, Scanner scanner) {
  }

  private static void printBoard(char[][] board) {
  }
}