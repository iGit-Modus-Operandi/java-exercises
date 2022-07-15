package sortingAlgorithms.selectionSort;

import java.util.Random;

public class SelectionSort {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers [i] = random.nextInt(100);
    }

    System.out.println("Before sorting: ");
    printArray(numbers);

    selectionSort(numbers);

    System.out.println("\nAfter sorting: ");
    printArray(numbers);
  }

  private static void selectionSort(int[] numbers) {
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
