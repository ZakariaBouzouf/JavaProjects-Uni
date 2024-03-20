import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Bank {
  private Connection connection;

  public static void main(String[] args) {
    Bank bank = new Bank();
    try {
      bank.initConnection();
      bank.initTable();
      bank.initInitialData();
      bank.printDatabase();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      bank.tryCloseConnection();
    }
  }

  private void initConnection() throws SQLException {
    connection = DriverManager.getConnection("jdbc:sqlite:bank.db");
    System.out.println("[Connected to Database]");
  }

  private void tryCloseConnection() {
    if (connection != null) {
      try {
        connection.close();
        System.out.println("[Disconnected from Database]");
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private void initTable() throws SQLException {
    Statement stmt = connection.createStatement();
    stmt.setQueryTimeout(30);

    stmt.execute("DROP TABLE IF EXISTS customers");
    stmt.execute("CREATE TABLE customers " +
        "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
        " name STRING, " +
        "balance MONEY )");
  }

  private void initInitialData() throws SQLException {
    Statement stmt = connection.createStatement();
    stmt.setQueryTimeout(30);

    List<Customer> customerList = new ArrayList<>(List.of(
        new Customer("Tim", 2000),
        new Customer("Tom", 1000)));

    for (Customer c : customerList) {
      stmt.execute("INSERT INTO customers (name, balance) " +
          "VALUES ('" + c.getName() + "', '" + c.getBalance() + "')");
    }
  }

  private void printDatabase() throws SQLException {
    Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM customers");
    while (rs.next()) {
      System.out.println(String.format("ID: %d, Name: %s, Balance: %.2f",
          rs.getInt("id"),
          rs.getString("name"),
          rs.getDouble("balance")));
    }

  }
}
