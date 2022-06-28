package sortingAlgorithms.mergeSort;

import java.util.Random;

public class MergeSort {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++){
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting: ");
    printArray(numbers);

    mergeSort(numbers);

    System.out.println("\nAfter sorting");
    printArray(numbers);
  }

  private static void mergeSort(int[] numbers) {
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i] + " ");
    }
  }
}
