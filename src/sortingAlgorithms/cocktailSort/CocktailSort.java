package sortingAlgorithms.cocktailSort;

import java.util.Random;

public class CocktailSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    cocktailSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void cocktailSort(int[] numbers) {
    boolean swapped = true;
    int start = 0;
    int end = numbers.length;

    while (swapped == true){
      swapped = false;

      for (int i = 0; i < end - 1; i++) {
        if (numbers[i] > numbers[i + 1]){
          int temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
          swapped = true;
        }
      }

      if (swapped == false){
        break;
      }

      swapped = false;
      end = end - 1;

      for (int i = end - 1; i >= start ; i--) {
        if (numbers[i] > numbers[i + 1]){
          int temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
          swapped = true;
        }
      }

      start = start + 1;
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
