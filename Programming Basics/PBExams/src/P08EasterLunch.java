import java.util.Scanner;

public class P08EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreadCount = Integer.parseInt(scanner.nextLine());
        int eggsCount = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double eastBreadSum = easterBreadCount * 3.20;
        double eggsSum = eggsCount * 4.35;
        double cookiesSum = cookiesKg * 5.40;
        double eggsPaint = eggsCount * 12 * 0.15;
        double grandmaDues = eastBreadSum + eggsSum + cookiesSum + eggsPaint;
        System.out.printf("%.2f", grandmaDues);
    }
}
