/*This validation algorithm normalizes string input by converting it into a format more standard and useable
afterwards. It also removes extra unnecessary whitespaces and delimiters to have strings-only inputs.*/

package stringAlgorithms.stringNormalization;

public class StringNormalization {

  public static void main(String[] args) {
    System.out.println(normalizeString("   Hello There, BUDDY "));
  }

  private static String normalizeString(String s) {
    return s.toLowerCase().trim().replace(",", "");
    // trim method removes whitespaces from the input string
  }
}
