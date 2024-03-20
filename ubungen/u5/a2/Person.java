import java.util.Comparator;
import java.util.Objects;

public class Person {
  private String lastName, firstName;
  private int age;
  private double height;

  public Person(String lastName, String firstName, int age, double height) {
    // if (lastName == null | firstName == null){
    // throw new IllegalArgumentException();
    // }
    if (age == 0 | height == 0) {
      throw new IllegalArgumentException();
    }
    // this.lastName = lastName;
    // this.firstName = firstName;
    this.lastName = Objects.requireNonNull(lastName);
    this.firstName = Objects.requireNonNull(firstName);
    this.age = age;
    this.height = height;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // @Override
  // public int compareTo(Person o1,Person o2){
  //   if (o1.getAge() > o2.getAge()){
  //     return 1;
  //   }else if (o1.getAge() < o2.getAge()){
  //     return -1;
  //   }else {
  //     return 0;
  //   }
  // }

  @Override
  public String toString(){
    return "My name is "+ lastName + ". My age is : "+age;
  }
}
