import java.util.Scanner;

public class P09EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flourKgPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsCount = Integer.parseInt(scanner.nextLine());
        int yeastCount = Integer.parseInt(scanner.nextLine());

        double sugarKgPrice = flourKgPrice * 0.75;
        double eggsPriceKg = flourKgPrice * 1.1;
        double yeastPricePacket = sugarKgPrice * 0.20;

        double flourSum = flourKgPrice * flourKg;
        double sugarSum = sugarKgPrice * sugarKg;
        double eggsSum = eggsCount * eggsPriceKg;
        double yeastSum = yeastCount * yeastPricePacket;

        double totalSum = flourSum + sugarSum + eggsSum + yeastSum;
        System.out.printf("%.2f", totalSum);


    }
}
