package greedyAlgorithms.jobSequence;

import java.util.ArrayList;

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
  }
}
