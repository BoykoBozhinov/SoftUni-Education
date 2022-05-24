package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (nightsCount > 7 && nightsCount <= 14) {
                    apartmentPrice = apartmentPrice * nightsCount;
                    studioPrice = (studioPrice * 0.95) * nightsCount;
                } else if (nightsCount > 14) {
                    apartmentPrice = (apartmentPrice * 0.90) * nightsCount;
                    studioPrice = (studioPrice * 0.70) * nightsCount;
                } else {
                    apartmentPrice = apartmentPrice * nightsCount;
                    studioPrice = studioPrice * nightsCount;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nightsCount > 14) {
                    apartmentPrice = (apartmentPrice * 0.90) * nightsCount;
                    studioPrice = (studioPrice * 0.80) * nightsCount;
                } else {
                    apartmentPrice = apartmentPrice * nightsCount;
                    studioPrice = studioPrice * nightsCount;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                if (nightsCount > 14){
                    apartmentPrice = (apartmentPrice * 0.90) * nightsCount;
                    studioPrice = studioPrice * nightsCount;
                }else {
                    apartmentPrice = apartmentPrice * nightsCount;
                    studioPrice = studioPrice * nightsCount;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
