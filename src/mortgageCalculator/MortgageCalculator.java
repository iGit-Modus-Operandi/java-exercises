package mortgageCalculator;

import java.util.Scanner;

public class MortgageCalculator {

  public static void main(String[] args) {
    int principal;
    double interestRate;
    int period;
    double mortgage;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal: ");
    principal = scanner.nextInt();

    System.out.print("Annual Interest Rate (%): ");
    interestRate = scanner.nextDouble();

    System.out.print("Period (Years): ");
    period = scanner.nextInt();

//    mortgage = principal * ((interestRate((1 + interestRate)^period)) / (((1 + interestRate)^period) - 1));
//    System.out.println("Mortgage: " + mortgage);
  }
}
