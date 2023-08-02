package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises04LoginAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enteredUsername;
        String enteredPassword;

        int attempt = 0;
        int maxAttempt = 3;

        String username = "admin";
        String password = "admin";

        do {
            System.out.println("username: ");
            enteredUsername = scanner.nextLine();

            System.out.println("password: ");
            enteredPassword = scanner.nextLine();

            if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
                attempt = maxAttempt;
                System.out.println(enteredUsername + " is logged in!!!");

            } else {

                if (attempt == 2) {
                    System.out.println("Number of attempts exceeded =(");

                } else {
                    System.out.println("Incorrect username or password. Try again!");
                }

            }
            attempt++;
        } while (attempt < maxAttempt);
    }
}