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
