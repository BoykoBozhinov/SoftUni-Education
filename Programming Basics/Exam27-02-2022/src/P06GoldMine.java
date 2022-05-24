import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationsCount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= locationsCount; i++) {
            double averageExtraction = 0;
            double averageExtractionDay = 0;
            double averageGoldCount = Double.parseDouble(scanner.nextLine());
            int digDaysCount = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= digDaysCount; j++) {
                double obtainedGold = Double.parseDouble(scanner.nextLine());
                averageExtraction = averageExtraction + obtainedGold;
                averageExtractionDay = averageExtraction / digDaysCount;
            }
            double diff = averageGoldCount - averageExtractionDay;
            if (averageExtractionDay >= averageGoldCount) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageExtractionDay);
            }
            if (averageExtractionDay < averageGoldCount) {
                System.out.printf("You need %.2f gold.%n", diff);
            }
        }
    }
}
