import java.util.Scanner;

public class ADD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String typePackage = scanner.nextLine();
        String reductionForVIP = scanner.nextLine();
        int daysNumber = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (daysNumber > 7) {
            daysNumber = daysNumber - 1;
        } if (daysNumber <= 0) {
            System.out.println("Days must be positive number!");
        } else {
            switch (city) {
                case "Bansko":
                case "Borovets":
                    switch (typePackage) {
                        case "withEquipment":
                            price = daysNumber * 100.0;
                            if (reductionForVIP.equals("yes")) {
                                price = price - (price * 0.1);
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price);
                            break;
                        case "noEquipment":
                            price = daysNumber * 80.0;
                            if (reductionForVIP.equals("yes")) {
                                price = price - (price * 0.05);
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price);
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                    break;


                case "Varna":
                case "Burgas":
                    switch (typePackage) {
                        case "withBreakfast":
                            price = daysNumber * 130.0;
                            if (reductionForVIP.equals("yes")) {
                                price = price - (price * 0.12);
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price);
                            break;
                        case "noBreakfast":
                            price = daysNumber * 100.0;
                            if (reductionForVIP.equals("yes")) {
                                price = price - (price * 0.07);
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price);
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}
 