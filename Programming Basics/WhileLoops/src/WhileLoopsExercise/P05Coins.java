package WhileLoopsExercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = change * 100;
        int count = 0;
        while (coinsChange > 0) {
            if (coinsChange >= 200) {
                coinsChange -= 200;
                count++;
            } else if (coinsChange >= 100) {
                coinsChange -= 100;
                count++;
            } else if (coinsChange >= 50) {
                coinsChange -= 50;
                count++;
            } else if (coinsChange >= 20) {
                coinsChange -= 20;
                count++;
            } else if (coinsChange >= 10) {
                coinsChange -= 10;
                count++;
            } else if (coinsChange >= 5) {
                coinsChange -= 5;
                count++;
            } else if (coinsChange >= 2) {
                coinsChange -= 2;
                count++;
            } else if (coinsChange >= 1) {
                coinsChange -= 1;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
