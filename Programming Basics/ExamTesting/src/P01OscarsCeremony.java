import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallRent = Integer.parseInt(scanner.nextLine());

        double figurines = hallRent * 0.70;
        double catering = figurines * 0.85;
        double sounds = catering / 2;

        double expenses = hallRent + figurines + catering + sounds;

        System.out.printf("%.2f", expenses);

    }
}
