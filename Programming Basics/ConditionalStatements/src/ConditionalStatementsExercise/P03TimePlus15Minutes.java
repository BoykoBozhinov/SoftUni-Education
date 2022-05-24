package ConditionalStatementsExercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initHour = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());
        int allMin = (initHour * 60) + initMinutes+15;
        int hours = allMin / 60;
        int minutes = allMin % 60;

        if (hours>23){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours,minutes);

    }
}
