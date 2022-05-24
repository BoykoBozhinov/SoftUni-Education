package P03;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moviesCount = Integer.parseInt(scanner.nextLine());

        double maxRate = Double.MIN_VALUE;
        double minRate = Double.MAX_VALUE;
        String highRateMovie = "";
        String lowRateMovie = "";
        double allRateSum = 0;
        for (int i = 1; i <= moviesCount; i++) {
            String movieName = scanner.nextLine();
            double movieRate = Double.parseDouble(scanner.nextLine());

            allRateSum = allRateSum + movieRate;
            if (movieRate > maxRate) {
                maxRate = movieRate;
                highRateMovie = movieName;
            } else if (movieRate < minRate) {
                minRate = movieRate;
                lowRateMovie = movieName;
            }
        }
        double averageRateSum = allRateSum / moviesCount;
        System.out.printf("%s is with highest rating: %.1f%n", highRateMovie, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n", lowRateMovie, minRate);
        System.out.printf("Average rating: %.1f%n", averageRateSum);
    }
}
