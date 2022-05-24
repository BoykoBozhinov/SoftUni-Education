package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        String typeNight = "";
        double moneySpent = 0.0;
        String destination = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")){
                moneySpent = budget * 0.30;
                typeNight = "Camp";
            }else if (season.equals("winter")) {
                moneySpent = budget * 0.70;
                typeNight = "Hotel";
            }
        }else if (budget<=1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = budget * 0.40;
                typeNight = "Camp";
            }else if (season.equals("winter")){
                moneySpent = budget * 0.80;
                typeNight = "Hotel";
            }
        }else {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                moneySpent = budget * 0.90;
                typeNight = "Hotel";
            }
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeNight,moneySpent);
    }
}