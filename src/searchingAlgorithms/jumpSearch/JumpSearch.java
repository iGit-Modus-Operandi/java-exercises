package searchingAlgorithms.jumpSearch;

import java.util.Random;
import java.util.Scanner;

public class JumpSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers [i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = jumpSearch (numbers, searchValue);


  }

  private static int jumpSearch(int[] numbers, int searchValue) {
    return -1;
  }
}
