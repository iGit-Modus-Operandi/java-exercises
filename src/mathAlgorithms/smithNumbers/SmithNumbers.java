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

    for (int i = 0; primes.get(i) <= n/2 ; i++) {
      while(n % primes.get(i) == 0){
        int p = primes.get(i);
        n = n / p;

        while(p > 0){
          pDigitSum += (p % 10);
          p = p / 10;
        }
      }
    }

    if(n != 1 && n != orig_num){
      while(n > 0){
        pDigitSum = pDigitSum + n % 10;
        n = n / 10;
      }
    }

    int sumDigits = 0;
    while(orig_num > 0){
      sumDigits = sumDigits + orig_num % 10;
      orig_num = orig_num / 10;
    }

    return (pDigitSum == sumDigits);
  }
}
