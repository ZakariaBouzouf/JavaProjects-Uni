import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException,InvalidPathException,RuntimeException {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Type the path of the file or type 'quit' to end the programm.");
      // System.out.println(scanner.nextLine());
      String input = scanner.nextLine();
      if(input.equals("quit")){
        break;
      }else{
        System.out.println("your file is :");
        Path path = Path.of(input);
        String content = Files.readString(path);
        System.out.println(content);
      }
    }

  }
}
