package quickSort;

import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];
    
    for(int i=0; i < numbers.length; i++){
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    quickSort(numbers);
    
    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void quickSort(int[] numbers) {
    quickSort(numbers, 0, numbers.length - 1);
  }

  private static void quickSort(int[] numbers, int lowIndex, int highIndex) {
    if (lowIndex >= highIndex){
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

    return leftPointer;
  }

  private static void swap(int[] numbers, int index1, int index2) {
    int temp = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = temp;
  }

  private static void printArray(int[] numbers) {
    for (int i=0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}

