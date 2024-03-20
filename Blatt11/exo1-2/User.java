public class User {
  protected String userName ;
  protected String pws;
  protected String lastName;
  protected String firstName;

  public User (String userName, String pws, String lastName,String firstName){
    this.userName = userName;
    this.pws = pws;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String getUserName(){
    return userName;
  }
  public void setUserName(String userName){
    this.userName = userName;
  }

  public String getPws() {
    return pws;
  }

  public void setPws(String pws) {
    this.pws = pws;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

}
