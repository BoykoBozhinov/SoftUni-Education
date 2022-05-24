package NestedLoopsExercise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int standard = 0;
        int student = 0;
        int kid = 0;
        int totalTickets = 0;
        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                countCurrentTickets++;
                totalTickets++;

                if (countCurrentTickets >= freeSeats) {
                    break;
                }
                ticketType = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n", movieName, countCurrentTickets * 1.0 / freeSeats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / totalTickets * 100);
    }
}
