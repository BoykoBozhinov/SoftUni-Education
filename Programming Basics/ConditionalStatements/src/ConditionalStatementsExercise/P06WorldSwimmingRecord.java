package ConditionalStatementsExercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceM = Double.parseDouble(scanner.nextLine());
        double swimTime1M = Double.parseDouble(scanner.nextLine());

        double swimTime = distanceM * swimTime1M;
        double distanceSlow = Math.floor(distanceM / 15) * 12.5;
        double allTime = swimTime + distanceSlow;

        if (allTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", allTime-worldRecord);
        }

    }
}
