package mathAlgorithms.factorial;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int userInput = scanner.nextInt();

    System.out.println("The factorial of " + userInput + " is equalt to " + factorial(userInput));
  }

  private static int factorial(int userInput) {
    if (userInput == 0){
      return 1;
    }
    return userInput * factorial(userInput - 1);
  }
}
