package arrayAlgorithms.arrayAggregation;

import java.util.ArrayList;
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
    System.out.println();
    Arrays.stream(findEvenNums2(numbers1, numbers2))
        .forEach(System.out::println);
  }

  private static int[] findEvenNums2(int[] numbers1, int[] numbers2) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int num : numbers1) {
      if (num % 2 == 0){
        result.add(num);
      }
    }

    for (int num : numbers2) {
      if (num % 2 == 0){
        result.add(num);
      }
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  private static int[] findEvenNums1(int[] numbers1, int[] numbers2) {
  }
}
