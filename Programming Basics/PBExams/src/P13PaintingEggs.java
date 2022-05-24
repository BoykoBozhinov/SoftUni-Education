import java.util.Scanner;

public class P13PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eggsSize = scanner.nextLine();
        String eggsColor = scanner.nextLine();
        int batchCount = Integer.parseInt(scanner.nextLine());

        int batchPrice = 0;
        switch (eggsSize) {
            case "Large":
                switch (eggsColor) {
                    case "Red":
                        batchPrice = 16;
                        break;
                    case "Green":
                        batchPrice = 12;
                        break;
                    case "Yellow":
                        batchPrice = 9;
                        break;
                }
                break;
            case "Medium":
                switch (eggsColor) {
                    case "Red":
                        batchPrice = 13;
                        break;
                    case "Green":
                        batchPrice = 9;
                        break;
                    case "Yellow":
                        batchPrice = 7;
                        break;
                }
                break;
            case "Small":
                switch (eggsColor) {
                    case "Red":
                        batchPrice = 9;
                        break;
                    case "Green":
                        batchPrice = 8;
                        break;
                    case "Yellow":
                        batchPrice = 5;
                        break;
                }
                break;

        }
        double sum = batchCount * batchPrice;
        double expenses = sum * 0.35;
        double finalSum = sum - expenses;
        System.out.printf("%.2f leva.", finalSum);
    }
}
