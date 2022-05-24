import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int ednInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationNumber = 0;
        for (int n1 = startInterval; n1 <= ednInterval; n1++) {
            for (int n2 = startInterval; n2 <= ednInterval; n2++) {
                combinationNumber++;
                int sum = n1 + n2;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationNumber, n1, n2, sum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combinationNumber, magicNumber);
    }
}
