/*
 * This sorting algorithm uses insertion sort to arrange a series of randomly generated numbers in an array
 * TIME COMPLEXITY: O(N^2)
 * AUXILIARY SPACE: O(1)
 * IMPLEMENTATION:
 * 1. Iterate from arr[1] to arr[N] over the array.
 * 2. Compare the current element (key) to its predecessor.
 * 3. If the key element is smaller than its predecessor, compare it to the elements before.
 * 4. Move the greater elements one position up to make space for the swapped element.
 */

package sortingAlgorithms.insertionSort;
import java.util.Random;

public class InsertionSort {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i=0; i < numbers.length; i++){
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting: ");
    printArray(numbers);

    insertionSort(numbers);

    System.out.println("\nAfter sorting: ");
    printArray(numbers);
  }

  private static void insertionSort(int[] numbers) {
    for(int i=1; i < numbers.length; i++){
      int temp = numbers[i];

      int j;
      for (j = i-1; j >= 0 && numbers[j] >= temp; j--){
        numbers[j+1] = numbers[j];
      }
      numbers[j+1] = temp;
    }
  }

  private static void printArray(int[] numbers) {
    for(int i=0; i < numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
  }

}
