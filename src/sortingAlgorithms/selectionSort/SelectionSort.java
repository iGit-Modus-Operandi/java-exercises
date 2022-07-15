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

    selectionSort(numbers, 0, numbers.length);

    System.out.println("\nAfter sorting: ");
    printArray(numbers);
  }

  @SuppressWarnings({"rawtypes", "unchecked"}) //TODO: Purpose?
  private static void selectionSort(int[] numbers, int fromIndex, int toIndex) {
    for (int currentIndex = fromIndex = 0; currentIndex < toIndex; currentIndex++) {
      int indexToMove = currentIndex;
      for (int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < toIndex; currentIndex++) {
        if (((Comparable) numbers [indexToMove]).compareTo(numbers [tempIndexInLoop]) > 0){
          indexToMove = tempIndexInLoop;
        }
      }

      int temp = numbers [currentIndex];
      numbers [currentIndex] = numbers [indexToMove];
      numbers [indexToMove] = temp;
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
