import java.util.Scanner;

public class P15EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shopEggsCount = Integer.parseInt(scanner.nextLine());

        int eggsSold = 0;
        String command = scanner.nextLine();
        while (!command.equals("Close")) {
            String buyFillEggs = command;
            int buyFillEggsCount = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (buyFillEggsCount > shopEggsCount) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", shopEggsCount);
                    return;
                }
                shopEggsCount = shopEggsCount - buyFillEggsCount;
                eggsSold = eggsSold + buyFillEggsCount;
            } else if (command.equals("Fill")) {
                shopEggsCount = shopEggsCount + buyFillEggsCount;
            }
            command = scanner.nextLine();
        }
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.", eggsSold);
    }
}
