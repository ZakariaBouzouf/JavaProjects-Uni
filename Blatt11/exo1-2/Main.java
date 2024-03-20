public class Main {
  public static void main(String[] args) {
    String user = "test14";
    String pwd = "1111";
    String firstName = "atat";
    String lastName = "aaaaaa";

    Client client = new Client();

    // if(client.login(user,pwd)){
    //   System.out.println("Login successfully.");
    // }else{
    //   System.out.println("Login had failed.");
    // }
    if (client.register(user,pwd,firstName,lastName)){
      System.out.println("Registration successfully.");
    }else{
      System.out.println("Registration had failed.");
    }
  }
}
