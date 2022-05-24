import java.util.Scanner;

public class P03PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cake = scanner.nextLine();
        int sweetsOrdered = Integer.parseInt(scanner.nextLine());
        int decemberDay = Integer.parseInt(scanner.nextLine());

        double cakePrice = 0;
        double soufflePrice = 0;
        double baklavaPrice = 0;
        switch (cake) {
            case "Cake":
                if (decemberDay <= 15) {
                    cakePrice = sweetsOrdered * 24;
                } else {
                    cakePrice = sweetsOrdered * 28.70;
                }
                if (decemberDay <= 22) {
                    if (cakePrice > 200) {
                        cakePrice = cakePrice * 0.75;
                    } else if (cakePrice >= 100) {
                        cakePrice = cakePrice * 0.85;
                    }
                    if (decemberDay <= 15) {
                        cakePrice = cakePrice * 0.90;
                    }
                }
                System.out.printf("%.2f", cakePrice);
                break;
            case "Souffle":
                if (decemberDay <= 15) {
                    soufflePrice = sweetsOrdered * 6.66;
                } else {
                    soufflePrice = sweetsOrdered * 9.80;
                }
                if (decemberDay <= 22) {
                    if (soufflePrice > 200) {
                        soufflePrice = soufflePrice * 0.75;
                    } else if (soufflePrice >= 100) {
                        soufflePrice = soufflePrice * 0.85;
                    }
                    if (decemberDay <= 15) {
                        soufflePrice = soufflePrice * 0.90;
                    }
                }
                System.out.printf("%.2f", soufflePrice);
                break;
            case "Baklava":
                if (decemberDay <= 15) {
                    baklavaPrice = sweetsOrdered * 12.60;
                } else {
                    baklavaPrice = sweetsOrdered * 16.98;
                }
                if (decemberDay <= 22) {
                    if (baklavaPrice > 200) {
                        baklavaPrice = baklavaPrice * 0.75;
                    } else if (baklavaPrice >= 100) {
                        baklavaPrice = baklavaPrice * 0.85;
                    }
                    if (decemberDay <= 15) {
                        baklavaPrice = baklavaPrice * 0.90;
                    }
                }
                System.out.printf("%.2f", baklavaPrice);
                break;
        }
    }
}
