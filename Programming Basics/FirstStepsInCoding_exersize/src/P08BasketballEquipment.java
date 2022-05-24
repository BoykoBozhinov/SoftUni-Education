import java.util.Scanner;
public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearsTax = Integer.parseInt(scanner.nextLine());

        double priceSneakers = yearsTax - (yearsTax * 0.40);
        double priceKit = priceSneakers - (priceSneakers * 0.20);
        double priceBall = priceKit  /4;
        double priceAcc = priceBall  /5;
        double expenses = priceSneakers + priceKit + priceBall + priceAcc + yearsTax;
        System.out.println(expenses);


    }
}
