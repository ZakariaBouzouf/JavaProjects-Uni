import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ios = null;
        try {
            // fos = new FileOutputStream("test.txt");
            // oos = new ObjectOutputStream(fos);
            fis = new FileInputStream("test.txt");
            ios = new ObjectInputStream(fis);

            Person person1 = new Person("Sim", 23);
            Person person2 = new Person("Sim", 23);

            // oos.writeObject(person1);
            // oos.writeObject(person2);

            // Person person3 = 
            ios.close();

            System.out.println("Objects have been written.");
        } catch (IOException e) {
            System.out.println("An error occured : "+e.getMessage());
        }
    }
}
