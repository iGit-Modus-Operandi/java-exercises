package arrayAlgorithms.arrayAggregation;

import java.util.Arrays;
import java.util.Random;

public class ArrayAggregation {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers1 = new int[6];
    int[] numbers2 = new int[6];

    for (int i = 0; i < numbers1.length; i++) {
      numbers1[i] = random.nextInt(100);
    }

    for (int i = 0; i < numbers2.length; i++) {
      numbers2[i] = random.nextInt(100);
    }

    Arrays.stream(findEvenNums1(numbers1, numbers2))
        .forEach(System.out::println);
  }
}
