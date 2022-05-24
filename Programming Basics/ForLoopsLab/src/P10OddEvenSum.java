import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;
        for (int numbers = 1; numbers <= numbersCount; numbers++) {
            int value1 = Integer.parseInt(scanner.nextLine());
            if (numbers % 2 == 0) {
                sumEven = sumEven + value1;
            } else {
                sumOdd = sumOdd + value1;
            }
        }

        int diff = Math.abs(sumEven - sumOdd);
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
