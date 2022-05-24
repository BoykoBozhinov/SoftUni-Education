package ConditionalStatementsExercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double allToysPrice = (puzzleCount * 2.60) + (talkingDolls*3.0) + (teddyBears*4.10) + (minions*8.20) + (trucks*2.0);
        double allToysCount = puzzleCount + talkingDolls + teddyBears + minions + trucks;
        if (allToysCount >50) {
            allToysPrice = allToysPrice - (allToysPrice * 0.25);
        }
        allToysPrice = allToysPrice - (allToysPrice * 0.10);
        double diff =Math.abs(allToysPrice - vacationPrice);
        if(allToysPrice >= vacationPrice){
            System.out.printf("Yes ! %.2f lv left.", diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
