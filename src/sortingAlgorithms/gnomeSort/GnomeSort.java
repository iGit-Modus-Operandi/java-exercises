package sortingAlgorithms.gnomeSort;

import java.util.Random;

public class GnomeSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    gnomeSort(numbers);
    
    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void gnomeSort(int[] numbers) {
    int index = 0;

    while (index < numbers.length){
      if (index == 0){
        index++;
      }
      if (numbers[index] >= numbers[index - 1]){
        index++;
      } else {
        int temp = 0;
        temp = numbers[index];
        numbers[index] = numbers[index - 1];
        numbers[index - 1] = temp;
        index--;
      }
    }
    return;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
