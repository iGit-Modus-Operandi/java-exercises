package greedyAlgorithms.waterConnection;

import java.util.ArrayList;
import java.util.List;

public class WaterConnection {

  static int numberOfHouses, numberOfPipes;
  static int startingVertexOfPipes[] = new int[1100];
  static int endingVertexOfPipes[] = new int[1100];
  static int diameterOfPipes[] = new int[1100];

  static List<Integer> a = new ArrayList<>();
  static List<Integer> b = new ArrayList<>();
  static List<Integer> c = new ArrayList<>();

  static int ans;

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
    int i = 0;
    while (i < numberOfPipes){
      int q = arr[i][0];
      int h = arr[i][1];
      int t = arr[i][2];

      startingVertexOfPipes[q] = h;
      diameterOfPipes[q] = t;
      endingVertexOfPipes[h] = q;
      i++;
    }

    a = new ArrayList<Integer>();
    b = new ArrayList<Integer>();
    c = new ArrayList<Integer>();

    for (int j = 1; j < numberOfHouses; ++j) {
      if (endingVertexOfPipes[j] == 0 && startingVertexOfPipes[j] > 0){
        ans = 1000000000;
        int w = dfs(j);
        a.add(j);
        b.add(w);
        c.add(ans);
      }
    }
    System.out.println(a.size());

    for (int j = 0; j < a.size(); ++j) {
      System.out.println(a.get(j) + " " + b.get(j) + " " + c.get(j));
    }
  }

  private static int dfs(int w) {
    if (startingVertexOfPipes[w] == 0){
      return w;
    }

    if (diameterOfPipes[w] < ans){
      ans = diameterOfPipes[w];
    }

    return dfs(startingVertexOfPipes[w]);
  }
}
