package mathAlgorithms.multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number = scanner.nextInt();

    for (int i = 0; i <= 10; i++){
      System.out.println(number + " * " + i + " = " + (number * i));
    }

    scanner.close(); // make it a habit to close scanner after use
  }
}
