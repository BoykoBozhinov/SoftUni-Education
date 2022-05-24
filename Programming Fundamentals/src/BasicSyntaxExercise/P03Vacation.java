package BasicSyntaxExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;
        double totalSum = 0;
        switch (groupType) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 8.45;
                    totalSum = pricePerPerson * peopleCount;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 9.80;
                    totalSum = pricePerPerson * peopleCount;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 10.46;
                    totalSum = pricePerPerson * peopleCount;
                }
                if (peopleCount >= 30) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 10.90;
                    totalSum = pricePerPerson * peopleCount;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 15.60;
                    totalSum = pricePerPerson * peopleCount;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 16;
                    totalSum = pricePerPerson * peopleCount;
                }
                if (peopleCount >= 100) {
                    totalSum = totalSum - (10 * pricePerPerson);
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 15;
                    totalSum = pricePerPerson * peopleCount;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 20;
                    totalSum = pricePerPerson * peopleCount;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 22.50;
                    totalSum = pricePerPerson * peopleCount;
                }
                if (peopleCount >= 10 && peopleCount <= 20) {
                    totalSum = totalSum * 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalSum);
    }
}
