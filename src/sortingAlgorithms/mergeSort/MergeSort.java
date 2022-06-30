/*
 * This sorting algorithm uses merge sort to arrange a series of randomly generated numbers in an array
 * COMPLEXITY: O(n log n)
 * ALGORITHM:
 * 1. Divide array into halves
 * 2. Merge sort each half recursively as you divide the array until only a single unit
 * 3. Once both half are in order, merge the two halves together again
 */

package sortingAlgorithms.mergeSort;

import java.util.Random;

public class MergeSort {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10000];

    for (int i = 0; i < numbers.length; i++){
      numbers[i] = random.nextInt(1000000);
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
    int [] leftHalf = new int [midIndex];
    int [] rightHalf = new int [inputLength - midIndex];
    // in case the array length is odd, resulting in uneven number of elements at both sides

    // populate the created arrays with elements from the original divided array
    for (int i = 0; i < midIndex; i++){
      leftHalf[i] = numbers[i];
    }

    for (int i = midIndex; i < inputLength; i++){
      rightHalf[i - midIndex] = numbers[i];
    }

    mergeSort(leftHalf);
    mergeSort(rightHalf);
    
    merge(numbers, leftHalf, rightHalf);
  }

  private static void merge(int [] numbers, int [] leftHalf, int [] rightHalf) {
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;

    // iterators, one to iterate on the elements of left-hand array, one to iterate on the elements of right-hand array
    // and another one to iterate on the elements of combined array
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < leftSize && j < rightSize){
      if (leftHalf[i] <= rightHalf[j]){
        numbers[k] = leftHalf[i];
        i++;
      }
      else{
        numbers[k] = rightHalf[j];
        j++;
      }
      k++;
    }

    while (i < leftSize){
      numbers[k] = leftHalf[i];
      i++;
      k++;
    }

    while (j < rightSize){
      numbers[k] = rightHalf[j];
      j++;
      k++;
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
  }
}
