package mathAlgorithms.uglyNumbers;

import java.util.Scanner;

public class UglyNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int userInput = scanner.nextInt();

    int uglyNumber = getUglyNumbers(userInput);

    System.out.println("The " + userInput + "th ugly number is " + uglyNumber);
  }

  private static int getUglyNumbers(int userInput) {
    int i = 1;
    int count = 1;
    while (userInput > count){
      i++;
      if (isUgly(i) == 1){
        count++;
      }
    }
    return i;
  }

  private static int isUgly(int no) {
    no = maxDivide(no, 2);
    no = maxDivide(no, 3);
    no = maxDivide(no, 5);

    return (no == 1)? 1:0;
  }

  private static int maxDivide(int a, int b) {
    while (a%b == 0){
      a = a/b;
    }
    return a;
  }
}
