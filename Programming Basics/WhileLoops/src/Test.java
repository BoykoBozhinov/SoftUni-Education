import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String enterPassword = scanner.nextLine();
        while (!enterPassword.equals(password)) {
            System.out.println("Enter correct password");
            enterPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
