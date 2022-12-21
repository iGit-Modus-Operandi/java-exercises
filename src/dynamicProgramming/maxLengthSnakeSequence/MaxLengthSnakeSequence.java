package dynamicProgramming.maxLengthSnakeSequence;

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

          if (j > 0 && Math.abs())
        }
      }
    }
  }
}
