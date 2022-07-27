package searchingAlgorithms.jumpSearch;

import java.util.Random;
import java.util.Scanner;

public class JumpSearch {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value to be searched: ");
    int searchValue = scanner.nextInt();

    int searchResult = jumpSearch(numbers, searchValue);

    if (searchResult == -1){
      System.out.println("No such value was found.");
    } else {
      System.out.println("The value you are searching was found at index " + searchResult);
    }
  }

  private static int jumpSearch(int[] numbers, int searchValue) {
    int step = (int) Math.floor(Math.sqrt(numbers.length));
    int prev = 0;

    while (numbers[Math.min(step, numbers.length)] < searchValue) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(numbers.length));
      if (prev >= numbers.length) {
        return -1;
      }
    }

    while (numbers[prev] < searchValue) {
      prev++;
      if (prev == Math.min(step, numbers.length)) {
        return -1;
      }
    }

    if (numbers[prev] == searchValue) {
      return prev;
    }

    return -1;
  }
}
