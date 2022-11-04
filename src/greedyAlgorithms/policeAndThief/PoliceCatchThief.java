package greedyAlgorithms.policeAndThief;

import java.util.ArrayList;

public class PoliceCatchThief {

  public static void main(String[] args) {
    int distance;
    int arrayLength;
    
    char[] arr1 = new char[] {'P', 'T', 'T', 'P', 'T'};
    distance = 2;
    arrayLength = arr1.length;
    System.out.println("Maximum thieves caught: " + policeThief(arr1, arrayLength, distance));
  }

  private static int policeThief(char[] arr1, int arrayLength, int distance) {
    int result = 0;
    ArrayList<Integer> thief = new ArrayList<>();
    ArrayList<Integer> police = new ArrayList<>();

    for (int i = 0; i < arrayLength; i++) {
      if (arr1[i] == 'P'){
        police.add(i);
      }
      else if (arr1[i] == 'T'){
        thief.add(i);
      }
    }

    int thiefCurrentLowIndex =0;
    int policeCurrentLowIndex = 0;
    while (thiefCurrentLowIndex < thief.size() && policeCurrentLowIndex < police.size()){
      if (Math.abs(thief.get(thiefCurrentLowIndex++) - police.get(policeCurrentLowIndex)) <= distance){
        result++;
      } else if (thief.get(thiefCurrentLowIndex) < police.get(policeCurrentLowIndex)){
        thiefCurrentLowIndex++;
      }
      else {
        policeCurrentLowIndex++;
      }
    }
    return result;
  }
}
