/* This problem is an extension of Subset Sum problem where you not only need to find if there is a
* subset with the given sum but also to print all subsets within a given sum*/
package mathAlgorithms.perfectSum;

import java.util.ArrayList;

public class PerfectSum {
  static boolean[][] dp;

  static void display(ArrayList<Integer> v){
    System.out.println(v);
  }

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

    ArrayList<Integer> p = new ArrayList<>();
    printSubsetsRec(arr, length - 1, sum, p);
  }

  private static void printSubsetsRec(int[] arr, int i, int sum, ArrayList<Integer> p) {
    if (i == 0 && sum != 0 && dp[0][sum]){
      p.add(arr[i]);
      display(p);
      p.clear();
      return;
    }

    if (i == 0 && sum == 0){
      display(p);
      p.clear();
      return;
    }

    if (dp[i - 1][sum]){
      ArrayList<Integer> b = new ArrayList<>();
      b.addAll(p);
      printSubsetsRec(arr, i - 1, sum, b);
    }

    if (sum >= arr[i] && dp[i - 1][sum - arr[i]]){
      p.add(arr[i]);
      printSubsetsRec(arr, i - 1, sum - arr[i], p);
    }
  }
}