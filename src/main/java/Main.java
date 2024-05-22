import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the login page commander");
    System.out.println("Please enter your username");
    String userName = input.nextLine();
    System.out.println("Please enter your password");
    String userPassword = input.nextLine();

    login userLogin = new login("","","");

    userLogin.setSUserName("Captain-Joe");
    userLogin.setUserPassword("j123456");

    if (userName.equals(userLogin.getUserName()) && userPassword.equals(userLogin.getUserPassword())){
      System.out.println("You have loged in successfully welcome commander");
    }else{
      System.out.println("Access Denied, please ensure that both your password and username are correct");
    }
      
    }
  }
  