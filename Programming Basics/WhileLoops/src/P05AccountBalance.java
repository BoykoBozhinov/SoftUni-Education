import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            String value = scanner.nextLine();
            if (value.equals("NoMoreMoney")) {
                System.out.printf("Total: %.2f%n", total);
                return;
            }
            double valueDouble = Double.parseDouble(value);
            if (valueDouble < 0) {
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f%n", total);
                return;
            }
            total += valueDouble;
            System.out.printf("Increase: %.2f%n", valueDouble);
        }

    }
}
