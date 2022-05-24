package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (partOfTheDay.equals("Morning")) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        } else if (partOfTheDay.equals("Afternoon")) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (partOfTheDay.equals("Evening")) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        }
    }
}
