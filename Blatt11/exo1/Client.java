import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
  // private int port ;
  //
  // public Client(int port){
  // this.port = port;
  // }

  public boolean login(String userName, String pwd) {
    boolean responseLogin = false;
    try (Socket socket = new Socket(InetAddress.getLocalHost(), 1300);
        var oos = new ObjectOutputStream(socket.getOutputStream());
        var ois = new ObjectInputStream(socket.getInputStream())) {
      oos.writeObject(Actions.LOGIN);
      oos.writeObject(userName);
      oos.writeObject(pwd);
      oos.flush();

      Response res = (Response) ois.readObject();
      if (res == Response.SUCCESS) {
        System.out.println("User and Password are correct.");
        responseLogin = true;
      } else {
        System.out.println("User or Password aren't correct.");
      }
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return responseLogin;
  }

  public boolean register(String userName, String pwd, String firstName, String lastName) {
    boolean responseRegister = false;
    try (Socket socket = new Socket(InetAddress.getLocalHost(), 1300);
        var oos = new ObjectOutputStream(socket.getOutputStream());
        var ois = new ObjectInputStream(socket.getInputStream());) {
      oos.writeObject(Actions.REGISTER);
      oos.writeObject(userName);
      oos.writeObject(pwd);
      oos.writeObject(firstName);
      oos.writeObject(lastName);
      oos.flush();

      Response res = (Response) ois.readObject();
      if (res == Response.SUCCESS) {
        responseRegister = true;
        System.out.println("Your registration has succed.[client]");
      } else if (res == Response.FAILURE){
        System.out.println("Your registration has failed.[client]");
      }
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {  //Objectout-intputstream
      e.printStackTrace();
    } catch (ClassNotFoundException e) {  // for readObject
      e.printStackTrace();
    }

    return responseRegister;
  }
}
