package WhileLoopsExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        double finalSum = availableMoney;
        boolean isFalse = false;
        int spendingDaysCount = 0;
        int totalDays = 0;
        while (finalSum < vacationMoney) {
            if (spendingDaysCount >= 5) {
                isFalse = true;
                break;
            }
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            totalDays++;
            if (action.equals("spend")) {
                spendingDaysCount++;
                finalSum = finalSum - money;
            }
            if (finalSum < 0) {
                finalSum = 0;
            }
            if (action.equals("save")) {
                spendingDaysCount = 0;
                finalSum = finalSum + money;
            }
        }
        if (isFalse) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}