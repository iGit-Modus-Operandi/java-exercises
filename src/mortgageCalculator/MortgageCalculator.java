package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal: ");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest Rate: ");
    double annualInterest = scanner.nextDouble();
    double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

    System.out.print("Period (Years): ");
    byte period = scanner.nextByte();
    int numberOfPayments = period * MONTHS_IN_YEAR;

    double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);//TODO: Know why it was formatted in Php
    System.out.println("Mortgage: " + mortgageFormatted);
    // TODO: Edit to include input validation
  }
}
