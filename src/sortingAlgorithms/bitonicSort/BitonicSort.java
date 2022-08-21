package sortingAlgorithms.bitonicSort;

import java.util.Random;

public class BitonicSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    System.out.println("After sorting");
  }
}
