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

  private static int collectGold(int[][] gold, int x, int y, int n, int m) {
    //base condition
    if ((x < 0) || (x == n) || (y == m)){
      return 0;
    }

    int rightUpperDiagonal = collectGold(gold, x - 1, y + 1, n, m);
    int right = collectGold(gold, x ,y + 1, n ,m);
    int rightLowerDiagonal = collectGold(gold, x + 1, y + 1, n, m);

    return gold[x][y] + Math.max(Math.max(rightUpperDiagonal, rightLowerDiagonal), right);
  }
}
