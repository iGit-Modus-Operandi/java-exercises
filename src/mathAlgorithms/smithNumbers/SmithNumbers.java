package mathAlgorithms.smithNumbers;

public class SmithNumbers {

  public static void main(String[] args) {
    sieveOfSundaram();
    System.out.println("Printing first few Smith numbers using isSmith()");
    for (int i = 0; i < 500; i++) {
      if (isSmith(i)){
        System.out.println(i + " ");
      }
    }
  }

  private static void sieveOfSundaram() {
  }

  private static boolean isSmith(int i) {
  }
}
