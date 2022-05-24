import java.util.Scanner;

public class P12EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int sleepCount = Integer.parseInt(scanner.nextLine());

        int sleepPrice = 0;
        switch (destination) {
            case "France":
                switch (dates) {
                    case "21-23":
                        sleepPrice = 30;
                        break;
                    case "24-27":
                        sleepPrice = 35;
                        break;
                    case "28-31":
                        sleepPrice = 40;
                        break;
                }
                break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        sleepPrice = 28;
                        break;
                    case "24-27":
                        sleepPrice = 32;
                        break;
                    case "28-31":
                        sleepPrice = 39;
                        break;
                }
                break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        sleepPrice = 32;
                        break;
                    case "24-27":
                        sleepPrice = 37;
                        break;
                    case "28-31":
                        sleepPrice = 43;
                        break;
                }
                break;
        }
        double sum = sleepPrice * sleepCount;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, sum);
    }
}
