import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int redBallsPoints = 0;
        int orangeBallsPoints = 0;
        int yellowBallsPoints = 0;
        int whiteBallsPoints = 0;
        int blackDivides = 0;
        int otherColors = 0;
        double totalPoints = 0;
        for (int number = 0; number < n; number++) {
            String currentColour = scanner.nextLine();
            if (!currentColour.equals("red") && !currentColour.equals("orange") && !currentColour.equals("yellow") && !currentColour.equals("white") && !currentColour.equals("black")) {
                otherColors++;
                continue;
            }
            switch (currentColour) {
                case "red":
                    totalPoints = totalPoints + 5;
                    redBallsPoints++;
                    break;
                case "orange":
                    totalPoints = totalPoints + 10;
                    orangeBallsPoints++;
                    break;
                case "yellow":
                    totalPoints = totalPoints + 15;
                    yellowBallsPoints++;
                    break;
                case "white":
                    totalPoints = totalPoints + 20;
                    whiteBallsPoints++;
                    break;
                case "black":
                    totalPoints = Math.floor(totalPoints / 2);
                    blackDivides++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBallsPoints);
        System.out.printf("Orange balls: %d%n", orangeBallsPoints);
        System.out.printf("Yellow balls: %d%n", yellowBallsPoints);
        System.out.printf("White balls: %d%n", whiteBallsPoints);
        System.out.printf("Other colors picked: %d%n", otherColors);
        System.out.printf("Divides from black balls: %d%n", blackDivides);
    }
}
