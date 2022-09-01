package greedyAlgorithms.activitySelection;

public class ActivitySelection {

  public static void main(String[] args) {
    int[] startTime = {1, 3, 0, 5, 8, 5};
    int[] finishTime = {2, 4, 6, 7, 9, 9};
    int totalActivities = startTime.length;

    printMaxActivities(startTime, finishTime, totalActivities);
  }

  private static void printMaxActivities(int[] startTime, int[] finishTime, int totalActivities) {
    int i, j;

    System.out.println("Following activities are selected: \n");
    i = 0;
    System.out.println(i + " ");

    for (int j = 1; j < startTime.length; j++) {
      if (startTime[j] >= finishTime[i]){
        System.out.println(j + " ");
        i = j;
      }
    }
  }
}
