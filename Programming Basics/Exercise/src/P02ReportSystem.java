import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedSellSum = Integer.parseInt(scanner.nextLine());

        int moneyCollected = 0;
        int counter = 0;
        double cashMoney = 0;
        double cardMoney = 0;
        double cashCount = 0;
        double cardCount = 0;
        boolean flag = false;
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int itemsPrice = Integer.parseInt(command);
            counter++;
            if (counter % 2 != 0 && itemsPrice > 100) {
                System.out.println("Error in transaction!");
                command = scanner.nextLine();
                continue;
            } else if ((counter % 2 != 0 && itemsPrice <= 100)) {
                cashMoney += itemsPrice;
                cashCount++;
                System.out.println("Product sold!");

            } else if (counter % 2 == 0 && itemsPrice < 10) {
                System.out.println("Error in transaction!");
                command = scanner.nextLine();
                continue;
            } else if (counter % 2 == 0 && itemsPrice > 10) {
                cardMoney += itemsPrice;
                cardCount++;
                System.out.println("Product sold!");
            }
            moneyCollected += itemsPrice;

            if (moneyCollected >= expectedSellSum) {
                flag = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (flag) {
            System.out.printf("Average CS: %.2f%n", cashMoney / cashCount);
            System.out.printf("Average CC: %.2f%n", cardMoney / cardCount);
        } if (command.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
