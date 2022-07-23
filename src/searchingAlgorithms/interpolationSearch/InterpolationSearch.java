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

    interpolationSearch(numbers, 0, numbers.length, searchValue);
  }

  private static void interpolationSearch(int[] numbers, int low, int high, int searchValue) {
  }
}
