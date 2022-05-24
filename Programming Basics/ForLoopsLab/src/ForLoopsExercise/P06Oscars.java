package ForLoopsExercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());

        double totalPoints = points;
        for (int i = 1; i <= judgesCount; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            double currentPoints = (judgeName.length() * judgePoints) / 2;
            if (totalPoints <1250.5) {
                totalPoints = totalPoints + currentPoints;
            }
        }

        double diff = 1250.5 - totalPoints;
        if (totalPoints >=1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",actorName, diff);
        }
    }
}
