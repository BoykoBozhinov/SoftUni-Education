import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositCash = Double.parseDouble(scanner.nextLine());
        int depositSession = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double increase = depositCash * (percent / 100);
        double monthlyIncrease = increase / 12;
        double result = depositCash + depositSession * monthlyIncrease;
        System.out.println(result);



    }
}
