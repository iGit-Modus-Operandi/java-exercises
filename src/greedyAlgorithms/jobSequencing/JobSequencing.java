package greedyAlgorithms.jobSequencing;

import java.util.ArrayList;

public class JobSequencing {

  char id;
  int deadline, profit;

  public JobSequencing() {
  }

  public JobSequencing(char id, int deadline, int profit) {
    this.id = id;
    this.deadline = deadline;
    this.profit = profit;
  }

  public static void main(String[] args) {
    ArrayList<JobSequencing> arr = new ArrayList<>();
    arr.add(new JobSequencing('a', 2, 100));
    arr.add(new JobSequencing('b', 1, 19));
    arr.add(new JobSequencing('c', 2, 27));
    arr.add(new JobSequencing('d', 1, 25));
    arr.add(new JobSequencing('e', 3, 15));

    System.out.println("Following is maximum profit sequence of jobs");

    JobSequencing jobSequence = new JobSequencing();
  }
}
