import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> list1 = new TreeSet<>();
        list1.add(2);
        list1.add(1);
        Set<Integer> list2 = new TreeSet<>();
        list2.add(43);
        list2.add(4);
        Set<Double> list3 = new TreeSet<>();
        list3.add(2.4);
        list3.add(8.4);
        Set<Double> list4 = new TreeSet<>();
        list3.add(24.4);
        list3.add(8.234);
        SetUtils<Integer> util = new SetUtils<>();
        // System.out.println(util.union(list3,list4));
        System.out.println(util.intersection(list3,list4));
    }
}
