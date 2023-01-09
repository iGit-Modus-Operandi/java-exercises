package mathAlgorithms.smithNumbers;

import java.util.Vector;

public class SmithNumbers {

  static int MAX = 10000;
  static Vector<Integer> primes = new Vector<>();

  public static void main(String[] args) {
    sieveOfSundaram();
    System.out.println("Printing first few Smith numbers using isSmith()");
    for (int i = 0; i < 500; i++) {
      if (isSmith(i)){
        System.out.println(i + " ");
      }
    }
  }

  private static void sieveOfSundaram() {
    boolean[] marked = new boolean[MAX/2 + 100];

    for (int i = 1; i <= (Math.sqrt(MAX) - 1) / 2; i++) {
      for (int j = (i * (i + 1)) << 1; j <= MAX / 2 ; j = j + 2 * i + 1) {
        marked[j] = true;
      }
    }
    primes.addElement(2);
    for (int i = 1; i < MAX / 2; i++) {
      if (marked[i] == false){
        primes.addElement(2 * i + 1);
      }
    }
  }

  private static boolean isSmith(int n) {
    int orig_num = n;
    int pDigitSum = 0;
    for (int i = 0; primes.get(i) < ; i++) {

    }
    int sumDigits = 0;
    return (pDigitSum == sumDigits);
  }
}
