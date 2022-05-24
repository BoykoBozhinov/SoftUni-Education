package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0.0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fishermanCount <=6) {
            boatPrice = boatPrice * 0.90;
        }else if (fishermanCount <=11) {
            boatPrice = boatPrice * 0.85;
        } else if (fishermanCount>12) {
            boatPrice = boatPrice * 0.75;
        }
        if (!season.equals("Autumn") && fishermanCount % 2 == 0){
                boatPrice = boatPrice * 0.95;
        }
        double diff = Math.abs(budget - boatPrice);
        if (budget>=boatPrice){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
