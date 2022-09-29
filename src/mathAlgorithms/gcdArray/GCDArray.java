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

  private static int findGCD(int[] numbers, int length) {
    int result = numbers[0];
    for (int element: numbers) {
      result = gcd(result, element);

      if (result == 1){
        return 1;
      }
    }
    return result;
  }

  private static int gcd(int result, int element) {
    if (result == 0){
      return element;
    }
    return gcd(element % result, result);
  }
}
