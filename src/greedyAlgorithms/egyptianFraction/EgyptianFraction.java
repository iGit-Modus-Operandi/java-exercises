package greedyAlgorithms.egyptianFraction;

public class EgyptianFraction {

  public static void main(String[] args) {
    int numerator = 6;
    int denominator = 14;

    System.out.println("Egyptian fraction representation of " + numerator + "/" + denominator + " is \n");
    printEgyptianFraction(numerator, denominator);
  }
}
