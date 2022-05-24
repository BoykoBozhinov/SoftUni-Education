package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stayDays = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0.0;
        double moneyForTrip = 0;

        switch (roomType) {
            case "room for one person":
                if (stayDays < 10){
                    price = 18;
                }else if (stayDays <=15){
                    price=18;
                }else {
                    price = 18;
                }
                break;
            case "apartment":
                if (stayDays<10){
                    price = 25*0.7;
                }else if (stayDays <=15){
                    price = 25 * 0.65;
                }else {
                    price = 25 * 0.5;
                }
                break;
            case "president apartment":
                if (stayDays<10){
                    price = 35 * 0.9;
                }else if (stayDays<=15){
                    price = 35 * 0.85;
                }else {
                    price = 35 * 0.8;
                }
                break;
        }
        moneyForTrip =(stayDays - 1)*price;
        if (rating.equals("positive")){
            moneyForTrip= moneyForTrip * 1.25;
        }else if (rating.equals("negative")){
            moneyForTrip= moneyForTrip * 0.90;
        }
        System.out.printf("%.2f", moneyForTrip);
    }
}
