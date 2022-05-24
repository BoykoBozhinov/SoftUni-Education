import java.util.Scanner;

public class P17EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreadCount = Integer.parseInt(scanner.nextLine());


        String baker = "";
        int maxPoint = Integer.MIN_VALUE;
        for (int i = 1; i <= easterBreadCount; i++) {
            int pointsCount = 0;
            int currentMax = Integer.MIN_VALUE;
            String bakerName = scanner.nextLine();

            String command = scanner.nextLine();

            while (!command.equals("Stop")) {
                int easterBreadGrade = Integer.parseInt(command);
                pointsCount = pointsCount + easterBreadGrade;

                if (pointsCount > maxPoint) {
                    maxPoint = pointsCount;
                    baker = bakerName;
                    currentMax = pointsCount;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, pointsCount);
            if (currentMax >= maxPoint) {
                System.out.printf("%s is the new number 1!%n", baker);
            }
        }

        System.out.printf("%s won competition with %d points!%n", baker, maxPoint);
    }
}
