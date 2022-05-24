package P03;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());

        int ticketsBuys = 0;
        int buysCount = 0;
        String purchase = scanner.nextLine();
        while (!purchase.equals("End")) {
            int price = 0;
            if (purchase.length() > 8) {
                price = purchase.charAt(0) + purchase.charAt(1);
                if (voucher < price) {
                    break;
                } else {
                    ticketsBuys++;
                    voucher = voucher - price;
                }
            } else {
                price = purchase.charAt(0);
                if (voucher < price) {
                    break;
                } else {
                    buysCount++;
                    voucher = voucher - price;
                }
            }
            purchase = scanner.nextLine();
        }
        System.out.printf("%d%n", ticketsBuys);
        System.out.printf("%d", buysCount);
    }
}
