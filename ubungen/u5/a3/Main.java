import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<Integer> s1 = new TreeSet<>();
    Set<Integer> s2 = new TreeSet<>();
    Set<Integer> s3 = new TreeSet<>();
    Set<Integer> s0 = new TreeSet<>();

    // Set<String> s1 = new TreeSet<>();
    // Set<String> s2 = new TreeSet<>();
    // Set<String> s0 = new TreeSet<>();
    
    // s1.add("a");
    // s1.add("b");
    // s1.add("c");
    // s2.add("d");
    // s2.add("e");
    s1.add(1);
    s1.add(2);
    s1.add(3);
    s2.add(4);
    s2.add(5);
    s3.add(6);
    s3.add(7);
    s0 = SetUtils.union(s1,s2,s3);
    System.out.println(s0);

  }
}
