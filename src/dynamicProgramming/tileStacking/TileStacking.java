package dynamicProgramming.tileStacking;

public class TileStacking {

  private static int N = 100;

  public static void main(String[] args) {
    int n = 3, m = 3, k = 2;
    System.out.println(possibleWays(n, m, k));
  }

  private static boolean possibleWays(int n, int m, int k) {
    int[][] dp = new int[N][N];
    int[][] presum = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        dp[i][j] = 0;
        presum[i][j] = 0;
      }
    }

    for (int i = 1; i < n; i++) {
      dp[0][i] = 0;
      presum[0][i] = 1;
    }

    for (int i = 0; i < m + 1; i++) {
      presum[i][0] = dp[i][0] = 1;
    }
  }
}
