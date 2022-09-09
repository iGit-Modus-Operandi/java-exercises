package mathAlgorithms.catalanNumbers;

public class CatalanNumbers {

  public static void main(String[] args) {
    CatalanNumbers catalanNumbers = new CatalanNumbers();
    for (int i = 0; i < 10; i++) {
      System.out.print(catalanNumbers.catalan(i) + " ");
    }
  }

  private int catalan(int n) {
    int result = 0;

    if (n <= 1){
      return 1;
    }
    for (int i = 0; i < n; i++) {
      result += catalan(i) * catalan(n - i - 1);
    }
    return result;
  }
}
