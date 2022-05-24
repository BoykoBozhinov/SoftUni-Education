import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int matureTicketCount = Integer.parseInt(scanner.nextLine());
        int kidsTicketCount = Integer.parseInt(scanner.nextLine());
        double matureTicketPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double kidsTicketPrice = matureTicketPrice * 0.30;
        matureTicketPrice = matureTicketPrice + servicePrice;
        kidsTicketPrice = kidsTicketPrice + servicePrice;
        double allTicketsPrice = (kidsTicketPrice * kidsTicketCount) + (matureTicketPrice * matureTicketCount);
        double agencyProfit = allTicketsPrice * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, agencyProfit);
    }
}
