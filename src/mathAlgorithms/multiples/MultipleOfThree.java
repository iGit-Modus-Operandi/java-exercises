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
    int oddCount = 0;
    int evenCount = 0;

    if (userInput < 0){
      userInput = -userInput;
    }

    if (userInput == 0){
      return 1;
    }

    if (userInput == 1){
      return 0;
    }

    while (userInput != 0){
      if ((userInput & 1) != 0){
        oddCount++;
      }

      if ((userInput & 2) != 0){
        evenCount++;
      }

      userInput = userInput >> 2;
    }

    return isMultipleOfThree(Math.abs(oddCount - evenCount));
  }
}
