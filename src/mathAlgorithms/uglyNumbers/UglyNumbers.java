package mathAlgorithms.uglyNumbers;

import java.util.Scanner;

public class UglyNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int userInput = scanner.nextInt();

    int uglyNumber = getUglyNumbers(userInput);

    System.out.println("The " + userInput + "th ugly number is " + uglyNumber);
  }

  private static int getUglyNumbers(int userInput) {
    return 0;
  }
}
