/*This validation algorithm checks whether a given string is in upper or lower case*/
package stringAlgorithms.stringCase;

public class StringCase {

  public static void main(String[] args) {
    System.out.println(isUpperCase("hello"));
    System.out.println(isUpperCase("HELLO"));

    System.out.println(isLowerCase("hello"));
    System.out.println(isLowerCase("HELLO"));

//  The all match method guarantees that every character in the string matches the required condition,
//    hence, this will results to false
    System.out.println(isUpperCase("heLLo"));
    System.out.println(isLowerCase("heLLo"));
  }

//  The following methods uses stream api and the method reference operator (::)
//  which is used to call a method by referring to it with the help of its class directly
//  Syntax: <Class name>::<method name>

  private static boolean isLowerCase(String s) {
    return s.chars().allMatch(Character::isUpperCase);
  }

  private static boolean isUpperCase(String s) {
    return s.chars().allMatch(Character::isLowerCase);
  }
}
