package BasicSyntaxExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            char letter = username.charAt(position);
            password += letter;
        }

        String enteredPassword = scanner.nextLine();
        int loginCount = 0;
        while (!enteredPassword.equals(password)) {
            loginCount++;
            if (loginCount == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
