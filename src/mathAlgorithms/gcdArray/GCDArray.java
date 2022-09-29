package mathAlgorithms.gcdArray;

import java.util.Random;

public class GCDArray {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[6];
    int length = numbers.length;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println(findGCD(numbers, length));
  }

  private static boolean findGCD(int[] numbers, int length) {
  }
}
