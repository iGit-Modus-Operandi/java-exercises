package dynamicProgramming.subsetSum;

import java.util.Random;
import java.util.Scanner;

public class SubsetSum {

  public static void main(String[] args) {
    Random random = new Random();
    int[] set = new int[6];
    
    for (int i = 0; i < set.length; i++) {
      set[i] = random.nextInt();
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter sum: ");
    int sum = scanner.nextInt();
    
    if (isSubsetSum(set, set.length, sum) == true){
      System.out.println("Found a subset with given sum");
    } else {
      System.out.println("No subset with given sum");
    }
  }

  private static boolean isSubsetSum(int[] set, int length, int sum) {
  }
}
