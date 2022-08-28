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

    System.out.println("After sorting");
    printArray(numbers);
  }
}
