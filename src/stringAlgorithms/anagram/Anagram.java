package stringAlgorithms.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your first word: ");
    String word1 = scanner.nextLine();

    System.out.print("Enter your second word: ");
    String word2 = scanner.nextLine();

    if (word1.length() != word2.length()){
      System.out.println("Your given words are not anagrams");
    }

    char[] w1 = word1.toCharArray();
    char[] w2 = word2.toCharArray();

    Arrays.sort(w1);
    Arrays.sort(w2);

    Arrays.equals(w1, w2);
    System.out.println("Your given words are anagrams");
  }
}

