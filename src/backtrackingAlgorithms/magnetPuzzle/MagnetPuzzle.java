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

  private static boolean canPutPatternHorizontally(char[][] rules, int i, int j, char[] pat) {
    return true;
  }

  private static boolean checkConstraints(char[][] rules) {
    return true;
  }
}
