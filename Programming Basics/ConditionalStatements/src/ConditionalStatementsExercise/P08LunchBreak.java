package ConditionalStatementsExercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tvSeries = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTimeBreak = breakDuration /8.0;
        double pauseBreak = breakDuration /4.0;
        double timeLeft = breakDuration - lunchTimeBreak - pauseBreak;

        double diff = Math.abs(timeLeft - episodeDuration);
        if (timeLeft >= episodeDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvSeries,Math.ceil(diff));
        }else {
            double timeNeeded = Math.round(episodeDuration - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvSeries,Math.ceil(diff));
        }
    }
}
