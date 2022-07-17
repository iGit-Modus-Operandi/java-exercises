package searchingAlgorithms.linearSearch;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    int searchResult = search(numbers, searchValue);
    if (searchResult == -1) {
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int search(int[] numbers, int searchValue) {
    return -1;
  }

}
