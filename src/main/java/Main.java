import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the login page commander");

    System.out.println("Please enter your username");
    String userName = input.nextLine();

    System.out.println("Please enter your password");
    String userPassword = input.nextLine();

    Login userLogin = new Login();

    userLogin.setUserName("Captain-Joe");
    userLogin.setUserPassword("j123456");

    //The condition can be simplified.
    if (userName.equals(userLogin.getUserName()) && userPassword.equals(userLogin.getUserPassword())) {
      System.out.println("You have logged in successfully, Commander");
    } else {
      System.out.println("Access Denied, Incorrect credentials");
    }
  }
}
  