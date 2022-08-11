package mathAlgorithms.leastCommonMultiple;

import java.util.Scanner;

public class LCM {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first value: ");
    int firstValue = scanner.nextInt();

    System.out.print("Enter second value: ");
    int secondValue = scanner.nextInt();

    System.out.println(
        "The LCM of " + firstValue + " and " + secondValue + " is " + leastCommonMultiple(
            firstValue, secondValue));
  }

  private static int leastCommonMultiple(int firstValue, int secondValue) {
    int lcm = (firstValue / greatestCommonDenominator(firstValue, secondValue)) * secondValue;
    return lcm;
  }

  private static int greatestCommonDenominator(int firstValue, int secondValue) {
    if (firstValue == 0) {
      return secondValue;
    }
    int gcd = greatestCommonDenominator((secondValue % firstValue), firstValue);
    return gcd;
  }
}
