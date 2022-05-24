import java.util.Scanner;

public class P01MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int adapterPrice = Integer.parseInt(scanner.nextLine());
        double electricityConsume = Double.parseDouble(scanner.nextLine());
        double cardProfitPrice = Double.parseDouble(scanner.nextLine());

        int videoCardsCount = 13;
        int adaptersCount = 13;
        int otherComponents = 1000;

        int cardsTotalPrice = videoCardPrice * videoCardsCount;
        int adapterTotalPrice = adapterPrice * adaptersCount;
        int totalMoneySpend = cardsTotalPrice + adapterTotalPrice + otherComponents;
        double cardProfitDay = cardProfitPrice - electricityConsume;
        double totalCardPriceDay = videoCardsCount * cardProfitDay;
        double refundDays = Math.ceil(totalMoneySpend / totalCardPriceDay);

        System.out.printf("%d%n", totalMoneySpend);
        System.out.printf("%.0f%n", refundDays);
    }
}
