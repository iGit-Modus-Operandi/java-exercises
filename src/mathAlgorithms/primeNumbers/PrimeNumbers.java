package mathAlgorithms.primeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String[] args) {
    System.out.println("Enter the limit: ");

    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();

    List<Integer> primeNumbers = new ArrayList<>();

    for (int numberCheck = 2; numberCheck <= limit; numberCheck++) {
      boolean isPrime = true;

      for (int factor = 2; factor <= numberCheck / 2; factor++) {
        if (numberCheck % factor == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        primeNumbers.add(numberCheck);
      }
    }

    System.out.println("Prime numbers from 1 to " + limit + " are: ");

    for (int number : primeNumbers) {
      System.out.println(number);
    }

    scanner.close();
  }
}
