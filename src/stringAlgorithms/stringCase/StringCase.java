package stringAlgorithms.stringCase;

public class StringCase {

  public static void main(String[] args) {
    System.out.println(isUpperCase("hello"));
    System.out.println(isUpperCase("HELLO"));

    System.out.println(isLowerCase("hello"));
    System.out.println(isLowerCase("HELLO"));

    System.out.println(isUpperCase("heLLo"));
    System.out.println(isLowerCase("heLLo"));
  }

  private static boolean isLowerCase(String s) {
    return s.chars().allMatch(Character::isUpperCase);
  }

  private static boolean isUpperCase(String s) {
    return s.chars().allMatch(Character::isLowerCase);
  }
}
