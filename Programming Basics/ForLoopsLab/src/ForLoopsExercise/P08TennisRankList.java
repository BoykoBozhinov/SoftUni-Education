package ForLoopsExercise;

import java.util.Scanner;

public class P08TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        double tournamentPoints = 0;
        int win = 0;
        int finalist = 0;
        int semifinal = 0;
        for (int i = 1; i <= tournamentsCount; i++) {
            String tournamentStage = scanner.nextLine();

            switch (tournamentStage) {
                case "W":
                    win++;
                    tournamentPoints = +tournamentPoints + 2000;
                    break;
                case "F":
                    finalist++;
                    tournamentPoints = +tournamentPoints + 1200;
                    break;
                case "SF":
                    semifinal++;
                    tournamentPoints = tournamentPoints + 720;
                    break;
            }
        }
        double finalPoints = startPoints + tournamentPoints;
        double averagePoints = tournamentPoints / tournamentsCount;
        double tournamentsWin = (win * 1.0 / tournamentsCount) * 100;
        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", tournamentsWin);
    }
}
