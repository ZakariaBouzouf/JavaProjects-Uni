import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("PAZE","A",40,2.3);
            Person person1 = new Person("PAZE","B",50,1.3);
            Person person2 = new Person("PAZE","C",60,0.3);
            List<Person> persons = new ArrayList<>();

            persons.add(person2);
            persons.add(person1);
            persons.add(person);
            System.out.println(persons);
            // Anonyme Klasse
            // Collections.sort(persons, new Comparator<Person>(){
            //     public int compare(Person p1,Person p2){
            //         return (p1.age < p2.age ) ? -1 :((p1.age == p2.age) ? 0 : 1);
            //     }
            // });
            // Collections.sort(persons, Comparator<Person>());
            // Collections.sort(persons,new PersonComparatorByAge());
            // System.out.println(persons);
            // Collections.sort(persons,new PersonComparatorByName());
            // Lambda Expression
            Comparator<Person> comp = (Person p1, Person p2) ->{
                return (p1.height < p2.height) ? -1 : ((p1.height == p2.height) ? 0 :1 );
            };
            Collections.sort(persons,comp);
            System.out.println(persons);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Some of the parametres ist false.");
        }
    }    
}
