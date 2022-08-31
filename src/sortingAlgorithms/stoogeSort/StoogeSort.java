package sortingAlgorithms.stoogeSort;

import java.util.Random;

public class StoogeSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    stoogeSort(numbers, 0, numbers.length);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void stoogeSort(int[] numbers, int low, int high) {
    if (low >= high){
      return;
    }

    if (numbers[low] > numbers[high]){
      int temp = numbers[low];
      numbers[low] = numbers[high];
      numbers[high] = temp;
    }

    if (high - low + 1 > 2){
      int t = (high - low + 1) / 3;

      stoogeSort(numbers, low, high - t);
      stoogeSort(numbers, low + t, high);
      stoogeSort(numbers, low, high - t);
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
