/*
 * CONDITION: Given an array, numbers[], of n elements, search for a given value from user input.
 * TIME COMPLEXITY: O(n)
 * SOLUTION:
 * 1. Starting from the leftmost element of the array, traverse each element while comparing
 * the value of user input.
 * 2. If an element matches the user input value, return the index.
 * 3. If no match was found, return -1.
 */

package searchingAlgorithms.linearSearch;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = search(numbers, searchValue);
    if (searchResult == -1) {
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int search(int[] numbers, int searchValue) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == searchValue) {
        return i;
      }
    }
    return -1;
  }
}
