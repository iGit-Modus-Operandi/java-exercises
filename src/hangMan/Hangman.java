package hangMan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("1 or 2 players?");
    String players = keyboard.nextLine();

    String word;

    if (players.equals("1")){
      Scanner scanner = new Scanner(new File(""));

      List<String> words = new ArrayList<>();

      while (scanner.hasNext()){
        words.add(scanner.nextLine());
      }

      Random random = new Random();
      word = words.get(random.nextInt(words.size()));
    }
    else{
      System.out.print("Player 1, please enter your word: ");
      word = keyboard.nextLine();
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Ready for player 2! Good luck");
    }

  }
}