import java.util.Scanner;

public class P10EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scanner.nextLine());
        double platePersonPrice = Double.parseDouble(scanner.nextLine());
        double desiBudged = Double.parseDouble(scanner.nextLine());

        if (guestsCount > 20) {
            platePersonPrice = platePersonPrice * 0.75;
        } else if (guestsCount > 15) {
            platePersonPrice = platePersonPrice * 0.80;
        } else if (guestsCount >= 10) {
            platePersonPrice = platePersonPrice * 0.85;
        }
        double cakePrice = desiBudged * .10;
        double totalSum = guestsCount * platePersonPrice + cakePrice;
        double diff = Math.abs(totalSum - desiBudged);

        if (desiBudged > totalSum) {
            System.out.printf("It is party time! %.2f leva left.", diff);
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
