import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double luggagePrice20Kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysToTravel = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        double luggageTaxPrice = 0.0;
        if (luggageKg < 10) {
            luggageTaxPrice = luggagePrice20Kg * 0.20;
        } else if (luggageKg <= 20) {
            luggageTaxPrice = luggagePrice20Kg * 0.50;
        } else {
            luggageTaxPrice = luggagePrice20Kg;
        }
        if (daysToTravel > 30) {
            luggageTaxPrice = luggageTaxPrice + (luggageTaxPrice * 0.10);
        } else if (daysToTravel >= 7) {
            luggageTaxPrice = luggageTaxPrice + (luggageTaxPrice * 0.15);
        } else {
            luggageTaxPrice = luggageTaxPrice + (luggageTaxPrice * 0.40);
        }
        double totalPrice = luggageTaxPrice * luggageCount;
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}
