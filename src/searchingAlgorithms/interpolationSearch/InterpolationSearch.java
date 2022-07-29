/*
 * CONDITION: Given a sorted array, numbers[], of n unifromyl distributed elements, search for a given value from user input.
 * TIME COMPLEXITY: O(log n)
 * AUXILIARY SPACE: O(log n)
 * SOLUTION:
 * 1. In a loop, calculate the value of “pos” using the probe position formula.
 * 2: If it is a match, return the index of the item, and exit.
 * 3: If the item is less than arr[pos], calculate the probe position of the left sub-array.
 * 4. Otherwise, calculate the same in the right sub-array.
 * 5. Repeat until a match is found or the sub-array reduces to zero.
 * 6. If no match was found, return -1.
 */


package searchingAlgorithms.interpolationSearch;

import java.util.Random;
import java.util.Scanner;

public class InterpolationSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = interpolationSearch(numbers, 0, numbers.length, searchValue);

    if (searchResult == -1){
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int interpolationSearch(int[] numbers, int low, int high, int searchValue) {
    int pos;

    if (low <= high && searchValue >= numbers[low] && searchValue <= numbers[high]){
      pos = low + (((high - low) / (numbers[high] - numbers[low])) * (searchValue - numbers[low]));

      if (numbers[pos] == searchValue){
        return pos;
      }

      if (numbers[pos] < searchValue){
        return interpolationSearch(numbers, pos + 1, high, searchValue);
      }

      if (numbers[pos] > searchValue){
        return interpolationSearch(numbers, low, pos - 1, searchValue);
      }
    }
    return -1;
  }
}
