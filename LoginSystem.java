import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        int maxAttempt = 3;
        String password = "password";

        try (Scanner input = new Scanner(System.in)) {
            for (int attempt = 1; attempt <= maxAttempt; attempt++) {
                System.out.print("Log In password: ");
                String login = input.nextLine().trim(); // Trim to remove leading and trailing whitespace

                if (password.equals(login)) {
                    System.out.println("Login Successful!");
                    return;
                } else {
                    try {
                        // Custom exception for invalid password with warning message
                        throw new InvalidPasswordException("\nYour password is incorrect. Please try again.\n" +
                                "Warning! After " + (maxAttempt - attempt) + " unsuccessful login attempts. Your account will be locked.\n");
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            // If loop completes without successful login and the maximum attempts are reached
            try {
                throw new MaxAttemptsExceededException("This account has been locked due to many failed login attempts.");
            } catch (MaxAttemptsExceededException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
