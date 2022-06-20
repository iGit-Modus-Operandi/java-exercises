package bubbleSort;

import java.util.Random;

public class BubbleSort {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = random.nextInt(1000);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    bubbleSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);

  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}
