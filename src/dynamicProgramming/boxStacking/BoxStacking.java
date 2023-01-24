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
  }
}
