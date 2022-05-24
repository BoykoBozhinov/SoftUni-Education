import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearToBeAlive = Integer.parseInt(scanner.nextLine());

        double leftMoney = inheritedMoney;
        int currentAge = 18;
        for (int yearBack = 1800; yearBack <= yearToBeAlive; yearBack++) {
            if (yearBack % 2 == 0) {
                int evenYearsMoney = 12000;
                leftMoney -= evenYearsMoney;
            } else {
                int oddYearsMoney = 12000 + 50 * currentAge;
                leftMoney -= oddYearsMoney;
            }
            currentAge++;
        }
        if (leftMoney < 0) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(leftMoney));
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", leftMoney);
        }
    }
}