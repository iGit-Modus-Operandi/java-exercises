package sortingAlgorithms.combSort;

import java.util.Random;

public class CombSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    combSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void combSort(int[] numbers) {
    int gap = numbers.length;
    boolean swapped = true;

    while (gap != 1 || swapped == true){
      gap = getNextGap(gap);
      swapped = false;

      for (int i = 0; i < numbers.length - gap; i++) {
        if (numbers[i] > numbers[i + gap]){
          int temp = numbers[i];
          numbers[i] = numbers[i + gap];
          numbers[i + gap] = temp;

          swapped = true;
        }
      }
    }
  }

  private static int getNextGap(int gap) {
    gap = (gap * 10) / 13;
    if (gap < 1){
      return 1;
    }
    return gap;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
