package P03;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int boughtTicketsCount = Integer.parseInt(scanner.nextLine());

        double movieBudged = 0;
        switch (movieName) {
            case "A Star Is Born":
                if (hallType.equals("normal")) {
                    movieBudged = boughtTicketsCount * 7.50;
                } else if (hallType.equals("luxury")) {
                    movieBudged = boughtTicketsCount * 10.50;
                } else {
                    movieBudged = boughtTicketsCount * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (hallType.equals("normal")) {
                    movieBudged = boughtTicketsCount * 7.35;
                } else if (hallType.equals("luxury")) {
                    movieBudged = boughtTicketsCount * 9.45;
                } else {
                    movieBudged = boughtTicketsCount * 12.75;
                }
                break;
            case "Green Book":
                if (hallType.equals("normal")) {
                    movieBudged = boughtTicketsCount * 8.15;
                } else if (hallType.equals("luxury")) {
                    movieBudged = boughtTicketsCount * 10.25;
                } else {
                    movieBudged = boughtTicketsCount * 13.25;
                }
                break;
            case "The Favourite":
                if (hallType.equals("normal")) {
                    movieBudged = boughtTicketsCount * 8.75;
                } else if (hallType.equals("luxury")) {
                    movieBudged = boughtTicketsCount * 11.55;
                } else {
                    movieBudged = boughtTicketsCount * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movieName, movieBudged);
    }
}
