package dynamicProgramming.maxLengthSnakeSequence;

import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

public class MaxLengthSnakeSequence {

  static int M = 4;
  static int N = 4;

  public static void main(String[] args) {
    int[][] matrix = {
        {9, 6, 5, 2},
        {8, 7, 6, 5},
        {7, 3, 1, 6},
        {1, 1, 1, 7}
    };
    findSnakeSequence(matrix);
  }

  private static void findSnakeSequence(int[][] matrix) {
    int[][] lookup = new int[M][N];
    int max_len = 0;
    int max_row = 0;
    int max_col = 0;

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (i != 0 || j != 0){
          if (i > 0 && Math.abs(matrix[i - 1][j] - matrix[i][j]) == 1){
            lookup[i][j] = Math.max(lookup[i][j], lookup[i - 1][j] + 1);

            if (max_len < lookup[i][j]){
              max_len = lookup[i][j];
              max_row = i;
              max_col = j;
            }
          }

          if (j > 0 && Math.abs(matrix[i][j - 1] - matrix[i][j]) == 1){
            lookup[i][j] = Math.max(lookup[i][j], lookup[i][j - 1] + 1);
            
            if (max_len < lookup[i][j]){
              max_len = lookup[i][j];
              max_row = i;
              max_col = j;
            }
          }
        }
      }
    }
    System.out.println("Maximum length of Snake " + "sequence is: " + max_len + "\n");
    
    List<Point> path = findPath(lookup, matrix, max_row, max_col);
    System.out.println("Snake sequence is: ");
    for (Point it: path) {
      System.out.println("\n" + matrix[it.x][it.y] + " (" + it.x + ", " + it.y + ")");
    }
  }

  private static List<Point> findPath(int[][] grid, int[][] matrix, int i, int j) {
    List<Point> path = new LinkedList<>();
    Point pt = new Point(i, j);
    path.add(0, pt);

    while (grid[i][j] != 0){
      if (i > 0 && grid[i][j] - 1 == grid[i - 1][j]){
        pt = new Point(i - 1, j);
        path.add(0, pt);
        i--;
      }
      else if (j > 0 && grid[i][j] - 1 == grid[i][j - 1]){
        pt = new Point(i, j - 1);
        path.add(0, pt);
        j--;
      }
    }
    return path;
  }
}
