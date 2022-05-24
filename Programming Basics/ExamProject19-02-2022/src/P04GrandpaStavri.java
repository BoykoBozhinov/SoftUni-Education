import java.util.Scanner;

public class P04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCount = Integer.parseInt(scanner.nextLine());

        double averageDegrees = 0;
        double rakiyaQuantity = 0;
        double rakiyaDegrees = 0;
        for (int n = 1; n <= daysCount; n++) {
            double rakiyaCount = Double.parseDouble(scanner.nextLine());
            double degreesCount = Double.parseDouble(scanner.nextLine());

            rakiyaQuantity = rakiyaQuantity + rakiyaCount;
            rakiyaDegrees = rakiyaDegrees + degreesCount * rakiyaCount;
            averageDegrees = rakiyaDegrees / rakiyaQuantity;
        }
        System.out.printf("Liter: %.2f%n", rakiyaQuantity);
        System.out.printf("Degrees: %.2f%n", averageDegrees);
        if (averageDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegrees <= 42) {
            System.out.println("Super!");
        } else if (averageDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
