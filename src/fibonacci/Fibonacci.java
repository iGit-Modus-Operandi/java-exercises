package fibonacci;
// This algorithm prints out the sum of a fibonacci sequence up to the nth number indicated through the user input

import java.util.Scanner;

public class Fibonacci {

  private static long[] cache;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int n = scanner.nextInt();

    cache = new long[n + 1];
    System.out.println("The sum up to the " + n + "th number of the fibonacci sequence is " + fibonacci(n));
  }

  private static long fibonacci(int n) {
    if (n <= 1)
      return n;

    if (cache[n] != 0)
      return cache[n];

    long nthNumber = (fibonacci(n - 1) + fibonacci(n - 2));
    cache[n] =  nthNumber;
    return nthNumber;
  }
}
