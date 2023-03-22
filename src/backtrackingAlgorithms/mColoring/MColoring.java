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
    }
  }

  private static boolean isSafe(boolean[][] graph, int[] color) {
  }

  private static void printSolution(int[] color) {
    System.out.println("Solution exists:" + " Following are the assigned colors ");
    for (int i = 0; i < V; i++) {
      System.out.println(" " + color[i]);
    }
    System.out.println();
  }
}
