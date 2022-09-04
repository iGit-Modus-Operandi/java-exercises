package greedyAlgorithms.huffmanCoding;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCoding {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 6;
    char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    int[] charFreq = {5, 9, 12, 13, 16, 45};

    PriorityQueue<HuffmanNode>q = new PriorityQueue<HuffmanNode>(n, new MyComparator());
  }
}

