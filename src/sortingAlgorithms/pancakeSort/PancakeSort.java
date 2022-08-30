package sortingAlgorithms.pancakeSort;

import java.util.Random;

public class PancakeSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    pancakeSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static int pancakeSort(int[] numbers) {
    for (int curr_size = numbers.length; curr_size > 1; --curr_size) {
      int mi = findMax(numbers, curr_size);

      if (mi != curr_size - 1){
        flip (numbers, mi);
        flip(numbers, curr_size - 1);
      }
    }
    return 0;
  }

  private static int findMax(int[] numbers, int curr_size) {
    int mi, i;
    for (mi = 0, i = 0; i < numbers.length; ++i) {
      if (numbers[i] > numbers[mi]){
        mi = i;
      }
    }
    return mi;
  }

  private static void flip(int[] numbers, int i) {
    int temp, start = 0;
    while (start < i){
      temp = numbers[start];
      numbers[start] = numbers[i];
      numbers[i] = temp;
      start++;
      i--;
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
