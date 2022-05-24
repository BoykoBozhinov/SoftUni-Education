import java.util.Scanner;

public class P07TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int stayDays = Integer.parseInt(scanner.nextLine());

        double sumDue = 0;
        switch (town) {
            case "Bansko":
            case "Borovets":
                if (packageType.equals("withEquipment")) {
                    sumDue = 100;
                    if (vipDiscount.equals("yes")) {
                        sumDue = sumDue * 0.90;
                    }
                } else if (packageType.equals("noEquipment")) {
                    sumDue = 80;
                    if (vipDiscount.equals("yes")) {
                        sumDue = sumDue * 0.95;
                    }
                }
                break;

            case "Varna":
            case "Burgas":
                if (packageType.equals("noBreakfast")) {
                    sumDue = 100;
                    if (vipDiscount.equals("yes")) {
                        sumDue = sumDue * 0.93;
                    }
                } else if (packageType.equals("withBreakfast")) {
                    sumDue = 130;
                    if (vipDiscount.equals("yes")) {
                        sumDue = sumDue * 0.88;
                    }
                }
                break;
        }
        if (stayDays >= 7) {
            stayDays = stayDays - 1;
        }
        double totalSum = sumDue * stayDays;
        if (stayDays <= 0) {
            System.out.println("Days must be positive number!");
        } else if (((town.equals("Varna")) || (town.equals("Burgas")) || (town.equals("Bansko")) || (town.equals("Borovets"))) && ((packageType.equals("withBreakfast")) || (packageType.equals("noBreakfast")) || (packageType.equals("withEquipment")) || (packageType.equals("noEquipment")))) {
            System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
