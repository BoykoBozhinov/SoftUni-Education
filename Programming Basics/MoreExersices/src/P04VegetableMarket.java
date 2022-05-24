import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceKgFruits = Double.parseDouble(scanner.nextLine());
        int allVegetables = Integer.parseInt(scanner.nextLine());
        int allFruits = Integer.parseInt(scanner.nextLine());

        double priceAllVeg = priceKgVegetables * allVegetables;
        double priceAllFruits = priceKgFruits * allFruits;
        double priceEuros = (priceAllVeg + priceAllFruits) / 1.94;
        System.out.printf("%.2f", priceEuros);

    }
}
