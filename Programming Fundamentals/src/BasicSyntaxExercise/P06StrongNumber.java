package BasicSyntaxExercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int factorialSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            factorialSum += factorial;
            number = number / 10;
        }
        if (factorialSum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
