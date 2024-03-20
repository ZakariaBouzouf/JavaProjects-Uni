import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBHelper {
  private static Connection connection;

  public DBHelper (Connection connection){
    this.connection = connection;
  }

  public static void main(String[] args) throws SQLException {
    DBHelper dbHelper = new DBHelper(connection);
    try {
      dbHelper.initConnection();
      dbHelper.initTable(connection);
      dbHelper.initData(connection);
      if (dbHelper.userChecking("User2",connection)){
        System.out.println("User exist.");
      }else{
        System.out.println("User doesn't exist.");
      }
    } catch (SQLWarning e) {
      throw new RuntimeException(e);
    } finally {
      dbHelper.tryCloseConnection();
    }
  }

  public void initConnection() throws SQLException {
    connection = DriverManager.getConnection("jdbc:sqlite:dbname.db");
    System.out.println("[Connected to Database.]");
  }

  public void tryCloseConnection() throws SQLException {
    if (connection != null) {
      try {
        connection.close();
        System.out.println("[Disconnected from Database.]");
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public void initTable(Connection connection) throws SQLException {
    Statement stmt = connection.createStatement();
    stmt.setQueryTimeout(30);

    stmt.execute("DROP TABLE IF EXISTS users");
    stmt.execute("CREATE TABLE users " +
        "(userName STRING PRIMARY KEY," +
        "pws STRING, " +
        "lastName STRING," +
        "firstName STRING)");
  }

  public void initData(Connection connection) throws SQLException{
    Statement stmt = connection.createStatement();
    stmt.setQueryTimeout(30);

    List<User> users = new ArrayList<>(List.of(
      new User("User1","1111","name1","name01"),
      new User("User2","1111","name2","name02"),
      new User("User3","1111","name3","name03"),
      new User("User4","1111","name4","name04")
    ));

    for (User u : users){
      stmt.execute("INSERT INTO users (userName,pws, lastName,firstName)" + 
      "VALUES('" + u.getUserName() + "', '" + u.getPws() + "','" + u.getLastName() + "','" + u.getFirstName() + "')"
      );
    }
  }

  public void addUser(Connection connection,String userName, String pws, String firstName , String lastName) throws SQLException {
    Statement stmt = connection.createStatement();
    stmt.setQueryTimeout(30);

    // Scanner scanner = new Scanner(System.in);
    //
    // String userName = ""; 
    // while (userChecking(userName)){
    //   System.out.println("Enter the User Name :");
    //   userName = scanner.nextLine();
    // }
    //
    // System.out.println("Enter the User password :");
    // String pwd = scanner.nextLine();
    //
    // System.out.println("Enter the Last Name :");
    // String lastName = scanner.nextLine();
    //
    // System.out.println("Enter the First Name :");
    // String firstName = scanner.nextLine();
    // scanner.close();

    stmt.execute("INSERT INTO users (userName, pws, lastName, firstName) " + 
    "VALUES ('" + userName + "', '" + pws  + "', '" + lastName  + "', '" + firstName + "')");
  }
  public boolean passwordCheck(String userName, String pws,Connection connection) throws SQLException{
    Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT userName, pws FROM users");
    Boolean test = false;
    List<String> users = new ArrayList<>();
    while(rs.next()){
      users.add(rs.getString("userName"));
      users.add(rs.getString("pws"));
    }
    for (int i=0; i<users.size();i++){
      if(users.get(i).equals(userName)){
        if(users.get(i+1).equals(pws)){
          test = true;
          break;
        }else{
          System.out.println("Password incorrect.[DB]");
          i++;
          break;
        }
      }else{
        i++;
      }
    }
    System.out.println("User doesnt exist.[DB]");
    return test;
  }

  public boolean userChecking(String newUser, Connection connection) throws SQLException{
    Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT userName FROM users");
    Boolean userCheckingTest = false;
    List<String> users = new ArrayList<>();
    while (rs.next()){
      String user = rs.getString("userName");
      // System.out.println("user : "+ user);
      users.add(user);
    }
    for (String user : users){
      if (newUser.equals(user)){
        userCheckingTest = true;
        break;
      }
    }
    System.out.println("UserChecking : "+ userCheckingTest);
    return userCheckingTest;
  }
}
