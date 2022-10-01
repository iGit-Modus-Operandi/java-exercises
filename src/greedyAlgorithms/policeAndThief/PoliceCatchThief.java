package greedyAlgorithms.policeAndThief;

public class PoliceCatchThief {

  public static void main(String[] args) {
    int distance;
    int arrayLength;
    
    char[] arr1 = new char[] {'P', 'T', 'T', 'P', 'T'};
    distance = 2;
    arrayLength = arr1.length;
    System.out.println("Maximum thieves caught: " + policeThief(arr1, arrayLength, distance));
  }

  private static String policeThief(char[] arr1, int arrayLength, int distance) {
  }
}
