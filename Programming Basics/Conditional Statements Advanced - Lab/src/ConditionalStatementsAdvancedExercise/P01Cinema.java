package ConditionalStatementsAdvancedExercise;
import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rowsCount = Integer.parseInt(scanner.nextLine());
        int columnsCount = Integer.parseInt(scanner.nextLine());

        double income = 0.0;

        if (projectionType.equals("Premiere")) {
            income = rowsCount * columnsCount * 12.0;
        } else if (projectionType.equals("Normal")) {
            income = rowsCount * columnsCount * 7.50;
        } else if (projectionType.equals("Discount")) {
            income = rowsCount * columnsCount * 5.00;
        }
        System.out.printf("%.2f leva", income);
    }
}
