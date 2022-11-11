package greedyAlgorithms.jobSequence;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {

  char id;
  int deadline, profit;

  public JobSequence() {
  }

  public JobSequence(char id, int deadline, int profit) {
    this.id = id;
    this.deadline = deadline;
    this.profit = profit;
  }

  public static void main(String[] args) {
    ArrayList<JobSequence> arr = new ArrayList<>();
    arr.add(new JobSequence('a', 2, 100));
    arr.add(new JobSequence('b', 1, 19));
    arr.add(new JobSequence('c', 2, 27));
    arr.add(new JobSequence('d', 1, 25));
    arr.add(new JobSequence('e', 3, 15));

    System.out.println("Following is maximum profit sequence of jobs");

    JobSequence jobSequence = new JobSequence();

    jobSequence.printJobSchedule(arr, 3);
  }

  private void printJobSchedule(ArrayList<JobSequence> arr, int t) {
    Collections.sort(arr, (a, b) -> b.profit - a.profit);
    boolean result[] = new boolean[t];
    char job[] = new char[t];

    for (int i = 0; i < arr.size(); i++) {
      for (int j = Math.min(t - 1, arr.get(i).deadline - 1); j >= 0 ; j--) {
        if (result[j] == false){
          result[j] = true;
          job[j] = arr.get(i).id;
          break;
        }
      }
    }

    for (char jb: job) {
      System.out.println(jb + " ");
    }
    System.out.println();
  }
}
