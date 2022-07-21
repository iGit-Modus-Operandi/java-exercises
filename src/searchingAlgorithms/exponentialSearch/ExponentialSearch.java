package searchingAlgorithms.exponentialSearch;

import java.util.Random;
import java.util.Scanner;

public class ExponentialSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();
    
    exponentialSearch(numbers, numbers.length, searchValue);
  }

  private static void exponentialSearch(int[] numbers, int length, int searchValue) {
  }
}
