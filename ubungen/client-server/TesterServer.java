import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TesterServer {
  public static void main(String[] args) {
    try(ServerSocket server = new ServerSocket(2000)){
      while (true) {
        try (Socket connection = server.accept();
        var os = connection.getOutputStream();
        var oos = new ObjectOutputStream(os);
        var is = connection.getInputStream();
        var ois = new ObjectInputStream(is)
      ){
          int data = (Integer) ois.readObject();
          boolean resp = false;
          if (data % 2 == 0){
            resp = true;
          }

          oos.writeObject(resp);
          oos.flush();
        } catch (Exception e) {
          System.out.println("Fehler");
        }
      }
    }catch(Exception e){
      System.out.println("Fehler");
    }
  }
}
