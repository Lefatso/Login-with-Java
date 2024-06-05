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

  public String setSUserName(String name){
    userName = name;
    return userName;
  }
// the setter and getter for the password 
  public String getUserPassword(){
    return userPassword;
  }

  public String setUserPassword(String password){
    userPassword = password;
    return userPassword;
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