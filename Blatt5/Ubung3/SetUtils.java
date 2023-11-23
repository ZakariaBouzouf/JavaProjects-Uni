import java.util.Set;
import java.util.TreeSet;

public class SetUtils <T>{
    public static <T> Set<T> union(Set<T>... values){
        Set<T> nums = new TreeSet<>();
        for (Set<T> element : values){
            for(T ele : element){
                nums.add(ele);
            }
        }
        return nums;
    }
    public static <T> Set<T> intersection(Set<T>... values){
        Set<T> schnitt = new TreeSet<>();
        System.out.println(values.length);

        for (Set<T> element : values){
            // while (element)
            System.out.println(element);
        }
        return schnitt;
    }
}
