/*
* This sorting algorithm uses quick sort to arrange a series of randomly generated numbers in an array
* TIME COMPLEXITY: O(N^2) - worst case scenario
* AUXILIARY SPACE:
* IMPLEMENTATION:
* 1. Choose one of the numbers in your array as the pivot.
* 2. Partitioning: Move all the numbers in the array that are lower than the pivot to the left of it
* and all the numbers in the array that are higher than the pivot to the right of it.
* 3. Recursively quick sort all the values to the left and right of the pivot.
*/

package sortingAlgorithms.quickSort;

import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    quickSort(numbers);

    System.out.println("\nAfter sorting");
    printArray(numbers);
  }

  private static void quickSort(int[] numbers) {
    quickSort(numbers, 0, numbers.length - 1);
  }

  private static void quickSort(int[] numbers, int lowIndex, int highIndex) {
    if (lowIndex >= highIndex) {
      return;
    }
    if(highIndex - lowIndex < 1){
      return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = numbers[pivotIndex];
    swap(numbers, pivotIndex, highIndex);

    int leftPointer = partition(numbers, lowIndex, highIndex, pivot);

    quickSort(numbers, lowIndex, leftPointer - 1);
    quickSort(numbers, leftPointer + 1, highIndex);
  }

  private static int partition(int[] numbers, int lowIndex, int highIndex, int pivot) {
    int leftPointer = lowIndex;
    int rightPointer = highIndex - 1;

    while (leftPointer < rightPointer) {

      // Walk from left until you find a number greater than the pivot or hit the right pointer
      while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      // Walk from right until you find a number greater than the pivot or hit the left pointer
      while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(numbers, leftPointer, rightPointer);
    }

      if (numbers[leftPointer] > numbers[highIndex]) {
        swap(numbers, leftPointer, highIndex);
      } else {
        leftPointer = highIndex;
      }
    return leftPointer;
  }

  private static void swap(int[] numbers, int index1, int index2) {
    int temp = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = temp;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}

