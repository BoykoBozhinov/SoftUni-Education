package ConditionalStatementsMore;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kmCount = Integer.parseInt(scanner.nextLine());
        String dayNightTravel = scanner.nextLine();

        double taxiDayPrice = 0.70 +(kmCount*0.79);
        double taxiNightPrice = 0.70 + (kmCount*0.90);
        double busDayPrice = 0.09 * kmCount;
        double trainNightPrice = kmCount * 0.06;

        if (kmCount >= 100) {
            System.out.printf("%.2f", trainNightPrice);
        }else if (kmCount >= 20){
            System.out.printf("%.2f", busDayPrice);
        }else if (dayNightTravel.equals("day")){
            System.out.printf("%.2f",taxiDayPrice);
        }else if(dayNightTravel.equals("night")){
            System.out.printf("%.2f", taxiNightPrice);
        }

    }
}
