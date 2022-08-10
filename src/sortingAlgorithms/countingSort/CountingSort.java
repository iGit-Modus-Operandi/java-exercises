package sortingAlgorithms.countingSort;

import java.util.Random;

public class CountingSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    countingSort(numbers);
    
    System.out.println("After sorting");
    printArray(numbers);

  }

  private static void countingSort(int[] numbers) {
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i] + " ");
    }
  }
}
