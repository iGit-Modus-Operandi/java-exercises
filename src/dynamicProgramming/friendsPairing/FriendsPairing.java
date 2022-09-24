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
  }
}
