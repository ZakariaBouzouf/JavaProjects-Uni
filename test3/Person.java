import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private static int age;
    
    // public Person(String name , int age){
    //     this.name = name;
    //     this.age = age;
    // }
    
  public void aging(){
    System.out.println("Test");
  }
    public String toString(){
        return String.format("The name is : %s, the age is : %s.",name,age);
    }
    
}
