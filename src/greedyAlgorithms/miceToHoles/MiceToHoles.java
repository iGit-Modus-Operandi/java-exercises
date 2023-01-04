package greedyAlgorithms.miceToHoles;

import java.util.ArrayList;
import java.util.Collections;

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
    if (mice.size() != holes.size()){
      return -1;
    }

    Collections.sort(mice);
    Collections.sort(holes);

    int size = mice.size();
    int max = 0;

    for (int i = 0; i < size; i++) {
      if (max < Math.abs(mice.get(i) - holes.get(i))){
        max = Math.abs(mice.get(i) - holes.get(i));
      }
    }

    return Math.abs(max);
  }
}
