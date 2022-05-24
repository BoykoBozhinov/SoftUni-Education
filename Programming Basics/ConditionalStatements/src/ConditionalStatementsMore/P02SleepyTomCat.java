package ConditionalStatementsMore;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDaysCount = Integer.parseInt(scanner.nextLine());
        int restDaysMin = restDaysCount * 127;
        int workingDaysMin = (365 - restDaysCount)*63;
        int playDaysMin = restDaysMin + workingDaysMin;
        int differenceAllMin = 30000 - playDaysMin;
        int differenceHours = Math.abs(differenceAllMin/60);
        int differenceMin = Math.abs(differenceAllMin%60);

        if(30000 > playDaysMin){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", differenceHours,differenceMin);
        }else if (30000 < playDaysMin){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", differenceHours,differenceMin);
        }



    }
}