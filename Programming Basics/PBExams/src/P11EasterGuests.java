import java.util.Scanner;

public class P11EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scanner.nextLine());
        int budged = Integer.parseInt(scanner.nextLine());


        double easterBreadNeeded = Math.ceil(guestsCount / 3.0);
        int easterEggsNeeded = guestsCount * 2;
        double easterBreadPrice = easterBreadNeeded * 4;
        double easterEggsPrice = easterEggsNeeded * 0.45;
        double totalSum = easterBreadPrice + easterEggsPrice;

        double diff = Math.abs(budged - totalSum);

        if (totalSum <= budged) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterBreadNeeded, easterEggsNeeded * 1.0);
            System.out.printf("He has %.2f lv. left.", diff);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", diff);
        }
    }
}
