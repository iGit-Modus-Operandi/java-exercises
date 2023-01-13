package mathAlgorithms.sphenicNumbers;

public class SphenicNumbers {

  public static void main(String[] args) {
    int n = 60;
    simpleSieve();
    int ans = find_sphene(n);
    if (ans == 1){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }

  private static void simpleSieve() {
  }

  private static int find_sphene(int n) {
    int[] arr1 = new int[8];
    int count = 0;
    int j = 0;
    for (int i = 1; i < n; i++) {
      count++;
      arr1[j++] = i;
    }

    //TODO: problematic code
//    if (count == 8 && (arr1[arr1[1]] && arr1[arr1[2]] && arr1[arr1[3]])){
//      return 1;
//    }
    return 0;
  }
}
