import java.util.Scanner;

public class P05ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        int adultsCount = 0;
        int kidsCount = 0;
        int toysPrice = 0;
        int sweatersPrice = 0;
        while (!command.equals("Christmas")) {
            int familyMembersAge = Integer.parseInt(command);

            if (familyMembersAge <= 16) {
                kidsCount++;
                toysPrice = toysPrice + 5;
            } else {
                adultsCount++;
                sweatersPrice = sweatersPrice + 15;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n", adultsCount);
        System.out.printf("Number of kids: %d%n", kidsCount);
        System.out.printf("Money for toys: %d%n", toysPrice);
        System.out.printf("Money for sweaters: %d%n", sweatersPrice);
    }
}
