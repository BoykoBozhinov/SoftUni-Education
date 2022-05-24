import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double coffeePrice = 0;
        double waterPrice = 0;
        double beerPrice = 0;
        double sweetsPrice = 0;
        double peanutsPrice = 0;

        switch (product) {
            case "coffee":
                if (town.equals("Sofia")) {
                    coffeePrice = quantity * 0.50;
                    System.out.println(coffeePrice);
                } else if (town.equals("Plovdiv")) {
                    coffeePrice = quantity * 0.40;
                    System.out.println(coffeePrice);
                } else if (town.equals("Varna")) {
                    coffeePrice = quantity * 0.45;
                    System.out.println(coffeePrice);
                }
                break;
            case "water":
                if (town.equals("Sofia")) {
                    waterPrice = quantity * 0.80;
                    System.out.println(waterPrice);
                } else if (town.equals("Plovdiv")) {
                    waterPrice = quantity * 0.70;
                    System.out.printf("%.1f", waterPrice);
                } else if (town.equals("Varna")) {
                    waterPrice = quantity * 0.70;
                    System.out.println(waterPrice);
                }
                break;
            case "beer":
                if (town.equals("Sofia")) {
                    beerPrice = quantity * 1.20;
                    System.out.printf("%.1f", beerPrice);
                } else if (town.equals("Plovdiv")) {
                    beerPrice = quantity * 1.15;
                    System.out.println(beerPrice);
                } else if (town.equals("Varna")) {
                    beerPrice = quantity * 1.10;
                }
                break;
            case "sweets":
                if (town.equals("Sofia")) {
                    sweetsPrice = quantity * 1.45;
                    System.out.println(sweetsPrice);
                } else if (town.equals("Plovdiv")) {
                    sweetsPrice = quantity * 1.30;
                } else if (town.equals("Varna")) {
                    sweetsPrice = quantity * 1.35;
                }
                break;
            case "peanuts":
                if (town.equals("Sofia")) {
                    peanutsPrice = quantity * 1.60;
                    System.out.println(peanutsPrice);
                } else if (town.equals("Plovdiv")) {
                    peanutsPrice = quantity * 1.50;
                    System.out.println(peanutsPrice);
                } else if (town.equals("Varna")) {
                    peanutsPrice = quantity * 1.55;
                    System.out.println(peanutsPrice);
                }
                break;
        }
    }
}
