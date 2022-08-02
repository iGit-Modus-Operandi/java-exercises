package mathAlgorithms.multiples;

import java.util.Scanner;

public class MultipleOfThree {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    if (isMultipleOfThree(userInput) != 0){
      System.out.println(userInput + " is a multiple of 3.");
    } else {
      System.out.println(userInput + " is not a multiple of 3.");
    }
  }

  private static int isMultipleOfThree(int userInput) {
  }
}
