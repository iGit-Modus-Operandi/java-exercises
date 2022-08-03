package mathAlgorithms.factorial;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int userInput = scanner.nextInt();

    System.out.println("The factorial of " + userInput + " is equalt to " + factorial(userInput));
  }

  private static String factorial(int userInput) {
  }
}
