package mathAlgorithms.sphenicNumbers;

public class SphenicNumbers {

  public static void main(String[] args) {
    int n = 60;
    simpleSieve();
    int ans = find_sphere(n);
    if (ans == 1){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }

  private static void simpleSieve() {
  }

  private static int find_sphere(int n) {
  }
}
