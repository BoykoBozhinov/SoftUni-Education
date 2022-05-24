package BasicSyntax;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int personAge = Integer.parseInt(scanner.nextLine());

        boolean isNotValid = false;
        int ticketPrice = 0;
        if (personAge >= 0 && personAge <= 18)  {
            if (dayType.equals("Weekday")) {
                ticketPrice = 12;
            } else if  (dayType.equals("Weekend")){
                ticketPrice = 15;
            }else if (dayType.equals("Holiday")){
                ticketPrice = 5;
            }
        }else if (personAge > 18 && personAge <=64) {
            if (dayType.equals("Weekday")){
                ticketPrice = 18;
            }else if (dayType.equals("Weekend")) {
                ticketPrice = 20;
            }else if (dayType.equals("Holiday")) {
                ticketPrice = 12;
            }
        }else if (personAge > 64 && personAge <= 122) {
            if (dayType.equals("Weekday")){
                ticketPrice = 12;
            }else if (dayType.equals("Weekend")){
                ticketPrice = 15;
            }else if (dayType.equals("Holiday")) {
                ticketPrice = 10;
            }
        }else {
            isNotValid = true;
        }
        if (isNotValid){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$", ticketPrice);
        }
    }
}
