package BasicSyntaxExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double singleSaberPrice = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
        double singleBeltPrice = Double.parseDouble(scanner.nextLine());

        double sabersPrice = Math.ceil(studentsCount + 0.10 * studentsCount) * singleSaberPrice;
        double robePrice = singleRobePrice * studentsCount;
        double beltsPrice = (studentsCount - studentsCount / 6) * singleBeltPrice;

        double totalSum = sabersPrice + robePrice + beltsPrice;
        if (totalSum <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double needMoney = totalSum - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }


    }
}
