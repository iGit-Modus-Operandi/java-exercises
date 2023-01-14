package mathAlgorithms.leonardoNumbers;

import java.util.Scanner;

public class LeonardoNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    int result = leonardoNumber(userInput);

    System.out.println(result);
  }

  private static int leonardoNumber(int userInput) {
    if (userInput == 0 || userInput == 1){
      return 1;
    }
    return ((leonardoNumber(userInput - 1) + leonardoNumber(userInput - 2)) + 1);
  }

}
