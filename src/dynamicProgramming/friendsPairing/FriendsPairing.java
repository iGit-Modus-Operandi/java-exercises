package dynamicProgramming.friendsPairing;

import java.util.Scanner;

public class FriendsPairing {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of friends: ");
    int friends = scanner.nextInt();
    scanner.close();
    System.out.println(countFriendPairs(friends));
  }

  private static int countFriendPairs(int friends) {
    int[] dp = new int[friends + 1];
    for (int i = 0; i <= friends ; i++) {
      if (i <= 2){
        dp[i] = i;
      } else {
        dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
      }
    }
    return dp[friends];
  }
}
