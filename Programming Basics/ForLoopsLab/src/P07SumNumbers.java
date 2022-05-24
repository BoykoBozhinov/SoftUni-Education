import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int num = 1; num <= numbersCount; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }
        System.out.println(sum);
    }
}
