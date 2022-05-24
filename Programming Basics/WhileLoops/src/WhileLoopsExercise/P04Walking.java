package WhileLoopsExercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsGoal = 10000;
        int stepsSum = 0;
        String command = scanner.nextLine();

        while (!command.equals("Going home")) {
            int steps = Integer.parseInt(command);
            stepsSum = stepsSum + steps;
            if (stepsSum > stepsGoal) {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int stepsHome = Integer.parseInt(scanner.nextLine());
            stepsSum = stepsSum + stepsHome;
        }

        int diff = Math.abs(stepsSum - stepsGoal);
        if (stepsSum >= stepsGoal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
