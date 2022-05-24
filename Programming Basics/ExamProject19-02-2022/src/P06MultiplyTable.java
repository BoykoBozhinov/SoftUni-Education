import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int num = number % 10;
        int num1 = number / 10 % 10;
        int num2 = number / 100 % 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num1; j++) {
                for (int k = 1; k <= num2; k++) {
                    System.out.printf("%d * %d * %d = %d%n", i, j, k, i * j * k);
                }
            }
        }
    }
}
