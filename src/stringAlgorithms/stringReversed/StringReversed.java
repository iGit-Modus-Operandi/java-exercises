/*
This algorithm can be used in trying to check whether a given string is a palindrome,
that is, words or sentences that read the same forward or reversed
*/

package stringAlgorithms.stringReversed;

public class StringReversed {

  public static void main(String[] args) {
    System.out.println(reverse("hello"));
    System.out.println(reverse(""));
    System.out.println(reverse(null));
    System.out.println(reverse("bazinga"));
    System.out.println(reverse("Live not on evil"));

    System.out.println(reverse2("hello"));
    System.out.println(reverse2(""));
    System.out.println(reverse2(null));
    System.out.println(reverse2("bazinga"));
    System.out.println(reverse2("Live not on evil"));
  }

  private static String reverse(String s) {
    if (s == null || s.isEmpty()){
      return s;
    }

    StringBuilder reversed = new StringBuilder();
    for (int i = s.length() - 1; i >= 0 ; i--) {
      reversed.append(s.charAt(i));
    }

    return reversed.toString();
  }

  private static String reverse2(String s) {
    if (s == null || s.isEmpty()){
      return s;
    }

    StringBuilder sb = new StringBuilder(s);
      return sb.reverse().toString();
  }
}
