package P03;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double studentTickets = 0;
        double standardTickets = 0;
        double kidTickets = 0;
        int allTickets = 0;
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int currentTicketsCount = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                currentTicketsCount++;
                allTickets++;
                if (currentTicketsCount >= freeSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, currentTicketsCount * 1.0 / freeSeats * 100);
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidTickets / allTickets * 100);
    }
}
