package sortingAlgorithms.bucketSort;

import java.util.Random;

public class BucketSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    bucketSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void bucketSort(int[] numbers) {
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
