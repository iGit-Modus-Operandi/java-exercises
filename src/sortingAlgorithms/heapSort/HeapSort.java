package sortingAlgorithms.heapSort;

import java.util.Random;

public class HeapSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    heapSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void heapSort(int[] numbers) {
    int arrayLength = numbers.length;

    for (int i = (arrayLength / 2) - 1; i >= 0; i--) {
      heapify(numbers, arrayLength, i);
    }

    for (int i = arrayLength - 1; i > 0; i--) {
      int temp = numbers[0];
      numbers[0] = numbers[i];
      numbers[i] = temp;

      heapify(numbers, i, 0);
    }
  }

  private static void heapify(int[] numbers, int arrayLength, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < arrayLength && numbers[left] > numbers[largest]) {
      largest = left;
    }

    if (right < arrayLength && numbers[right] > numbers[largest]){
      largest = right;
    }

    if (largest != i){
      int swap = numbers[i];
      numbers[i] = numbers[largest];
      numbers[largest] = swap;

      heapify(numbers, arrayLength, largest);
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
