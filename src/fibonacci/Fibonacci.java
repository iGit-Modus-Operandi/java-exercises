/*
 * This algorithm prints out the sum of a fibonacci sequence up to the nth number indicated through the user input
 * The initial approach for this kind of task is for a recursive algorithm but choosing a large series of number would significantly introduce latency on the output.
 * The more efficient approach would be to cache computed value every step of the iteration to save processing time.
 */

package fibonacci;

import java.text.NumberFormat;
import java.util.Scanner;

public class Fibonacci {

  private static long[] cache;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int n = scanner.nextInt();

    cache = new long[n + 1];
    long fibonacciSum = fibonacci(n);
    System.out.println("The sum up to the " + n + "th number of the fibonacci sequence is " + NumberFormat.getIntegerInstance().format(fibonacciSum));
  }

  private static long fibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    if (cache[n] != 0) {
      return cache[n];
    }

    long nthNumber = (fibonacci(n - 1) + fibonacci(n - 2));
    cache[n] = nthNumber;
    return nthNumber;
  }
}
