import java.util.Scanner;

public class P04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int catsCount = Integer.parseInt(scanner.nextLine());

        double catFoodKg = 12.45;
        double catsFood = 0;
        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        double catsFoodPriceDay = 0;
        for (int i = 1; i <= catsCount; i++) {
            double gramsFood = Double.parseDouble(scanner.nextLine());

            if (gramsFood >= 300) {
                groupThree++;
            } else if (gramsFood >= 200) {
                groupTwo++;
            } else if (gramsFood >= 100) {
                groupOne++;
            }
            catsFood = catsFood + gramsFood;
            double totalFood = catsFood / 1000;
            catsFoodPriceDay = totalFood * catFoodKg;
        }
        System.out.printf("Group 1: %d cats.%n", groupOne);
        System.out.printf("Group 2: %d cats.%n", groupTwo);
        System.out.printf("Group 3: %d cats.%n", groupThree);
        System.out.printf("Price for food per day: %.2f lv.%n", catsFoodPriceDay);
    }
}
