package greedyAlgorithms.miceToHoles;

import java.util.ArrayList;

public class MiceToHoles {

  public static void main(String[] args) {
    ArrayList<Integer> mice = new ArrayList<>();
    mice.add(4);
    mice.add(-4);
    mice.add(2);

    ArrayList<Integer> holes = new ArrayList<>();
    holes.add(4);
    holes.add(0);
    holes.add(5);

    System.out.println("The last mouse gets into " + "the hole in time: " + assignHole(mice, holes));
  }

  private static int assignHole(ArrayList<Integer> mice, ArrayList<Integer> holes) {
    int max = 0;
    return Math.abs(max);
  }
}
