package mathAlgorithms.floatToNaturalConvertingFactor;

import java.util.Scanner;

public class FloatToNaturalConvertingFactor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    System.out.println(convertToNatural(userInput));
  }

  private static int convertToNatural(String userInput) {
    int countAfterDot = 0;
    boolean dotSeen = false;
    int num = 0;
    for (int i = 0; i < userInput.length(); i++) {
      if (userInput.charAt(i) != '.'){
        num = num * 10 + (userInput.charAt(i) - '0');
        if (dotSeen == true){
          countAfterDot++;
        } else {
          dotSeen = true;
        }
      }
    }
    if (dotSeen == false){
      return 1;
    }

    int dem = (int) Math.pow(10, countAfterDot);

    return (dem / gcd (num, dem));
  }

  private static int gcd(int a, int b) {

  }
}
