package BasicSyntax;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOdds = Integer.parseInt(scanner.nextLine());

        int oddNumbersSum = 0;
        for (int i = 1; i <= numberOfOdds * 2; i++) {
            if (i % 2 != 0) {
                oddNumbersSum = oddNumbersSum + i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + oddNumbersSum);
    }
}
