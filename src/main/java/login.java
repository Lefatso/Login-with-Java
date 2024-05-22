public class login{
  private String userName;
  private String userPassword;
  private String userEmail;

  public login(String name, String password,String email){
    userName = name;
    userPassword = password;
    userEmail = email;
    // settters and getter for the username
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