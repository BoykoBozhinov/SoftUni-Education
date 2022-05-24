import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int excursionSeaCount = Integer.parseInt(scanner.nextLine());
        int excursionMountainCount = Integer.parseInt(scanner.nextLine());

        String seaPackage = "";
        String mountainPackage = "";
        int sumPackages = 0;
        int profit = 0;
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String packageName = command;

            if (packageName.equals("sea")) {
                if (excursionSeaCount == 0) {
                    seaPackage = "soldOut";
                } else {
                    profit = profit + 680;
                    excursionSeaCount--;
                }
            }
            if (packageName.equals("mountain")) {
                if (excursionMountainCount == 0) {
                    mountainPackage = "soldOut";
                }
                profit = profit + 499;
                excursionMountainCount--;
            } else if (excursionSeaCount == 0 && excursionMountainCount == 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (excursionSeaCount + excursionMountainCount == sumPackages) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
