import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main {
  public static void main(String[] args) {
    // try(var fos = new FileOutputStream("Person.xml");
    //   var encoder = new XMLEncoder(fos)
    // ){
    //   Person person1 = new Person();
    //   person1.setName("test1");
    //   person1.setAge(22);
    //   Person person2 = new Person();
    //   person2.setName("test2");
    //   person2.setAge(12);
    //   encoder.writeObject(person1);
    //   encoder.writeObject(person2);
    // }catch(Exception e){
    //
    // }
    // try(var fis = new FileInputStream("Person.bat");
    // var ois = new ObjectInputStream(fis)){
    //   var readObject1 = (Person) ois.readObject();
    //   // var readObject2 = (Person) ois.readObject();
    //   System.out.println(readObject1.getName());
    //   // System.out.println(readObject2);
    // }catch(Exception e ){
    //
    // }
  }
}
