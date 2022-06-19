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

    // Option to print out the whole fibonacci sequence
    for (int i = 0; i <= n; i++){
      System.out.print(NumberFormat.getIntegerInstance().format(fibonacci(i)) + " ");
    }

  }

  private static long fibonacci(int n) {
    // Base Case: a condition inside a recursive method where if this condition is met, it doesn't make a recursive call
    // used to avoid infinite recursion
    if (n <= 1) {
      return n;
    }

    /* Memoization or memoisation is an optimization technique used primarily to speed up computer programs
    by storing the results of expensive function calls and returning the cached result when the same inputs occur again. */

    if (cache[n] != 0) { // Note: use zero instead of NULL because primitives would default to zero
      return cache[n];
    }

    long nthNumber = (fibonacci(n - 1) + fibonacci(n - 2));
    cache[n] = nthNumber;
    return nthNumber;
  }
}
