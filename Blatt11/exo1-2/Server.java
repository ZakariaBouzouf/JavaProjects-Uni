import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;

public class Server {
  // private Socket socket;
  //
  // public Server(Socket socket) {
  // this.socket = socket;
  // }

  public static void main(String[] args) throws SQLException {
    // Socket socket = new Socket();
    Server server = new Server();
    server.run();
  }

  private void service(Socket socket, Connection dbConnection) throws SQLException {
    try (var ois = new ObjectInputStream(socket.getInputStream());
        var oos = new ObjectOutputStream(socket.getOutputStream());) {

      DBHelper dbHelper = new DBHelper(dbConnection);
      System.out.println("Connection accepted to " + socket);

      Actions action = (Actions) ois.readObject();

      if (action == Actions.LOGIN) {
        try {
          System.out.println("Trying to login...");
          dbHelper.initConnection();

          String userName = (String) ois.readObject();
          String pws = (String) ois.readObject();
          if (dbHelper.passwordCheck(userName, pws, dbConnection)) {
            System.out.println("Login successed.[Server]");
            oos.writeObject(Response.SUCCESS);
            oos.flush();
          } else {
            System.out.println("User doesn't exist.[Server]");
            oos.writeObject(Response.FAILURE);
            oos.flush();
          }
        } catch (SQLWarning e) {
          throw new RuntimeException(e);
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          dbHelper.tryCloseConnection();
        }
      } else if (action == Actions.REGISTER) {
        try {
          System.out.println("Trying to register.");
          dbHelper.initConnection();

          String userName = (String) ois.readObject();
          String pws = (String) ois.readObject();
          String firstName = (String) ois.readObject();
          String lastName = (String) ois.readObject();
          if (!dbHelper.userChecking(userName, dbConnection)) {
            dbHelper.addUser(dbConnection, userName, pws, firstName, lastName);
            System.out.println("User had beeing added.[Server]");
            oos.writeObject(Response.SUCCESS);
            oos.flush();
          } else {
            System.out.println("User alread exist.[Server]");
            oos.writeObject(Response.FAILURE);
            oos.flush();
          }
        } finally {
          dbHelper.tryCloseConnection();
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void run() {
    System.out.println("im here2");
    try (Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:dbname.db");
        ServerSocket server = new ServerSocket(1300);) {
      while (true) {
        System.out.println("im here");
        Socket socket = null;
        // try(Socket socket = server.accept();) //
        // We don't need the socket.close than.
        try {
          socket = server.accept();
          service(socket, dbConnection);
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          try {
            socket.close();
            System.out.println("Closed connection to: " + socket);
          } catch (IOException e) {
            e.printStackTrace();
          } catch (NullPointerException e) {
            e.printStackTrace();
          }
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
