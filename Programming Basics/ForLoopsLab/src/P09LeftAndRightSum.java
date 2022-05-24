import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        for (int num = 1; num <= n; num++) {
            int value1 = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + value1;
        }

        for (int num1 = 1; num1 <= n; num1++) {
            int value2 = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + value2;
        }

        int diff = Math.abs(sum1 - sum2);
        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        }else {
            System.out.println("No, diff = " + diff);
        }
    }
}
