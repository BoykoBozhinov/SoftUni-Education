import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = dogFoodCount * 2.50;
        int catFoodPrice = catFoodCount * 4;
        double finalSum = dogFoodPrice + catFoodPrice;
        System.out.println(finalSum);
    }
}
