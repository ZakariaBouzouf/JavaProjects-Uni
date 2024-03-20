import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    try {
      Person person1 = new Person("a", "Et", 4, 23);
      Person person2 = new Person("b", "Et", 2, 23);
      Person person3 = new Person("c", "Et", 1, 23);

      List<Person> persons = new ArrayList<Person>();
      persons.add(person1);
      persons.add(person2);
      persons.add(person3);
      for (Person p : persons) {
        System.out.println(p);
      }
      persons.sort()
    } catch (IllegalArgumentException e) {
      System.out.println("The age and height cannot be null.");
    } catch (NullPointerException e) {
      System.out.println("The Last und first names cannot be null.");
    }

  }
}
