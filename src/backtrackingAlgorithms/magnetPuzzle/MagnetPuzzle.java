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

  private static void solveMagnets(char[][] rules, int i, int i1) {
  }
}
