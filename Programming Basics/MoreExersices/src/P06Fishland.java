import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKgMackerel = Double.parseDouble(scanner.nextLine());
        double priceKgSprat = Double.parseDouble(scanner.nextLine());
        double kgBonito = Double.parseDouble(scanner.nextLine());
        double kgScadFish = Double.parseDouble(scanner.nextLine());
        int kgMussel = Integer.parseInt(scanner.nextLine());

        double priceBonito = priceKgMackerel + (priceKgMackerel * 0.60);
        double priceKgBonito = kgBonito * priceBonito;
        double priceScadFish = priceKgSprat + (priceKgSprat * 0.80);
        double priceKgScadFish = kgScadFish * priceScadFish;
        double priceKgMussel = kgMussel * 7.5;
        double allPrice = priceKgBonito + priceKgScadFish + priceKgMussel;
        System.out.printf("%.2f", allPrice);


    }
}
