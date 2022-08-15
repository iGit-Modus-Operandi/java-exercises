package sortingAlgorithms.combSort;

import java.util.Random;

public class CombSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }
  }
}
