package linkedListAlgorithms.builtInMethods;

import java.util.LinkedList;

public class BuiltInMethods {

  public static void main(String[] args) {
    LinkedList<String> sins = new LinkedList<>();
    sins.add("Greed");
    sins.add("Envy");
    sins.add("Gluttony");
    sins.add("Lust");
    sins.add("Pride");
    sins.add("Sloth");
    sins.add("Anger");

    System.out.println(sins.size());
    System.out.println(sins.contains("Disgust"));
  }
}
