package greedyAlgorithms.waterConnection;

public class WaterConnection {

  static int numberOfHouses, numberOfPipes;
  static int startingVertexOfPipes[] = new int[1100];
  static int endingVertexOfPipes[] = new int[1100];
  static int diameterOfPipes[] = new int[1100];
  
  public static void main(String[] args) {
    numberOfHouses = 9;
    numberOfPipes = 6;

    for (int i = 0; i < 1100; i++) {
      endingVertexOfPipes[i] = startingVertexOfPipes[i] = diameterOfPipes[i] = 0;
    }
    
    int arr[][] = {{7, 4, 98}, {5, 9, 72}, {4, 6, 10}, {2, 8, 22}, {9, 7, 17}, {3, 1, 66}};
    solve(arr);
  }

  private static void solve(int[][] arr) {
  }
}
