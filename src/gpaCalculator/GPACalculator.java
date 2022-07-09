package gpaCalculator;

import java.util.Scanner;

public class GPACalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Integer totalPoints = 0;
    Integer totalCredits = 0;

    boolean moreClasses = false;

    do {
      Integer credits = 0;
      boolean validCredits = true;
      do {
        validCredits = true;

        System.out.println("Enter number of credits: ");
        String creditString = scanner.nextLine();

        try {
          credits = Integer.parseInt(creditString);
        }
        catch (NumberFormatException nfe){
          System.out.println("Enter a valid integer");
          validCredits = false;
        }
      }
      while (!validCredits);

      boolean validGrade = true;

    }
    while (moreClasses);
  }
}
