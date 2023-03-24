package backtrackingAlgorithms.mColoring;

public class MColoring {
  
  static int V = 4;
  
  public static void main(String[] args) {
    boolean[][] graph = {{false, true, true, true},
        {true, false, true, false},
        {true, true, false, true},
        {true, false, true, false},};
    int m = 3; // number of colors
    
    int[] color = new int[V];
    for (int i = 0; i < V; i++) {
      color[i] = 0;
    }
    if(!graphColoring(graph, m, 0, color)){
      System.out.println("Solution does not exist");
    }
  }

  private static boolean graphColoring(boolean[][] graph, int m, int i, int[] color) {
    if(i == V){
      if(isSafe(graph, color)){
        printSolution(color);
        return true;
      }
      return false;
    }

    for (int j = 1; j < m; j++) {
      color[i] = j;

      if(graphColoring(graph, m, i + 1, color)){
        return true;
      }
      color[i] = 0;
    }
    return false;
  }

  private static boolean isSafe(boolean[][] graph, int[] color) {
    for (int i = 0; i < V; i++) {
      for (int j = i + 1; j < V; j++) {
        if(graph[i][j] && color[j] == color[i]){
          return false;
        }
      }
    }
    return true;
  }

  private static void printSolution(int[] color) {
    System.out.println("Solution exists:" + " Following are the assigned colors ");
    for (int i = 0; i < V; i++) {
      System.out.println(" " + color[i]);
    }
    System.out.println();
  }
}
