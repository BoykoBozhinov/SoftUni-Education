import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int santaAbsentDays = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayDeer1 = Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer2 = Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer3 = Double.parseDouble(scanner.nextLine());

        double firstDeerFood = santaAbsentDays * foodPerDayDeer1;
        double secondDeerFood = santaAbsentDays * foodPerDayDeer2;
        double thirdDeerFood = santaAbsentDays * foodPerDayDeer3;

        double totalFoodNeeded = firstDeerFood + secondDeerFood + thirdDeerFood;
        double diff = Math.abs(foodLeftKg - totalFoodNeeded);
        if (foodLeftKg >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
