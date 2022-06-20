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

  private static void bubbleSort(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++)
      if (numbers[i] > numbers[i + 1]){
        swap(numbers, numbers[i], numbers[i + 1]);
      }
  }

  private static void swap(int[] numbers, int index1, int index2) {
    int temp = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = temp;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}
