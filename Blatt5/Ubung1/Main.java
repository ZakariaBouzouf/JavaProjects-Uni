import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path file or quit to end the programm.");
        Boolean a = true;
        while(a){
            String response = scanner.nextLine();
            response.toLowerCase();
            if (response.equals("quit")){
                scanner.close();
                a=false;
            }else{
                try {
                    String data = Files.readString(Path.of(response));
                    System.out.println(data);
                }catch (IOException e){
                    System.out.println("The file doesn't exist.");
                }
                catch (InvalidPathException e) {
                    System.out.println("The path of the files is incorrect.");
                }
            }
        }
        System.out.println("Test");
        
    }
}
