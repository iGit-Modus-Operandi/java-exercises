package dynamicProgramming.coinChange;

import java.util.Scanner;

public class CoinChange {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter amount to be changed into coins: ");
    
    int sum = scanner.nextInt();
    int[] coins = {1, 2, 3};
    
    System.out.println(count(coins, coins.length, sum));
  }

  private static int count(int[] coins, int length, int sum) {
    if (sum == 0){
      return 1;
    }

    if (sum < 0){
      return 0;
    }

    if (length < 0){
      return 0;
    }

    return count(coins, length - 1, sum) + count(coins, length, sum - coins[length - 1]);
  }
}
