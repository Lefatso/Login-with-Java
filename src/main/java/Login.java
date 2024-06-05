public class Login {
  private String userName;
  private String userPassword;
  private String userEmail;

  public Login(String userName, String userPassword, String userEmail){
    this.userName = userName;
    this.userPassword = userPassword;
    this.userEmail = userEmail;
  }

  public String getUserName(){
    return userName;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public String getUserPassword(){
    return userPassword;
  }

  public void setUserPassword(String userPassword){
    this.userPassword = userPassword;
  }

  //setters and getters for the email
  public String getUserEmail(){
    return userEmail;
  }
  public String setUserEmail(String email){
    userEmail = email;
    return userEmail;
  }
  
}