import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double chickenCount = chickenMenus * 10.35;
        double fishCount = fishMenus * 12.40;
        double veganCount = veganMenus * 8.15;
        double menusBill = chickenCount + fishCount + veganCount;
        double dessertPrice = menusBill * 0.20;
        double finalBill = menusBill + dessertPrice + 2.50;
        System.out.println(finalBill);
    }


}
