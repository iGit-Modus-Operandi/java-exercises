/*
 * CONDITION: Given a sorted array, numbers[], of n elements, search for a given value from user input.
 * TIME COMPLEXITY: O(log N)
 * AUXILIARY SPACE: O(log N)
 * SOLUTION:
 * 1. Starting from the mid element of the array, compare the element with the value of user input.
 * 2. If the value of the element matches the user input value, return the index.
 * 3. If the value of the search element from the user input is less than the mid element, narrow the
 * interval to the lower half of the array elements.
 * 4. Otherwise, narrow the interval to the upper half of the array elements.
 * 5. Repeatedly compare with the mid element of the new interval until interval is empty.
 * 6. If no match was found, return -1.
 */

package searchingAlgorithms.binarySearch;

import java.util.Random;
import java.util.Scanner;

public class RecursiveBinarySearch {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = binarySearch(numbers, 0, numbers.length - 1, searchValue);

    if (searchResult == -1){
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int binarySearch(int[] numbers, int left, int right, int searchValue) {
    if (right >= 1){
      int mid = 1 + (right - 1) / 2;
      if (numbers[mid] == searchValue){
        return mid;
      }

      if (numbers[mid] > searchValue){
        return binarySearch(numbers, left, mid - 1, searchValue);
      }

      return binarySearch(numbers, mid + 1, right, searchValue);
    }

    return -1;
  }
}
