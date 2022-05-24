import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movieBudged = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double statistDressPrice = Double.parseDouble(scanner.nextLine());

        double movieDecor = movieBudged * 0.10;
        double allDressPrice = statistsCount * statistDressPrice;
        if (statistsCount > 150) {
            allDressPrice = allDressPrice * 0.90;
        }
        double allSum = movieDecor + allDressPrice;
        double diff = Math.abs(movieBudged - allSum);
        if (allSum > movieBudged) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
