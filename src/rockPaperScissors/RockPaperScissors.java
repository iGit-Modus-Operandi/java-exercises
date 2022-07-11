package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true){
      String [] rps = {"rock", "paper", "scissors"};
      String computerMove = rps [new Random().nextInt(rps.length)];
      String playerMove;

      while (true){
        System.out.println("Please enter your move (rock, paper, scissors): ");
        playerMove = scanner.nextLine();
        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")){
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }

      System.out.println("Computer played: " + computerMove);


    }
  }
}
