import java.util.Scanner;

public class P02BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fanName = scanner.nextLine();
        double budged = Double.parseDouble(scanner.nextLine());
        int beerBottlesCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.20;
        double totalBeersPrice = beerBottlesCount * beerPrice;
        double oneChipsPrice = totalBeersPrice * 0.45;
        double totalChipsPrice = Math.ceil(oneChipsPrice * chipsCount);
        double totalSum = totalBeersPrice + totalChipsPrice;

        double diff = Math.abs(budged - totalSum);
        if (totalSum <= budged) {
            System.out.printf("%s bought a snack and has %.2f leva left.", fanName, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", fanName, diff);
        }


    }
}
