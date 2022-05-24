import java.util.Scanner;

public class P03FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dancersCount = Integer.parseInt(scanner.nextLine());
        double pointsCount = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double dancersMoney = 0;
        double charitySum = 0;
        double moneyPrize = 0;
        switch (place) {
            case "Bulgaria":
                moneyPrize = dancersCount * pointsCount;
                if (season.equals("summer")) {
                    moneyPrize = moneyPrize * 0.95;
                } else if (season.equals("winter")) {
                    moneyPrize = moneyPrize * 0.92;
                }
                break;
            case "Abroad":
                moneyPrize = dancersCount * pointsCount;
                moneyPrize = moneyPrize * 0.50 + moneyPrize;
                if (season.equals("summer")) {
                    moneyPrize = moneyPrize * 0.90;
                } else if (season.equals("winter")) {
                    moneyPrize = moneyPrize * 0.85;
                }
                break;
        }
        charitySum = moneyPrize * 0.75;
        double moneyLeft = moneyPrize - charitySum;
        dancersMoney = moneyLeft / dancersCount;

        System.out.printf("Charity - %.2f%n", charitySum);
        System.out.printf("Money per dancer - %.2f%n", dancersMoney);
    }
}
