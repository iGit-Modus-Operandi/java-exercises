package sortingAlgorithms.bogoSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BogoSort {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter desired number of values to be sorted: ");
    int number = scanner.nextInt();

    Random random = new Random();
    List<Integer> numberList = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      numberList.add(random.nextInt(10000));
    }

    while (!isListSorted(numberList)){
      Collections.shuffle(numberList);
    }

    numberList.forEach(i -> System.out.println(i));
  }

  private static boolean isListSorted(List<Integer> numberList) {
    if (numberList == null){
      return true;
    }

    int length = numberList.size();
    if (length <= 1){
      return true;
    }

    for (int i = 0; i < length - 1; i++){
      if (numberList.get(i) > numberList.get(i + 1)){
        return false;
      }
    }
    return true;
  }
}
