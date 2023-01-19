package mathAlgorithms.hoaxNumbers;

import java.util.ArrayList;
import java.util.List;

public class HoaxNumbers {

  public static void main(String[] args) {
    int n = 84;
    if (isHoax(n)) {
      System.out.println("A Hoax number\n");
    } else {
      System.out.println("Not a Hoax number\n");
    }

  }

  private static boolean isHoax(int n) {
    List<Integer> pf = primeFactors(n);
    if (pf.get(0) == n) {
      return false;
    }

    int all_pf_sum = 0;
    for (int i = 0; i < pf.size(); i++) {
      for (int pf_sum = 0; pf.get(i) > 0; pf_sum += pf.get(i) % 10, pf.set(i, pf.get(i) / 10)) {
        all_pf_sum += pf_sum;
      }
    }

    int sum_n;
    for (sum_n = 0; n > 0; sum_n += n % 10, n /= 10) {
      ;
    }
    return sum_n == all_pf_sum;
  }

  private static List<Integer> primeFactors(int n) {
    List<Integer> res = new ArrayList<>();
    if(n % 2 == 0){
      while(n % 2 == 0){
        n = n / 2;
      }
      res.add(2);
    }

    for (int i = 3; i <= Math.sqrt(n) ; i = i + 2) {
      if(n % i == 0){
        while(n % i == 0){
          n = n / i;
        }
        res.add(i);
      }
    }

    if(n > 2){
      res.add(n);
    }

    return res;
  }

}
