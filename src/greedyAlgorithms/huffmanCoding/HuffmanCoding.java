package greedyAlgorithms.huffmanCoding;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCoding {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 6;
    char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    int[] charFreq = {5, 9, 12, 13, 16, 45};

    PriorityQueue<HuffmanNode> queue = new PriorityQueue<HuffmanNode>(n, new MyComparator());

    for (int i = 0; i < n; i++) {
      HuffmanNode node = new HuffmanNode();

      node.c = charArray[i];
      node.data = charFreq[i];
      
      node.left = null;
      node.right = null;
      
      queue.add(node);
    }
    
    HuffmanNode root = null;
    
    while (queue.size() > 1){
      HuffmanNode x = queue.peek();
      queue.poll();
      
      HuffmanNode y = queue.peek();
      queue.poll();
      
      HuffmanNode f = new HuffmanNode();
      
      f.data = x.data + y.data;
      f.c = '-';
      
      f.left = x;
      f.right = y;
      
      root = f;
      
      queue.add(f);
      
    }
    
    printCode(root, "");
  }

  private static void printCode(HuffmanNode root, String s) {
    if (root.left == null && root.right == null && Character.isLetter(root.c)){
      System.out.println(root.c + ":" + s);
      return;
    }
    printCode(root.left, s + "0");
    printCode(root.right, s + "1");
  }
}

