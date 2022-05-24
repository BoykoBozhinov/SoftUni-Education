import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottlesDetergentCount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        boolean flag = false;
        int detergentQuantity = 750 * bottlesDetergentCount;
        int potsTurn = 0;
        int potsQuantity = 0;
        int platesQuantity = 0;
        while (!command.equals("End")) {
            int dishesCount = Integer.parseInt(command);

            potsTurn++;

            if (potsTurn % 3 == 0) {
                detergentQuantity = detergentQuantity - dishesCount * 15;
                potsQuantity += dishesCount;
            } else {
                detergentQuantity = detergentQuantity - dishesCount * 5;
                platesQuantity += dishesCount;
            }
            if (detergentQuantity < 0) {
                flag = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (flag) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentQuantity));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", platesQuantity, potsQuantity);
            System.out.printf("Leftover detergent %d ml.", detergentQuantity);
        }
    }
}
