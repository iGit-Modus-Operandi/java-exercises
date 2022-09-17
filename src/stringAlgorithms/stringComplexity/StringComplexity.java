/*This validation algorithm checks a given string's complexity, that is, if it uses lower and uppercase as well as digits.
 This  is especially helpful in cases such as checking a given user password to increase complexity / guessing difficulty*/
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
