import java.util.Scanner;
//Creating password - special characters are allowed excluding spaces
//In log In - exception "Your password is incorrect. Please try again" until third try
// In Log In - if enter "Warning: After" + attemp + " unsuccesful log in attempts. Your account will be locked"
//In Log In - end "This account has been locked due to many failed log in attempts."

public class UserDefinedException {
    public static void main (String args[]){

    int attempt;
    int maxAttempt = 3;
    String password = "password";
    String login;

        try (Scanner input = new Scanner(System.in)) {
            for (attempt = 1; attempt<= maxAttempt; attempt++) {

                System.out.print("Log In password: ");
                login = input.nextLine();

                if (password.equals(login)){

                    System.out.println("Login Successful!");
                    return;
                }

                else if (attempt < maxAttempt) {
                    System.out.println("Your password is incorrect. Please try again.");
                    System.out.println("Warning: After " + (maxAttempt - attempt) + " unsuccessful login attempts. Your account will be locked.");
                } 
                
                else {
                    System.out.println("This account has been locked due to many failed login attempts.");
                }
            }
        }
    }
}