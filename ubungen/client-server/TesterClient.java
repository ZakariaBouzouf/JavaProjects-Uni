import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TesterClient {
  public static void main(String[] args) {
    try (Socket socket = new Socket(InetAddress.getLocalHost(),2000);
    var os = socket.getOutputStream();
    var is = socket.getInputStream();
    var oos = new ObjectOutputStream(os);
    var ios = new ObjectInputStream(is)
  ) {
      int data = 2;
      oos.writeObject(data);
      oos.flush();

      boolean res = (boolean) ios.readObject();
      if (res){
        System.out.println("Pair");
      }else{
        System.out.println("Inpair");
      }
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
