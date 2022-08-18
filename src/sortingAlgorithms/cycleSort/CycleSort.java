package sortingAlgorithms.cycleSort;

import java.util.Random;

public class CycleSort {

  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Before sorting");
    printArray(numbers);

    cycleSort(numbers);

    System.out.println("After sorting");
    printArray(numbers);
  }

  private static void cycleSort(int[] numbers) {
    int writes = 0;

    for (int cycleStart = 0; cycleStart < numbers.length; cycleStart++) {
      int item = numbers[cycleStart];
      int pos = cycleStart;

      for (int i = cycleStart + 1; i < numbers.length; i++) {
        if (numbers[i] < item){
          pos++;
        }
      }

      if (pos == cycleStart){
        continue;
      }

      while (item == numbers[pos]){
        pos += 1;
      }

      if (pos != cycleStart){
        int temp = item;
        item = numbers[pos];
        numbers[pos] = temp;
        writes++;
      }

      while (pos != cycleStart){
        pos = cycleStart;

        for (int i = cycleStart + 1; i < numbers.length; i++) {
          if (numbers[i] < item){
            pos += 1;
          }
        }

        while (item == numbers[pos]){
          pos += 1;
        }

        if (item != numbers[pos]){
          int temp = item;
          item = numbers[pos];
          numbers[pos] = temp;
          writes++;
        }
      }
    }
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
