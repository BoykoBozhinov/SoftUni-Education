import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num = 1; num <= n; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
