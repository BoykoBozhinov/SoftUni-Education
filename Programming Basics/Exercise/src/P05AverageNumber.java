import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        double num = 0;
        double averageNum = 0;
        for (int i = number; i >= 1; i--) {
            double nextNumber = Integer.parseInt(scanner.nextLine());
            num += nextNumber;
            averageNum = num / number;
        }
        System.out.printf("%.2f", averageNum);
    }
}
