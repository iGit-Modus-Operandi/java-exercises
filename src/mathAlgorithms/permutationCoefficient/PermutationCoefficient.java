package mathAlgorithms.permutationCoefficient;

public class PermutationCoefficient {

  public static void main(String[] args) {
    int n = 10, k = 2;
    System.out.println("Value of P( " + n + "," + k + ")" + " is " + permutationCoefficient(n, k));
  }

  private static Object permutationCoefficient(int n, int k) {
    int P[][] = new int[n + 2][k + 2];
    return P[n][k];
  }
}
