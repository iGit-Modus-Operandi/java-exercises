package backtrackingAlgorithms.magnetPuzzle;

public class MagnetPuzzle {

  public static void main(String[] args) {
    char[][] rules = {
        {'L', 'R', 'L', 'R', 'T', 'T'},
        {'L', 'R', 'L', 'R', 'B', 'B'},
        {'T', 'T', 'T', 'T', 'L', 'R'},
        {'B', 'B', 'B', 'B', 'T', 'T'},
        {'L', 'R', 'L', 'R', 'B', 'B'}
    };
    solveMagnets(rules, 0, 0);
  }

  private static void solveMagnets(char[][] rules, int i, int j) {
    if (i == rules.length && j == 0) {
      if (checkConstraints(rules)) {
        System.out.println("[");
        for (int indxi = 0; indxi < rules.length; indxi++) {
          System.out.println("[");
          for (int indxj = 0; indxj < rules[0].length; indxj++) {
            System.out.println("'" + rules[indxi][indxj] + "', ");
          }
          System.out.println("]");
        }
        System.out.println("]");
      }
    } else if (j >= rules[0].length){
      solveMagnets(rules, i + 1, 0);
    } else {
      if(rules[i][j] == 'L'){
        if(canPutPatternHorizontally(rules, i, j, "+-".toCharArray()) == true){

        }
      }
    }
  }

  private static boolean checkConstraints(char[][] rules) {
    int M = 5;
    int N = 6;
    int[] top = {1, -1, -1, 2, 1, -1};
    int[] bottom = {2, -1, -1, 2, -1, 3};
    int[] left = {2, 3, -1, -1, -1};
    int[] right = {-1, -1, -1, 1, -1};

    int[] pCountH = new int[rules.length];
    for (int i = 0; i < rules.length; i++) {
      pCountH[i] = 0;
    }

    int[] nCountH = new int[rules.length];
    for (int i = 0; i < rules.length; i++) {
      nCountH[i] = 0;
    }

    for (int row = 0; row < rules.length; row++) {
      for (int col = 0; col < rules[0].length; col++) {
        char ch = rules[row][col];
        if(ch == '+'){
          pCountH[row] += 1;
        }
        else if(ch == '-'){
          nCountH[row] += 1;
        }
      }
    }

    int[] pCountV = new int[rules[0].length];
    for (int i = 0; i < rules[0].length; i++) {
      pCountV[i] = 0;
    }

    int[] nCountV = new int[rules[0].length];
    for (int i = 0; i < rules[0].length; i++) {
      nCountV[i] = 0;
    }

    for (int row = 0; row < rules.length; row++) {
      if (left[row] != -1){
        if (pCountH[row] != left[row]){
          return false;
        }
      }

      if (right[row] != -1){
        if (nCountH[row] != right[row]){
          return false;
        }
      }
    }
    return true;
  }

  private static boolean canPutPatternHorizontally(char[][] rules, int i, int j, char[] pat) {
    if (j - 1 >= 0 && rules[i][j - 1] == pat[0]){
      return false;
    }
    else if (i - 1 >= 0 && rules[i - 1][j] == pat[0]){
      return false;
    }
    else if (i - 1 >= 0 && rules[i - 1][j + 1] == pat[1]){
      return false;
    }
    else if (j + 2 < rules[0].length && rules[i][j + 2] == pat[1]){
      return false;
    }
    return true;
  }
}
