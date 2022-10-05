package arrayAlgorithms.arrayReversal;

import java.util.Arrays;
import java.util.Random;

public class ArrayReversal {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[6];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Arrays.stream(reverseArray(numbers))
        .forEach(System.out::println);

    System.out.println();
  }

  private static int[] reverseArray(int[] numbers) {
  }
}
