package scrabbleSolver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScrabbleSolver {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the pool of letters: ");
    String letters = scanner.nextLine().toUpperCase();

    Map <Character, Integer> lettersCountMap = new getCharacterCountMap(letters);

  }

  private static Map <Character, Integer> getCharacterCountMap (String letters){
    Map <Character, Integer> lettersCountMap = new HashMap<>();

    for (int i = 0; i < letters.length(); i++){
      char currentChar = letters.charAt(i);
      int count = lettersCountMap.containsKey(currentChar) ?
          lettersCountMap.get(currentChar) : 0;
      lettersCountMap.put(currentChar, count + 1);
    }
    return lettersCountMap;
  }
}
