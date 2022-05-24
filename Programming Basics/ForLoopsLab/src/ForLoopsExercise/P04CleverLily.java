package ForLoopsExercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLilly = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        int savedMoney = 0;
        int allMoney = 0;
        int thiefBrother = 0;
        for (int number = 1; number<=ageLilly; number++) {
            if (number % 2 != 0 ) {
                toysCount++;
            }else {
                thiefBrother++;
                savedMoney = savedMoney + 10;
                allMoney = allMoney + savedMoney;
            }
        }
        double sumToys = toysCount * toyPrice;
        double allMoneySaved = allMoney + sumToys - thiefBrother;

        double diff = Math.abs(allMoneySaved - laundryPrice);
        if (allMoneySaved>=laundryPrice) {
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
