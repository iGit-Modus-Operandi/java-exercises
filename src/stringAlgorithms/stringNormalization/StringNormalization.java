package stringAlgorithms.stringNormalization;

public class StringNormalization {

  public static void main(String[] args) {
    System.out.println(normalizeString("   Hello There, BUDDY "));
  }

  private static String normalizeString(String s) {
    return s.toLowerCase().trim().replace(",", "")
  }
}
