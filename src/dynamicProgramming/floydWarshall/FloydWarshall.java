package dynamicProgramming.floydWarshall;

public class FloydWarshall {

  final static int INF = 99999, V = 4;
  public static void main(String[] args) {

    int graph[][] = {{0, 5, INF, 10},
        {INF, 0, 3, INF},
        {INF, INF, 0, 1},
        {INF, INF, INF, 0}};

    FloydWarshall a = new FloydWarshall();
    a.floydWarshall(graph);
  }

  private static void floydWarshall(int[][] graph) {
  }
}
