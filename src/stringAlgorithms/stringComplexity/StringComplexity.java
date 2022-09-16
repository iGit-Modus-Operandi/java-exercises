package stringAlgorithms.stringComplexity;

public class StringComplexity {

  public static void main(String[] args) {
    System.out.println(stringComplexity("Hell0"));
  }

  private static boolean stringComplexity(String s) {
    return s.chars().anyMatch(Character::isUpperCase) &&
        s.chars().anyMatch(Character::isLowerCase) &&
        s.chars().anyMatch(Character::isDigit);
  }
}
