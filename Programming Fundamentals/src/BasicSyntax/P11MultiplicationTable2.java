package BasicSyntax;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int multiplier = Integer.parseInt(sc.nextLine());

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
        } else {
            for (int i = multiplier; multiplier <= 10; multiplier++) {
                System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
            }
        }
    }
}
