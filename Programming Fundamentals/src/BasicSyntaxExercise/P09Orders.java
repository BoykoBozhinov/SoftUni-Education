package BasicSyntaxExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ordersCount = Double.parseDouble(scanner.nextLine());

        double coffeePrice = 0;
        double totalPrice = 0;
        for (double i = ordersCount; i > 0; i--) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            coffeePrice = ((days * capsulesCount) * pricePerCapsule);
            totalPrice += coffeePrice;
            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
