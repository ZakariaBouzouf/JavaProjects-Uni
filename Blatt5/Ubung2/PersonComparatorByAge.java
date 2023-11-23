import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person>{
    @Override
    public int compare(Person o1,Person o2){
        return (o1.age < o2.age ) ? -1 :((o1.age == o2.age) ? 0 : 1);
    }
}
