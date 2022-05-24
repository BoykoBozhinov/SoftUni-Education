package ConditionalStatementsExercise;
import java.util.Scanner;
public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int mbRam = Integer.parseInt(scanner.nextLine());

        int videoPrice = videoCardsCount * 250;
        double cpuPrice = cpuCount * (videoPrice * 0.35);
        double ramPrice = mbRam * (videoPrice*0.10);
        double totalMoney = videoPrice + cpuPrice + ramPrice;

        if (videoCardsCount > cpuCount){
            totalMoney = totalMoney - (totalMoney*0.15);
        }
        if (budget >= totalMoney){
            double leftMoney = budget - totalMoney;
            System.out.printf("You have %.2f leva left!", leftMoney);
        }else {
            double needMoney = totalMoney - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", needMoney);
        }

    }
}
