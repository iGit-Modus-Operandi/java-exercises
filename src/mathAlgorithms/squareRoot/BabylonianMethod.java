/*
 * CONDITION: Given an input from the user, userInput, find the square root of userInput
 * TIME COMPLEXITY: O(n^(1/2))
 * AUXILIARY SPACE: O(1)
 * SOLUTION:
 * 1. Start with an arbitrary positive start value x.
 * 2. Initialize y = 1.
 * 3. Get the next approximation for root using average of x and y
 * 4. Set y = userInput/x
 * 5. Repeat step 3 and 4 until desired approximation is achieved.
 */

package mathAlgorithms.squareRoot;

import java.util.Scanner;

public class BabylonianMethod {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int userInput = scanner.nextInt();
    
    squareRoot(userInput);
  }

  private static float squareRoot(int userInput) {
    float x = userInput;
    float y = 1;
    //TODO: replace this variable names

    double accuracyLevel = 0.000001;
    while ((x - y) > accuracyLevel){
      x = (x + y) / 2;
      y = userInput / x;
    }
    return x;
  }
}
