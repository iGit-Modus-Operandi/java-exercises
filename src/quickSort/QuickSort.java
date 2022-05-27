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

  private static void quickSort(int[] numbers, int i, int i1) {
  }

  private static void printArray(int[] numbers) {
    for (int i=0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}

