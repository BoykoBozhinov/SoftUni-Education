package BasicSyntaxExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double totalMoney = 0;
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                totalMoney += coins;
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            boolean hasMoney = true;
            switch (product) {
                case "Nuts":

                    if (totalMoney < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalMoney -= 2;
                    }
                    break;
                case "Water":

                    if (totalMoney < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalMoney -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (totalMoney < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalMoney -= 1.5;
                    }
                    break;
                case "Soda":

                    if (totalMoney < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalMoney -= 0.8;
                    }
                    break;
                case "Coke":

                    if (totalMoney < 1.0) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalMoney -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if (!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}

/*package BasicSyntaxExercise;

        import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double totalMoney = 0;
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            command = scanner.nextLine();
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
                continue;
            }
            totalMoney += coins;
        }
        String product = scanner.nextLine();
        double productPrice = 0;
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    if (totalMoney >= productPrice) {
                        totalMoney = totalMoney - productPrice;
                        System.out.printf("Purchased %s", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    productPrice = 0.7;
                    if (totalMoney >= productPrice) {
                        totalMoney = totalMoney - productPrice;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    productPrice = 1.0;
                    if (totalMoney >= productPrice) {
                        totalMoney = totalMoney - productPrice;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    productPrice = 0.8;
                    if (totalMoney >= productPrice) {
                        totalMoney = totalMoney - productPrice;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    if (totalMoney >= productPrice) {
                        totalMoney = totalMoney - productPrice;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}*/
