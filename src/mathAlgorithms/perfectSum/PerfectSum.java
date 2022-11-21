package mathAlgorithms.perfectSum;

public class PerfectSum {
  static boolean[][] dp;

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int sum = 10;
    printAllSubsets(arr, arr.length, sum);
  }

  private static void printAllSubsets(int[] arr, int length, int sum) {
    if (length == 0 || sum < 0){
      return;
    }

    dp = new boolean[length][sum + 1];
    for (int i = 0; i < length; ++i) {
      dp[i][0] = true;
    }

    if (arr[0] <= sum){
      dp[0][arr[0]] = true;
    }

    for (int i = 0; i < length; ++i) {
      for (int j = 0; j < sum + 1; ++j) {
        dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] || dp[i - 1][j - arr[i]]) : dp[i - 1][j];
      }
    }

    if (dp[length - 1][sum] == false){
      System.out.println("There are no subsets with" + " sum " + sum);
      return;
    }
  }
}