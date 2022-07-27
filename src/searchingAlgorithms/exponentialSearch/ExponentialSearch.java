package searchingAlgorithms.exponentialSearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExponentialSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = exponentialSearch(numbers, numbers.length, searchValue);

    if (searchResult == -1) {
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int exponentialSearch(int[] numbers, int length, int searchValue) {
    if (numbers[0] == searchValue) {
      return 0;
    }

    int i = 1;
    while (i < numbers.length && numbers[i] <= searchValue) {
      i = i * 2;
    }

    return Arrays.binarySearch(numbers, i / 2, Math.min(i, numbers.length - 1), searchValue);
  }
}
