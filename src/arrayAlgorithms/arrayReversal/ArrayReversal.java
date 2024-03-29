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

    reverseInPlace(numbers);
    Arrays.stream(numbers).forEach(System.out::println);
  }

  private static int[] reverseArray(int[] numbers) {
    int[] reverse = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      reverse[i] = numbers[numbers.length - 1 - i];
    }

    return reverse;
  }

  private static void reverseInPlace(int[] numbers) {
    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - 1 - i];
      numbers[numbers.length - 1 - i] = temp;
    }
  }
}
