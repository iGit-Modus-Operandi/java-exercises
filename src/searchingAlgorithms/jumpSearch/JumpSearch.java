/*
 * CONDITION: Given a sorted array, numbers[], of n elements, search for a given value from user input.
 * TIME COMPLEXITY: O(√n)
 * AUXILIARY SPACE: O(1)
 * SOLUTION:
 * 1. Determine jump block size m=√n.
 * 2. Starting from the first block's highest element, if the value is smaller than the target element, the next block is considered.
 * 3. If the value of the highest element of the block is higher than the target element, the target element is in the current block.
 * 4. If an element matches the user input value, return the index.
 * 5. If no match was found, return -1.
 */

package searchingAlgorithms.jumpSearch;

import java.util.Random;
import java.util.Scanner;

public class JumpSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = jumpSearch(numbers, searchValue);

    if (searchResult == -1){
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int jumpSearch(int[] numbers, int searchValue) {
    int step = (int) Math.floor(Math.sqrt(numbers.length));
    int prev = 0;

    while (numbers[Math.min(step, numbers.length) - 1] < searchValue) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(numbers.length));
      if (prev >= numbers.length) {
        return -1;
      }
    }

    while (numbers[prev] < searchValue) {
      prev++;
      if (prev == Math.min(step, numbers.length)) {
        return -1;
      }
    }

    if (numbers[prev] == searchValue) {
      return prev;
    }

    return -1;
  }
}
