package NestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        for (int x1 = numOne; x1 <= numTwo; x1++) {
            int currentNum = x1;

            int sumEven = 0;
            int sumOdd = 0;
            for (int i = 6; i >= 1; i--) {
                int digit = currentNum % 10;

                if (i % 2 == 0) {
                    sumEven = sumEven + digit;
                } else {
                    sumOdd = sumOdd + digit;
                }
                currentNum = currentNum / 10;
            }
            if (sumEven == sumOdd) {
                System.out.print(x1 + " ");
            }
        }
    }
}
