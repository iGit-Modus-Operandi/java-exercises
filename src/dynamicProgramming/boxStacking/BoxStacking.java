package dynamicProgramming.boxStacking;

public class BoxStacking {

  private static class Box implements Comparable<Box>{
    int h, w, d, area;

    public Box(int h, int w, int d){
      this.h = h;
      this.w = w;
      this.d = d;
    }

    public int compareTo(Box o){
      return o.area-this.area;
    }

  }

  public static void main(String[] args) {
    Box[] arr = new Box[4];
    arr[0] = new Box(4, 6, 7);
    arr[1] = new Box(1, 2, 3);
    arr[2] = new Box(4, 5, 6);
    arr[3] = new Box(10, 12, 32);

    System.out.println("The maximum possible height of the stack is " + maxStackHeight(arr, 4));
  }

  private static String maxStackHeight(Box[] arr, int i) {
  }
}
