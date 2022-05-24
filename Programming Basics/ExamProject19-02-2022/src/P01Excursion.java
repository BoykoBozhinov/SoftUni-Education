import java.util.Scanner;

public class P01Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupPeopleCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        int transportCardCount = Integer.parseInt(scanner.nextLine());
        int museumTicketsCount = Integer.parseInt(scanner.nextLine());

        int nightsCountPrice = nightsCount * 20;
        double transportCardPrice = transportCardCount * 1.60;
        int museumTicketsPrice = museumTicketsCount * 6;

        double sumPerPerson = nightsCountPrice + transportCardPrice + museumTicketsPrice;
        double totalSum = sumPerPerson * groupPeopleCount;
        double sumExpenses = totalSum + totalSum * 0.25;
        System.out.printf("%.2f", sumExpenses);

    }
}
