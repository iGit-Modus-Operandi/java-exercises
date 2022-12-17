package dynamicProgramming.minPathSum;

public class MinPathSum {

  public static void main(String[] args) {
    int[][] triangle = {{2}, {3, 9}, {1, 6, 7}};
    System.out.println(minSumPath(triangle));
  }

  private static int minSumPath(int[][] triangle) {
    return helper(triangle, 0, 0);
  }

  private static int helper(int[][] triangle, int i, int j) {
    if (i == triangle.length){
      return 0;
    }
    int min;
    min = triangle[i][j] + Math.min(helper(triangle, i + 1, j), helper(triangle, i + 1, j + 1));

    return min;
  }
}
