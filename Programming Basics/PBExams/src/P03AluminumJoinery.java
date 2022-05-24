import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joineryCount = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String deliveryType = scanner.nextLine();

        double priceForSingleJoinery = 0.0;
        if (joineryCount < 10) {
            System.out.println("Invalid order");
        } else {
            switch (joineryType) {
                case "90X130":
                    priceForSingleJoinery = 110;
                    if (joineryCount > 60) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.92;
                    } else if (joineryCount > 30) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.95;
                    }
                    break;
                case "100X150":
                    priceForSingleJoinery = 140;
                    if (joineryCount > 80) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.90;
                    } else if (joineryCount > 40) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.94;
                    }
                    break;
                case "130X180":
                    priceForSingleJoinery = 190;
                    if (joineryCount > 50) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.88;
                    } else if (joineryCount > 20) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.93;
                    }
                    break;
                case "200X300":
                    priceForSingleJoinery = 250;
                    if (joineryCount > 50) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.86;
                    } else if (joineryCount > 25) {
                        priceForSingleJoinery = priceForSingleJoinery * 0.91;
                    }
                    break;
            }
            double finalPrice = priceForSingleJoinery * joineryCount;
            switch (deliveryType) {
                case "With delivery":
                    finalPrice = finalPrice + 60;
                    break;
                case "Without delivery":
                    break;
            }
            if (joineryCount > 99) {
                finalPrice = finalPrice * 0.96;
            }
            System.out.printf("%.2f BGN", finalPrice);

        }

    }
}