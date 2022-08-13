package sortingAlgorithms.shellSort;

import java.util.Random;

public class ShellSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    shellSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static int shellSort(int[] numbers) {
    for (int gap = numbers.length / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < numbers.length; i += 1) {
        int temp = numbers[i];
        int j;
        for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap) {
          numbers[j] = numbers[j - gap];
        }
        numbers[j] = temp;
      }
    }
    return 0;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
