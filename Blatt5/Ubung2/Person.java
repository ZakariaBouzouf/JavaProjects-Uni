import java.util.Objects;
import java.util.Comparator;

public class Person implements Comparator<Person>{
    protected String lastName;
    protected String firstName;
    protected int age;
    protected Double height;

    // public Person(String lastName,String firstName,int age,Double height){
    //     if ( firstName != null && lastName != null){
    //         this.firstName = firstName;
    //         this.lastName = lastName;
    //     }else {
    //         throw new IllegalArgumentException();
    //     }
    //     if (age >= 0 && height >= 0.0){
    //         this.age = age;
    //         this.height = height;
    //     }else{
    //         throw new IllegalArgumentException();
    //     }
    // }
    public Person(String firstName,String lastName,int age,Double height){
        this.lastName=Objects.requireNonNull(lastName,"The last name cannot be null.");
        this.firstName=Objects.requireNonNull(firstName,"The last name cannot be null.");

        if (age >= 0 && height >= 0.0){
            this.age = age;
            this.height = height;
        }else{
            throw new IllegalArgumentException();
        }
    }
    // public int compare(Person o1,Person o2){
   //     return (o1.age > o2.age ) ? -1 :((o1.age == o2.age) ? 0 : 1);
    // }
    public int compare(Person o1,Person o2){
        return (o1.age < o2.age ) ? -1 :((o1.age == o2.age) ? 0 : 1);
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public String toString(){
        return "My name is : "+firstName+" "+lastName+".I'm "+age+" old, and "+height+" meter tall.";
    }
     
}

