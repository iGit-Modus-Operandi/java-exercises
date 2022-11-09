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
    ArrayList<JobSequencing> arr = new ArrayList<JobSequencing>();
  }
}
