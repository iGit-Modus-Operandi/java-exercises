package searchingAlgorithms.exponentialSearch;

import java.util.Arrays;
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

  private static int exponentialSearch(int[] numbers, int length, int searchValue) {
    if (numbers[0] == searchValue){
      return 0;
    }
    int i = 1;
    while (i < numbers.length && numbers[i] <= searchValue){
      i = i * 2;
    }

    return Arrays.binarySearch(numbers, i / 2, Math.min(i, numbers.length - 1), searchValue);
  }
}
