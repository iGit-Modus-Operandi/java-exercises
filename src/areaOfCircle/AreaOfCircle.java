package areaOfCircle;

import java.util.Scanner;

public class AreaOfCircle {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius value: ");
    double radius = scanner.nextDouble();

    System.out.println("Area of the circle equals " + (Math.PI * Math.pow(radius, 2)));
  }
}
