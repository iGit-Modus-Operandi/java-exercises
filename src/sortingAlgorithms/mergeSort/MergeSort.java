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
    int inputLength = numbers.length;

    if (inputLength < 2){
      return;
    }

    int midIndex = inputLength / 2;
    int [] leftHalf = new int[midIndex];
    int [] rightHalf = new int[inputLength - midIndex];

    for (int i = 0; i < midIndex; i++){
      leftHalf[i] = numbers[i];
    }

    for (int i = midIndex; i < inputLength; i++){
      rightHalf[i - midIndex] = numbers[i];
    }

  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
  }
}
