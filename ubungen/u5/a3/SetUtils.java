import java.util.Set;
import java.util.TreeSet;

public class SetUtils<T> {

  public static <T> Set<T> union (Set<T>...sets){
  Set<T> s0 = new TreeSet<T>();
    // for (T element : s1){
    //   s0.add(element);
    // }
    for (Set<T> set : sets){
      for(T element : set){
        s0.add(element);
      }
    }
    return  s0;
  }
}
