package dynamicProgramming.goldMine;

public class GoldMine {

  public static void main(String[] args) {
    int[][] gold = {{1, 3, 1, 5},
        {2, 2, 4, 1},
        {5, 0, 2, 3},
        {0, 6, 1, 2}};
    int m = 4, n = 4;
    System.out.println(getMaxGold(gold, n, m));
  }

  private static int getMaxGold(int[][] gold, int n, int m) {
    int maxGold = 0;
    for (int i = 0; i < n; i++) {
      int goldCollected = collectGold(gold, i, 0, n, m);
      maxGold = Math.max(maxGold, goldCollected);
    }
    return maxGold;
  }

  private static int collectGold(int[][] gold, int i, int i1, int n, int m) {
  }
}
