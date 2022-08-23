package sortingAlgorithms.bitonicSort;

import java.util.Random;

public class BitonicSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    int up = 1;
    
    System.out.println("Before sorting");
    printArray(numbers);

    bitonicSort(numbers, 0, numbers.length, up);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void bitonicSort(int[] numbers, int low, int count, int dir) {
    if (count > 1){
      int k = count / 2;
      
      bitonicSort(numbers, low, k, 1);

      bitonicSort(numbers, low + k, k, 0);
      
      bitonicMerge(numbers, low, count, dir);
    }
  }

  private static void bitonicMerge(int[] numbers, int low, int count, int dir) {
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
