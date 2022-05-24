import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        while (!country.equals("End")) {
            double needMoney = Double.parseDouble(scanner.nextLine());
            double sumSavings = 0;

            while (sumSavings < needMoney) {
                double sum = Double.parseDouble(scanner.nextLine());
                sumSavings += sum;
            }
            System.out.printf("Going to %s!%n", country);
            country = scanner.nextLine();
        }
    }
}
