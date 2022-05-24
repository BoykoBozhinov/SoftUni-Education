package BasicSyntax;

import java.util.Scanner;

public class P12EvenNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        while (true) {
            if (number % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(number));
                break;
            } else {
                System.out.println("Please write an even number.");
                number = Integer.parseInt(sc.nextLine());
            }
        }
    }
}
