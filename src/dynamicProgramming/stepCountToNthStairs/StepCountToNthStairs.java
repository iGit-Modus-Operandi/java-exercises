package dynamicProgramming.stepCountToNthStairs;

import java.util.Scanner;

public class StepCountToNthStairs {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int steps = scanner.nextInt();

    System.out.println(countSteps(steps));
  }

  private static int countSteps(int steps) {
    if (steps == 0){
      return 1;
    }
    else if (steps < 0){
      return 0;
    }
    else{
      return countSteps(steps - 3) + countSteps(steps - 2) + countSteps(steps - 1);
    }
  }
}
