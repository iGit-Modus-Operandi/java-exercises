/*
 * Weight (kg) Height (m) ^2
 * Weight (lb) Height (in) ^2 * 703
 */
package bmiCalculator;

import java.util.Scanner;

public class BMICalculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your weight in pounds: ");
    double weight = scanner.nextDouble();

    System.out.print("Enter your height in inches: ");
    double height = scanner.nextDouble();

  }
}
