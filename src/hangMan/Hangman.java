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
    else {
      System.out.print("Player 1, please enter your word: ");
      word = keyboard.nextLine();
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("Ready for player 2! Good luck");
    }

    List<Character> playerGuesses = new ArrayList<>();
    Integer wrongCount = 0;

    while (true){
      printHangedMan(wrongCount);

      if (wrongCount >= 6){
        System.out.println("You lose!");
        System.out.println("The word was: " + word);
        break;
      }

      printWordState (word, playerGuesses);

      if (!getPlayerGuess(keyboard, word, playerGuesses)){
        wrongCount++;
      }

      if (printWordState(word, playerGuesses)){
        System.out.println("You win!");
        break;
      }

      System.out.print("Please enter your guess for the word: ");
      if (keyboard.nextLine().equals(word)){
        System.out.println("You win!");
        break;
      }
      else {
        System.out.println("Nope! try again.");
      }
    }
  }

  private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
  }

  private static boolean printWordState(String word, List<Character> playerGuesses) {
  }

  private static void printHangedMan(Integer wrongCount) {
  }
}