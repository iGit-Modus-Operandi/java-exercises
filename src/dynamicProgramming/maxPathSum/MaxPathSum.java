package dynamicProgramming.maxPathSum;

public class MaxPathSum {

  public static void main(String[] args) {
    int triangle[][] = {{1, 0, 0}, {4, 8, 0}, {1, 5, 3}};
    System.out.println(maxPathSum(triangle, 0, 0, 3, 3));
  }

  private static int maxPathSum(int[][] triangle, int i, int j, int row, int column) {
    if (j == column){
      return 0;
    }
    if (i == row - 1){
      return triangle[i][j];
    }
    return triangle[i][j] + Math.max(maxPathSum(triangle, i + 1, j, row, column), maxPathSum(triangle, i + 1, j + 1, row, column));
  }
}
