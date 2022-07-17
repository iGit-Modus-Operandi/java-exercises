package widgetsAlgorithms.mortgageCalculator;

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

//    Locale locale = new Locale("de", "DE"); // specify which locality to use as currency
//    String mortgageFormatted = NumberFormat.getCurrencyInstance(locale).format(mortgage);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
    // TODO: Edit to include input validation
  }
}
